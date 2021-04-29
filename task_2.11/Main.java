/*2.11
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i=0; i < nums.length; i++) {
            sum+= nums[i];
            if (sum <= 10)
        System.out.println(nums[i]);
        }
    }
}
