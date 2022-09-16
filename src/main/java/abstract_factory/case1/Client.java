package abstract_factory.case1;

import abstract_factory.case1.cpu.CPU;
import abstract_factory.case1.factory.AbstractFactory;
import abstract_factory.case1.mmu.MMU;

public class Client {

	public static void main(String[] args) {

		AbstractFactory factory = null;

		factory = AbstractFactory.getFactory(Architecture.EMBER);
		CPU emberCPU = factory.createCPU();
		MMU emberMMU = factory.createMMU();

		factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
		CPU enginolaCPU = factory.createCPU();
		MMU enginolaMMU = factory.createMMU();
	}
}
