package one.domain;

import java.util.ArrayList;
import java.util.List;

public class HomePlanFractory {
	public Home getHomeAsPerPlan(PlanType planType, Comunity inComunity){
		List<Room> rooms = new ArrayList<>();
		switch (planType) {
		case PLANA:
			rooms.add(new Room(Long.valueOf(120)));
			rooms.add(new Room(Long.valueOf(144)));
			rooms.add(new Room(Long.valueOf(300)));
			return new Home(inComunity,  planType.getPricePerSqft(), planType.getPremium(), rooms);

		case PLANB:
			rooms.add(new Room(Long.valueOf(120)));
			rooms.add(new Room(Long.valueOf(144)));
			rooms.add(new Room(Long.valueOf(150)));
			rooms.add(new Room(Long.valueOf(120)));
			rooms.add(new Room(Long.valueOf(144)));
			rooms.add(new Room(Long.valueOf(300)));
			return new Home(inComunity,  planType.getPricePerSqft(), planType.getPremium(), rooms);
		default:
			throw new RuntimeException("no plan implemented like "+planType);
		}
		
	}

}
