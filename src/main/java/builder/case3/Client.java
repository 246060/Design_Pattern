package builder.case3;

public class Client {

    public static void main(String[] args) {

        Computer computer = new Computer
                .ComputerBuilder()
                .cpu("i9")
                .disk(256)
                .build();

        System.out.println(computer);
    }
}
