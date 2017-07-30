package one.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comunity {
	private String name;
	private Long communityPremium;
	private List<Home> homes = new ArrayList<>();

	public Comunity(String name, Long communityPremium) {
		super();
		this.name = name;
		this.communityPremium = communityPremium;
	}

	public String getName() {
		return name;
	}

	public Long getCommunityPremium() {
		return communityPremium;
	}

	public void addHome(Home home) {
		this.homes.add(home);
	}

	public Collection<Home> getHomes() {
		return Collections.unmodifiableCollection(homes);
	}

}
