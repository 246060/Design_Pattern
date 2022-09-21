package adapter.case1;

import adapter.case1.adaptee.RoundHole;
import adapter.case1.adapter.SquarePegAdapter;

public class Client {

	public static void main(String[] args) {
/**
 * 구성을 이용한 Object Adapter 방식
 * 예전 버전을 재사용
 * */

		RoundHole roundHole = new RoundHole(5);
		SquarePegAdapter squarePegAdapter;

		for (int i = 6; i < 10; i++) {
			squarePegAdapter = new SquarePegAdapter((double) i);

			// The client uses (is coupled to) the new interface
			squarePegAdapter.makeFit(roundHole);
		}
	}
}
