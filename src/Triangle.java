public class Triangle extends Shape {
    public int per;

    public int sidT_1;
    public int sidT_2;
    public int sidT_3;
    public Triangle(int sidT_1, int sidT_2, int sidT_3) {

        this.sidT_1 = sidT_1;
        this.sidT_2 = sidT_2;
        if (sidT_3 < sidT_1 + sidT_2) {
            this.sidT_3 = sidT_3;
        } else {
            this.sidT_3 = 0;
            this.sidT_1 = 0;
            this.sidT_2=0;
        }
    }
    @Override
    public int Perimeter() {
        return per = sidT_1 + sidT_2 + sidT_3;

    }
}
