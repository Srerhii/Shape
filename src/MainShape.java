public class MainShape {
    public static void main(String[] args) {

        Shape triangle = new Triangle(1, 10, 7);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(2,4);
        Shape polygon = new Polygon(5);
        Shape polygon1 = new Polygon(7);

        int a=triangle.Perimeter();
        int b=square.Perimeter();
        int c=rectangle.Perimeter();
        int d=polygon.Perimeter();
        int e=polygon1.Perimeter();



        int calculatoin=0;
        int[] shapes = {a, b, c, d, e};
        for(int i=0;i<shapes.length;i++) {
            calculatoin = shapes[i];
            System.out.println(""+calculatoin);
        }

    }
}
