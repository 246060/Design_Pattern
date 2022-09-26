package filter.case2;

import filter.case2.ConcreteCriteria.SimpleProbabilisticThreatAwareSystem;
import filter.case2.ConcreteCriteria.SimpleThreatAwareSystem;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		filteringSimpleThreats();
		filteringSimpleProbableThreats();
	}

	private static void filteringSimpleProbableThreats() {
		System.out.println("### Filtering ProbabilisticThreatAwareSystem by probability ###");


		var trojanArcBomb = new SimpleProbableThreat("Trojan-ArcBomb", 1, ThreatType.TROJAN, 0.99);
		var rootkit = new SimpleProbableThreat("Rootkit-Kernel", 2, ThreatType.ROOTKIT, 0.8);

		List<ProbableThreat> probableThreats = List.of(trojanArcBomb, rootkit);


		var probabilisticThreatAwareSystem = new SimpleProbabilisticThreatAwareSystem("Sys-1", probableThreats);
		System.out.println("Filtering ProbabilisticThreatAwareSystem. Initial : " + probabilisticThreatAwareSystem);

		var filteredThreatAwareSystem =
						probabilisticThreatAwareSystem.filtered().by(probableThreat -> Double.compare(probableThreat.probability(), 0.99) == 0);

		System.out.println("Filtered by probability = 0.99 : " + filteredThreatAwareSystem);
	}

	private static void filteringSimpleThreats() {
		System.out.println("### Filtering ThreatAwareSystem by ThreatType ###");


		var rootkit = new SimpleThreat(ThreatType.ROOTKIT, 1, "Simple-Rootkit");
		var trojan = new SimpleThreat(ThreatType.TROJAN, 2, "Simple-Trojan");

		List<Threat> threats = List.of(rootkit, trojan);


		var threatAwareSystem = new SimpleThreatAwareSystem("Sys-1", threats);
		System.out.println("Filtering ThreatAwareSystem. Initial : " + threatAwareSystem);

		var rootkitThreatAwareSystem =
						threatAwareSystem.filtered().by(threat -> threat.type() == ThreatType.ROOTKIT);

		System.out.println("Filtered by threatType = ROOTKIT : " + rootkitThreatAwareSystem);
	}

}
