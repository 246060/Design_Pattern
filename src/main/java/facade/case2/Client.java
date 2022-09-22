package facade.case2;

import facade.case2.facade.ShopKeeper;

public class Client {

	public static void main(String[] args) {

		ShopKeeper shopKeeper = new ShopKeeper();

		System.out.println();
		shopKeeper.iphoneSale();

		System.out.println();
		shopKeeper.samsungSale();

		System.out.println();
		shopKeeper.blackberrySale();
	}
}
