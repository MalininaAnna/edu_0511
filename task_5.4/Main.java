/* 
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            String doc = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(doc)));
            while (fileReader.ready()){
                int i = Integer.parseInt(fileReader.readLine());
                if (i % 2 == 0)
                    list.add(i);
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        for (Integer i : list){
            System.out.println(i);
        }

    }
}
