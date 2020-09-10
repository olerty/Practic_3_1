import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите диаметр окружности: ");
        circle.setDiametr(in.nextInt());

        System.out.println("Введите радиус окружности: ");
        circle.setRadius(in.nextInt());

        System.out.println("Введите площадь окружности: ");
        circle.setArea(in.nextInt());

        System.out.println(circle.getDiametr() + " " + circle.getRadius() + " " + circle.getArea());
    }
}
