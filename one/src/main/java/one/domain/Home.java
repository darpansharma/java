package one.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Home {
	private List<Room> rooms = new ArrayList<>();
	private Long priceSqft = Long.valueOf(0);
	private Calendar readyToMoveInDate = null;
	private Long homePremium = Long.valueOf(0);
	private Comunity comunity;

	public Home(Comunity comunity, Long priceSqft, Long premium) {
		this.comunity = comunity;
		this.priceSqft = priceSqft;
		this.homePremium = premium;
		comunity.addHome(this);
	}
	public Home(Comunity comunity, Long priceSqft, Long premium, List<Room> rooms) {
		this(comunity,priceSqft,premium);
		this.rooms.addAll(rooms);
	}
	public Boolean willBeReadyOnDate(Calendar calendar) {
		if (readyToMoveInDate == null) {
			return Boolean.FALSE;
		}
		if (this.readyToMoveInDate.before(calendar)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Calendar getReadyToMoveInDate() {
		return readyToMoveInDate;
	}

	public void setReadyToMoveInDate(Calendar readyToMoveInDate) {
		this.readyToMoveInDate = readyToMoveInDate;
	}

	public Long price() {
		return priceSqft * houseSize() + homePremium + comunity.getCommunityPremium();
	}

	public Long houseSize() {
		Long houseSize = Long.valueOf(0);
		for (Room room : rooms) {
			houseSize += room.size();
		}
		return houseSize;
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}
	
	public Boolean isAvailableOn(Calendar date){
		if (readyToMoveInDate.before(date)){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
