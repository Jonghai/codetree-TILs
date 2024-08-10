import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        while (stringTokenizer.hasMoreTokens()){
            int value = Integer.parseInt(stringTokenizer.nextToken());
            if (value % 2 == 0) { // 짝수 일 때
                System.out.print(value / 2 + " ");
            }else { // 홀수 일 때
                System.out.print((value * 3) - 20 + " ");
            }
        }
        reader.close();
    }


}