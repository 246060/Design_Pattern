package memento.case2;

public class Life {

    private String time;

    public void setTime(String time) {
        System.out.println("Setting time to " + time);
        this.time = time;
    }

    public Memento save() {
        System.out.println("Saving time to Memento");
        return new Memento(time);
    }

    public void restore(Memento m) {
        time = m.getTime();
        System.out.println("Time restored from Memento : " + time);
    }

    public static class Memento {

        private final String time;

        public Memento(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }
    }
}
