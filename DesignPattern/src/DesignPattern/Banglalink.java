package DesignPattern;

public class Banglalink extends MobilePhoneOperator{
	
	public Banglalink() {
		
	}

	@Override
	public double pickHour(int timeDuration) {
		
		return timeDuration*.25;
	}

	@Override
	public double offHour(int timeDuration) {
		
		
		return timeDuration*.50;
	}

	@Override
	public double onHour(int timeDuration) {
		
		return timeDuration*.40;
	}

	@Override
	public double specailOfferHour(int timeDuration) {
		
		return timeDuration*.20;
	}

	

	

}
