/*2.7
Задание: Дано число, например 546321541. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/
public  class  Main {
    public static void main(String[] args) {
        int a = 546321541;
        for (int i = 0; i < a; i++) {
            if (i % a == 1) {
                System.out.println(true);
            }
                else {
                    System.out.println(false);
            }
        }
    }
}
