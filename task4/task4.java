package v2.Seminar2.homework2.task1.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] arr = {};
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        ArrayOperations ans = new ArrayOperations();
        ans.findMinMax(arr);
        try (BufferedReader br = new BufferedReader(new
                FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
