import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b, c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        int intA = Math.round(a);
        int intB = Math.round(b);
        int intC = Math.round(c);
        //세 정수의 합을 출력
        System.out.println(intA + intB + intC);
        //세 정수의 평균을 출력합니다. 단, 반올림하여 정수로 출력
        System.out.println(Math.round((intA + intB + intC) / 3.0));
    }
}