package sen;

interface PurchaseableItem{
	String currency="RS";
	void price();
	static void description() {
		System.out.print("This item is purcheshable");
			}
	default void OnlineAvaliable() {
		description();
		System.out.println("\t Online");
	}
	default void OfflineAvaliable() {
		description();
		System.out.println("\t Offline");
	}
	default void madeIn() {
		System.out.println("product made in India");
	}
}
abstract class Mobile implements PurchaseableItem
{
	public Mobile() {
		System.out.println("Mobile Object is creating");
	}
	abstract void batteryVoltage();
	abstract void cameraMegaPixel();
}

class SamsungMobile extends Mobile{
	public SamsungMobile() {
		System.out.println("Samsung Mobile Object is creating");
	}

	@Override
	public void price() {
		//currency="$";
		System.out.println("price = 21000"+currency);
		
	}

	void batteryVoltage() {
		System.out.println("Mobile battery voltage=5000mah");
	}

	@Override
	void cameraMegaPixel() {
		System.out.println("Mobile camera has 100 mega pixels");
	}
	
}
class RedmiMobile extends Mobile{

	public RedmiMobile() {
		System.out.println("Redmi mobile object is creating");
	}
	@Override
	public void price() {
		System.out.println("price = 7000"+currency);
		
	}
	@Override
	void batteryVoltage() {
		System.out.println("Mobile battery voltage=4200mah");
	}

	@Override
	void cameraMegaPixel() {
		System.out.println("Mobile camera has 64 mega pixels");
	}
	
}

public class RunTimePolimorphismConcept {

	public RunTimePolimorphismConcept() {
		System.out.println("Main Class Constructing");
	}

	static public void main(String... m) {
		Mobile my_mobile=new SamsungMobile();
		my_mobile.batteryVoltage();
		my_mobile.cameraMegaPixel();
		my_mobile.price();
		my_mobile.OfflineAvaliable();
		
		my_mobile=new RedmiMobile();
		my_mobile.batteryVoltage();
		my_mobile.cameraMegaPixel();
		my_mobile.price();
		
		PurchaseableItem mobile=new SamsungMobile();
		mobile.OnlineAvaliable();
		//mobile.description();
		mobile.madeIn();

	}

}
