import java.util.List;
import java.util.ArrayList;

public class AreaAggregator {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double calculateTotalArea() {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape.getClass().equals(Circle.class)) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            } else if (shape.getClass().equals(Square.class)) {
                sum += Math.pow(((Square) shape).getSide(), 2);
            } else if (shape.getClass().equals(Ellipse.class)) {
                sum += Math.PI * ((Ellipse) shape).getXRadius() * ((Ellipse) shape).getYRadius();
            } else if (shape.getClass().equals(Rectangle.class)){
                sum += ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
            }
        }
        return sum;
    }
}