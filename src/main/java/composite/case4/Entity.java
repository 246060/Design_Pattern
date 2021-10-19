package composite.case4;

abstract public class Entity {

    protected static StringBuffer indent = new StringBuffer();
    protected static int level = 1;

    public abstract void traverse(int[] levels);

    protected boolean printthisLevel(int[] levels) {
        for (int value : levels) {
            if (level == value) {
                return true;
            }
        }
        return false;
    }
}
