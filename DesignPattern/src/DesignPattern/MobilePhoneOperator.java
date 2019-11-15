package DesignPattern;

public abstract class MobilePhoneOperator {
	
	public double generateBill(int[] arr) {
		
	
		return pickHour(arr[0])+offHour(arr[1])+onHour(arr[2])+specailOfferHour(arr[3]);
		
	}
	public abstract  double pickHour(int timeDuration);
	public abstract  double offHour(int timeDuration);
	public abstract  double onHour(int timeDuration);
	public abstract  double specailOfferHour(int timeDuration);
}
