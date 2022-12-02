public class Triangle extends Shape {
    public int perimeter;
    public int sideTriangle_1;
    public int sideTriangle_2;
    public int sideTriangle_3;


    public Triangle(int sideTriangle_1, int sideTriangle_2, int sideTriangle_3) throws Exception {

        if (sideTriangle_1 > (sideTriangle_2 + sideTriangle_3)) {
            throw new Exception("Не существующая 1 сторона");
        }
        if (sideTriangle_2 > (sideTriangle_1 + sideTriangle_3)) {
            throw new Exception("Не существующая 2 сторона");
        }
        if (sideTriangle_3 > (sideTriangle_2 + sideTriangle_1)) {
            throw new Exception("Не существующая 3 сторона");
        }


        this.sideTriangle_1 = sideTriangle_1;
        this.sideTriangle_2 = sideTriangle_2;
        this.sideTriangle_3 = sideTriangle_3;
    }

    public String Exception() {
        if (sideTriangle_3 < sideTriangle_1 + sideTriangle_2 ||
                sideTriangle_2 < sideTriangle_1 + sideTriangle_3 ||
                sideTriangle_1 < sideTriangle_3 + sideTriangle_2) ;
        return "Не существующий треугольник";
    }


    @Override
    public String ShapeName() {

        String name = "Perimeter triangle =";
        return name;
    }

    @Override
    public int Perimeter() {
        return perimeter = sideTriangle_1 + sideTriangle_2 + sideTriangle_3;

    }
}
