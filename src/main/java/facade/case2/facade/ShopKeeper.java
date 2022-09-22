package facade.case2.facade;

import facade.case2.subsystem.Blackberry;
import facade.case2.subsystem.Iphone;
import facade.case2.subsystem.Samsung;
import facade.case2.subsystem.MobileShop;

public class ShopKeeper {

	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;

	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void blackberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}
}
