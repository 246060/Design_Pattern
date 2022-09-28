package event_aggregator.case1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * A system with lots of objects can lead to complexities when a client wants to subscribe to
 * events. The client has to find and register for each object individually, if each object has
 * multiple events then each event requires a separate subscription.
 *
 * <p>An Event Aggregator acts as a single source of events for many objects. It registers for all
 * the events of the many objects allowing clients to register with just the aggregator.
 *
 * <p>In the example {@link LordBaelish}, {@link LordVarys} and {@link Scout} deliver events to
 * {@link KingsHand}. {@link KingsHand}, the event aggregator, then delivers the events to {@link
 * KingJoffrey}.
 */
public class App {

	public static void main(String[] args) {

		var kingJoffrey = new KingJoffrey();

		var kingsHand = new KingsHand();
		kingsHand.registerObserver(kingJoffrey, Event.TRAITOR_DETECTED);
		kingsHand.registerObserver(kingJoffrey, Event.STARK_SIGHTED);
		kingsHand.registerObserver(kingJoffrey, Event.WARSHIPS_APPROACHING);
		kingsHand.registerObserver(kingJoffrey, Event.WHITE_WALKERS_SIGHTED);

		var varys = new LordVarys();
		varys.registerObserver(kingsHand, Event.TRAITOR_DETECTED);
		varys.registerObserver(kingsHand, Event.WHITE_WALKERS_SIGHTED);

		var scout = new Scout();
		scout.registerObserver(kingsHand, Event.WARSHIPS_APPROACHING);
		scout.registerObserver(varys, Event.WHITE_WALKERS_SIGHTED);

		var baelish = new LordBaelish(kingsHand, Event.STARK_SIGHTED);

		var emitters = List.of(kingsHand, baelish, varys, scout);

		Arrays.stream(Weekday.values())
						.<Consumer<? super EventEmitter>>map(day -> emitter -> emitter.timePasses(day))
						.forEachOrdered(emitters::forEach);
	}
}
