package double_dispatch.case1;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * When a message with a parameter is sent to an object, the resultant behaviour is defined by the implementation of that method in the receiver.
 * 매개변수가 있는 메시지가 객체로 전송될 때 결과 동작은 수신기에서 해당 메서드의 구현에 의해 정의됩니다.
 * Sometimes the behaviour must also be determined by the type of the parameter.
 * 때때로 동작은 매개변수의 유형에 의해 결정되어야 합니다.
 * <p>
 * One way to implement this would be to create multiple instanceof-checks for the methods parameter.
 * 이를 구현하는 한 가지 방법은 methods 매개변수에 대해 여러 instanceof-checks를 만드는 것입니다.
 * However, this creates a maintenance issue.
 * 그러나 이로 인해 유지 관리 문제가 발생합니다.
 * When new types are added we would also need to change the method's implementation and add a new instanceof-check.
 * 새로운 유형이 추가되면 메소드의 구현을 변경하고 새로운 instanceof-check를 추가해야 합니다.
 * This violates the single responsibility principle - a class should have only one reason to change.
 * 이것은 단일 책임 원칙에 위배됩니다. 클래스는 변경해야 하는 이유가 단 하나여야 합니다.
 * <p>
 * Instead of the instanceof-checks a better way is to make another virtual call on the parameter object.
 * instanceof-checks 대신에 더 나은 방법은 매개변수 객체에 대해 또 다른 가상 호출을 하는 것입니다.
 * This way new functionality can be easily added without the need to modify existing implementation (open-closed principle).
 * 이러한 방식으로 기존 구현을 수정할 필요 없이 새로운 기능을 쉽게 추가할 수 있습니다(open-closed principle).
 * <p>
 * In this example we have hierarchy of objects (GameObject) that can collide to each other.
 * 이 예제에는 서로 충돌할 수 있는 객체(GameObject) 계층이 있습니다.
 * Each object has its own coordinates which are checked against the other objects'coordinates.
 * 각 개체에는 다른 개체의 좌표와 비교하여 확인되는 고유한 좌표가 있습니다.
 * If there is an overlap, then the objects collide utilizing the Double Dispatch pattern.
 * 겹침이 있으면 Double Dispatch 패턴을 사용하여 개체가 충돌합니다.
 */
@Slf4j
public class App {

	public static void main(String[] args) {

		// initialize game objects and print their status
		var objects = List.of(
						new FlamingAsteroid(0, 0, 5, 5),
						new SpaceStationMir(1, 1, 2, 2),
						new Meteoroid(10, 10, 15, 15),
						new SpaceStationIss(12, 12, 14, 14)
		);

		objects.forEach(o -> log.info(o.toString()));
		log.info("");


		// collision check
		objects.forEach(o1 -> objects.forEach(o2 -> {
			if (o1 != o2 && o1.intersectsWith(o2)) {
				o1.collision(o2);
			}
		}));
		log.info("");


		// output eventual object statuses
		objects.forEach(o -> log.info(o.toString()));
		log.info("");
	}
}
