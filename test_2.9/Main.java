/*2.9
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,4,6,7,5,9,100};
        int a = 5;
        {
            for (int i = 0; i < nums.length; i++)
                if (nums[i] == a) {
                    System.out.println("Да");
                } else {
                    System.out.println("Нет");
                }
        }
    }
}
