public class Polygon extends Shape {
    public int perimeter;
    public int amountSide;
    public int sidePolygon_1;


    public Polygon(int amountSide, int sidePolygon_1) {
        this.amountSide = amountSide;
        this.sidePolygon_1 = sidePolygon_1;

    }

    @Override
    public String ShapeName() {

        String name = "Perimeter polygon =";
        return name;
    }

    @Override
    public int Perimeter() {
        return perimeter = sidePolygon_1 * amountSide;
    }
}
