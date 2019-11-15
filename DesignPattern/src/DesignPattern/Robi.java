package DesignPattern;

public class Robi extends MobilePhoneOperator{

	public Robi() {
		
	}
	
	@Override
	public double pickHour(int timeDuration) {
		
		return timeDuration*.50;
	}

	@Override
	public double offHour(int timeDuration) {
		
		
		return timeDuration*.80;
	}

	@Override
	public double onHour(int timeDuration) {
		
		return timeDuration*.60;
	}

	@Override
	public double specailOfferHour(int timeDuration) {
		
		return timeDuration*.40;
	}

}
