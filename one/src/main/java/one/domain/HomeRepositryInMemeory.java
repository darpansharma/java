package one.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class HomeRepositryInMemeory implements HomeRepository {

	private static List<Home> homes = new ArrayList<>();
	private static List<Comunity> communities = new ArrayList<>();
	static {
		HomePlanFractory homePlanFractory = new HomePlanFractory();
		Comunity c1 = new Comunity("EastSide", Long.valueOf(10000));
		Comunity c2 = new Comunity("NorthSide", Long.valueOf(15000));
		Comunity c3 = new Comunity("NorthEastSide", Long.valueOf(13000));
		communities.add(c1);
		communities.add(c2);
		communities.add(c3);

		Home home = homePlanFractory.getHomeAsPerPlan(PlanType.PLANA, c1);
		home.setReadyToMoveInDate(Calendar.getInstance());
		homes.add(home);
		home = homePlanFractory.getHomeAsPerPlan(PlanType.PLANA, c2);
		home.setReadyToMoveInDate(Calendar.getInstance());
		homes.add(home);
		home = homePlanFractory.getHomeAsPerPlan(PlanType.PLANB, c1);
		home.setReadyToMoveInDate(Calendar.getInstance());
		homes.add(home);
		home = homePlanFractory.getHomeAsPerPlan(PlanType.PLANB, c2);
		home.setReadyToMoveInDate(Calendar.getInstance());
		homes.add(home);
	}

	@Override
	public List<Home> search(Calendar availableOnDate) {
		return homes.stream().filter(home -> home.isAvailableOn(availableOnDate)).collect(Collectors.toList());

	}

}
