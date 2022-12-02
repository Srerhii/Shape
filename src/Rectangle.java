public class Rectangle extends Shape {
    public int perimeter;
    public int sideRectangle_1;
    public int sideRectangle_2;


    public Rectangle(int sideRectangle_1, int sideRectangle_2) {
        this.sideRectangle_1 = sideRectangle_1;
        this.sideRectangle_2 = sideRectangle_2;

    }

    @Override
    public String ShapeName() {
        String name = "Perimeter rectangle =";
        return name;
    }

    @Override
    public int Perimeter() {
        return perimeter = (sideRectangle_1 + sideRectangle_2) * 2;
    }
}
