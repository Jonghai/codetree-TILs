import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
 //정수 3개가 주어지면 최대값을 출력하는 프로그램을 최댓값을 반환해주는 함수를 이용하여 작성
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
            while (stringTokenizer.hasMoreTokens()) {
                int value = Integer.parseInt(stringTokenizer.nextToken());
                if (value % 2 == 0) { // 짝수 일 때
                    System.out.print(value / 2 + " ");
                } else { // 홀수 일 때
                    System.out.print((value * 3) - 20 + " ");
                }
            }
        }
    }


}