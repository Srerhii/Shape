public class Square extends Shape {
    public int perimeter;
    public int sideSquare_1;


    @Override
    public String ShapeName() {

        String name = "Perimeter square =";
        return name;
    }

    public Square(int sideSquare_1) {
        this.sideSquare_1 = sideSquare_1;

    }

    @Override
    public int Perimeter() {
        return perimeter = sideSquare_1 * 4;
    }
}
