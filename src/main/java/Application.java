public class Application {
    public static void main(String[] args){
        AreaAggregator aggregator = new AreaAggregator();

        /**/
        aggregator.addShape(new Circle(3.5));
        aggregator.addShape(new Circle(2));
        aggregator.addShape(new Square(4));
        aggregator.addShape(new Ellipse(4, 5));
        aggregator.addShape(new Rectangle(3, 4));

        AreaStringOutputter stringOutputter = new AreaStringOutputter(aggregator);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(aggregator);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());
    }
}

