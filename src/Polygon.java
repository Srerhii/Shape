public class Polygon extends Shape{
    public int per;
    public int sidP_1;


    public Polygon(int sidP_1) {
        this.sidP_1 = sidP_1;

    }

    @Override
    public int Perimeter() {
    return per=sidP_1*5;
    }
}
