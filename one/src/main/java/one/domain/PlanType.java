package one.domain;

public enum PlanType {
	PLANA("planA", Long.valueOf(10000), Long.valueOf(120)), PLANB("planB", Long.valueOf(15000), Long.valueOf(132));
	
	PlanType(String name, Long planPremium, Long priceSqft) {
		this.planName = name;
		this.premium = planPremium;
		this.pricePerSqft = priceSqft;
	}

	public String getPlanName() {
		return planName;
	}

	public Long getPremium() {
		return premium;
	}
	public Long getPricePerSqft(){
		return pricePerSqft;
	}

	private String planName;
	private Long premium;
	private Long pricePerSqft;

}
