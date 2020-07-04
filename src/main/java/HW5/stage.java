package HW5;

public abstract class stage {

    protected int length;
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract void go(car c);
}