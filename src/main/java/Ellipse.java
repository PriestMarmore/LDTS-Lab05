public class Ellipse extends Shape{
    private double xRadius;
    private double yRadius;

    public Ellipse(double xRadius, double yRadius){
        this.xRadius = xRadius;
        this.yRadius = yRadius;
    }
    public double getXRadius(){
        return xRadius;
    }
    public double getYRadius(){
        return yRadius;
    }
}
