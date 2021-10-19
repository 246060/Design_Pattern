package builder.case2;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void make() {
        builder.makeHeader("header");
        builder.makeBody("body");
        builder.makeFooter("footer");
    }

    public String getResult() {
        return builder.getResult();
    }
}
