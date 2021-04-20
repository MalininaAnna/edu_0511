/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/
//import java.util.Scanner;
public  class  Main {
    public  static  void  main ( String [] args ) {
        int [] nums = {2,3,4,5};
        int resalt = 1;
        for (int i = 0; i < nums.length; i=i+1) {
            resalt = resalt * nums[i];
        }
        System.out.println(resalt);
    }
}
