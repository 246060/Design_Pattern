package object_pool.case3;

import object_pool.case3.ReusablePool.OliphauntPool;

public class Client {

	public static void main(String[] args) {

		var pool = new OliphauntPool();

		var oliphaunt1 = pool.checkOut();
		System.out.println(pool);

		var oliphaunt2 = pool.checkOut();
		System.out.println(pool);

		var oliphaunt3 = pool.checkOut();
		System.out.println(pool);

		pool.checkIn(oliphaunt1);
		System.out.println(pool);

		pool.checkIn(oliphaunt2);
		System.out.println(pool);

		var oliphaunt4 = pool.checkOut();
		System.out.println(pool);

		var oliphaunt5 = pool.checkOut();
		System.out.println(pool);
	}
}
