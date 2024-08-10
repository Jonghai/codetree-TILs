import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfInputs;
        numberOfInputs = scanner.nextInt();
        int count  = 0;
        List<Integer> results = new ArrayList<>();
        while (count < numberOfInputs) {
            int a,b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            count++;
            results.add(comparisonAbsoluteValue(a,b));
        }
        results.forEach(System.out::println);
    }

    public static int comparisonAbsoluteValue(int a, int b){
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        return Math.max(absA, absB);
    }


}