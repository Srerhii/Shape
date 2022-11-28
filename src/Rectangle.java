public class Rectangle extends Shape{
    public int per;
    public int sidR_1;
    public int sidR_2;


    public Rectangle(int sidR_1, int sidR_2) {
        this.sidR_1 = sidR_1;
        this.sidR_2 = sidR_2;

    }

    @Override
    public int Perimeter() {
    return per=(sidR_1+sidR_2)*2;
    }
}
