/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите cумму вклада");
        int a = scan.nextInt();
        System.out.println("Введите процент");
        int b = scan.nextInt();

        int term1 = a*b/100+a;
        int term2 = term1*b/100+term1;
        int term3 = term2*b/100+term2;
        int term4 = term3*b/100+term3;
        int term5 = term4*b/100+term4;
        System.out.println("Сумма вклада с процентами за первый год "+term1);
        System.out.println("Сумма вклада с процентами за второй год "+term2);
        System.out.println("Сумма вклада с процентами за третий год "+term3);
        System.out.println("Сумма вклада с процентами за четвертый год "+term4);
        System.out.println("Сумма вклада с процентами за пятный год "+term5);


    }
}
