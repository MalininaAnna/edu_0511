/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/


public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1,1));
    }
    static boolean sum(int a, int b) {
        return (a+b>10);
    }
}
