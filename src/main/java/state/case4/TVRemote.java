package state.case4;

public class TVRemote {

    // https://www.journaldev.com/1751/state-design-pattern-java
    public static void main(String[] args) {

        TVContext context = new TVContext();

        context.setState(new TVStartState());
        context.doAction();

        context.setState(new TVStopState());
        context.doAction();
    }
}
