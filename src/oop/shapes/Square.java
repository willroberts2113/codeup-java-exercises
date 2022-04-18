package oop.shapes;

public class Square extends Quadrilateral {

    public Square(int side){
        super(side, side);
    }

    @Override
    public double getPerimeter(){
        System.out.println("square");
        return this.width * 4;
    }

    @Override
    public double getArea(){
        return (int) Math.pow(this.length, 2);
    }


    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
