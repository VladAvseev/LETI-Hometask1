public class Main {
    public static void main(String[] args) {
        equation();
        //enter table size as arg
        table(5);
    }

    public static void equation() {
        final int a = 3, b = 13, c = -2;

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            if (b != 0) {
                float x = -c / b;
                System.out.println("Уравнение имеет один корень х = " + x);
            } else if (b == 0 && c != 0){
                System.out.println("Уравнение не имеет корней");
            } else {
                System.out.println("Уравнение имеет бесконечное число корней");
            }
        } else if (discriminant < 0) {
            System.out.println("Уравнение не имеет корней");
        } else if (discriminant == 0) {
            float x;
            x = (float) -b / (2 * a);
            System.out.println("Уравнение имеет один корень х = " + x);
        } else {
            double x1, x2;
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Уравнение имеет два корня: х1 = " + x1 + " x2 = " + x2);
        }
    }

    public static void table(int size) {
        final int maxNumber = size * size;
        final int maxNumberLength = String.valueOf(maxNumber).length() + 1;

        System.out.println("Таблица уможения:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j * i);
                String space = " ".repeat(maxNumberLength - (String.valueOf(j * i).length()));
                System.out.print(space);
            }
            System.out.println();
        }

    }
}