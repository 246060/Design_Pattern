package builder.case2;

public class Client {
    public static void main(String[] args) {

        Director director = new Director(new PlainTextBuilder());

        director.make();
        String result = director.getResult();
        System.out.println(result);
    }
}
