package akash.designPattern.creation.factory.ex1;

public class Test {
    public static void main(String[] args) {

        Point point = Point.Factory.newCartesianPoint(1, 2);
        Point point1 = Point.Factory.newPolarPoint(1, 2);
        System.out.println(point);
        System.out.println(point1);
    }
}
