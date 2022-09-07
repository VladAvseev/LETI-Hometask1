public class Main {
    public static void main(String[] args) {
       final int a = 3, b = 12, c = 5;

       double discriminant = b * b - 4 * a * c;

       if (discriminant < 0) {
           System.out.println("Уравнение не имеет корней");
       } else if (discriminant == 0) {
           float x;
           x = (float) -b / (2 * a);
           System.out.print("Уравнение имеет один корень х = ");
           System.out.println(x);
       } else {
           double x1, x2;
           x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
           x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
           System.out.print("Уравнение имеет два корня х1 = ");
           System.out.println(x1);
           System.out.print(" х2 = ");
           System.out.println(x2);
       }
    }
}