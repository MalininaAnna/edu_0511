/* 
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int nums[] = {402, 12, 45, 67, 65};
        resiver(nums);
          }

    private static void resiver(int nums[]) {
        if(nums.length == 0)
            return;
        int[] a = new int[nums.length-1];
        for(int i = 0; i < nums.length-1;i++)
            a[i] = nums[i+1];
        resiver(a);
        System.out.println(nums[0]);
    }
}
