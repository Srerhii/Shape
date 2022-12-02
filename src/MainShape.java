public class MainShape {
    public static void main(String[] args) {

        try {
            int calculatoin = 0;


            Shape[] shapes = {
                    new Square(4),
                    new Rectangle(4, 2),
                    new Polygon(6, 5),
                    new Polygon(7, 4),
                    new Triangle(3, 2, 2),
            };

            for (int i = 0; i < shapes.length; i++) {
                calculatoin = shapes[i].Perimeter();

                System.out.println("" + calculatoin);
            }

            Shape a = new Square(4);
            Shape c = new Rectangle(4, 2);
            Shape d = new Polygon(6, 5);
            Shape e = new Polygon(7, 4);
            Shape b = new Triangle(3, 2, 2);

            System.out.println("" + a.ShapeName() + a.Perimeter() + "\n"
                     + c.ShapeName() + c.Perimeter() + "\n" + d.ShapeName() + d.Perimeter() + "\n"
                    + e.ShapeName() + e.Perimeter() + "\n" + b.ShapeName() + b.Perimeter());
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}


//   System.out.println(""+a.ShapeName()+a.Perimeter());
//           System.out.println(""+b.ShapeName()+b.Perimeter());
//           System.out.println(""+c.ShapeName()+c.Perimeter());
//           System.out.println(""+d.ShapeName()+d.Perimeter());
//           System.out.println(""+e.ShapeName()+e.Perimeter());


//    int a=triangle.Perimeter();
//        int b=square.Perimeter();
//        int c=rectangle.Perimeter();
//        int d=polygon.Perimeter();
//        int e=polygon1.Perimeter();
//Shape triangle = new Triangle(1, 10, 7);
//        Shape square = new Square(4);
//        Shape rectangle = new Rectangle(2,4);
//        Shape polygon = new Polygon(5);
//        Shape polygon1 = new Polygon(7);