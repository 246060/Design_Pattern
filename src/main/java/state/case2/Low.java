package state.case2;

public class Low extends State {

    public void pull(Chain wrapper) {
        wrapper.setState(new Medium());
        System.out.println("   medium speed");
    }
}
