package composite.case3;

import java.util.ArrayList;

public class Directory implements Base {
    private String name;
    private ArrayList<Base> includeFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Base base) {
        includeFiles.add(base);
    }

    @Override
    public void ls() {
        System.out.println(Client.compositeBuilder + name);
        Client.compositeBuilder.append("   ");

        for (Base base : includeFiles) {
            base.ls();
        }
    }
}
