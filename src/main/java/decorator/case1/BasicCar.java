package decorator.case1;


// Component Implementation
public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
