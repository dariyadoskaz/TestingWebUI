/*
Напишите функцию, вычисляющую площадь треугольника по трём сторонам (int a, int b, int c).
Разместите класс с функцией в src/main/java.
*/

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the 1st side:");
        a = sc.nextInt();

        System.out.println("Enter the 2nd side:");
        b = sc.nextInt();

        System.out.println("Enter the 3rd side:");
        c = sc.nextInt();

        sc.close();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {

            double s = (a + b + c) / 2;

            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of Triangle is: " + area);
        }
        else {
            System.out.println("The triangle with entered dimensions does not exist");
        }
    }
}
