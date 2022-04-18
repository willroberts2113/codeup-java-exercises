package oop.shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int lengthToSet, int widthToSet){
        this.length = lengthToSet;
        this.width = widthToSet;
    }

    public Quadrilateral() {

    }
}
