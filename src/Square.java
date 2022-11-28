public class Square extends Shape {
    public int per;
    public int sidS_1;


    public Square(int sidS_1) {
        this.sidS_1 = sidS_1;

    }

    @Override
    public int Perimeter() {
    return per=sidS_1*4;
    }
}
