package abstract_factory.case1.factory;

import abstract_factory.case1.cpu.CPU;
import abstract_factory.case1.cpu.EmberCPU;
import abstract_factory.case1.mmu.EmberMMU;
import abstract_factory.case1.mmu.MMU;

public class EnginolaFactory extends AbstractFactory {

    @Override
    public CPU createCPU() {
        System.out.println("Enginola CPU 생성");
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        System.out.println("Enginola MMU 생성");
        return new EmberMMU();
    }
}
