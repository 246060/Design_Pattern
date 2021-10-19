package state.case2;

public class State {

    public void pull(Chain wrapper) {
        wrapper.setState(new Off());
        System.out.println("   turning off");
    }
}
