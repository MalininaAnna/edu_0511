/*2.10
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main {
    public static void main(String[] args) {
        int nums[] = {1, 4, 6, 7, 7, 9, 100};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j]) {
                    System.out.println("Да");
                } else {
                    System.out.println("Нет");
                }
        }
    }
}
