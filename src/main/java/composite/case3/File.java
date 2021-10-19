package composite.case3;

public class File implements Base {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(Client.compositeBuilder + name);
    }
}
