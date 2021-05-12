/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(13);
        nums.add(1);
        nums.add(10);
        nums.add(7);
        nums.add(9);
        nums.add(20);
        System.out.println(nums);
        nums.removeIf(i -> (i > 10));
        System.out.println(nums);
    }
}
