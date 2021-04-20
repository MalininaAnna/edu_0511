/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scan.nextInt();
        System.out.println("Введите b");
        int b = scan.nextInt();
        int c = a/b;
        int d = a%b;
        if (a%b==0) System.out.println("Делится "+c);
        else System.out.println("Делится с остатком "+d);

    }
}
