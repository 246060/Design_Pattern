package composite.case4;

import java.util.ArrayList;
import java.util.List;

public class Box extends Entity {
    private List<Entity> children = new ArrayList();
    private int value;

    public Box(int value) {
        this.value = value;
    }

    public void add(Entity entity) {
        children.add(entity);
    }

    @Override
    public void traverse(int[] levels) {

        if (printthisLevel(levels)) {
            System.out.println(indent.toString() + value);
            indent.append("   ");
        }

        level++;

        for (Entity child : children) {
            child.traverse(levels);
        }

        level--;

        if (printthisLevel(levels)) {
            indent.setLength(indent.length() - 3);
        }
    }
}
