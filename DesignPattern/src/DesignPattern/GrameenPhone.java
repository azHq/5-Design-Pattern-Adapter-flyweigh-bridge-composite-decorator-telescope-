package DesignPattern;

public class GrameenPhone extends MobilePhoneOperator{
	
	public GrameenPhone() {
		
	}
	
	@Override
	public double pickHour(int timeDuration) {
		
		return timeDuration*.15;
	}

	@Override
	public double offHour(int timeDuration) {
		
		
		return timeDuration*.50;
	}

	@Override
	public double onHour(int timeDuration) {
		
		return timeDuration*.20;
	}

	@Override
	public double specailOfferHour(int timeDuration) {
		
		return timeDuration*.10;
	}


}
