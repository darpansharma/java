package one.domain;

public class Room {
	private Long sqft = Long.valueOf(0);

	public Room(Long size) {
		this.sqft = size;
	}

	public Long size() {
		return sqft;
	}
}
