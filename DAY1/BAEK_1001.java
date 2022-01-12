import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEK_1001{
    public static void main(String[] args) throws IOException{  

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();    //한 행을 전부 읽는 방법
        StringTokenizer st = new StringTokenizer(str, " ");    //문자열을 공백단위로 분리
        int a = Integer.parseInt(st.nextToken());    //int형으로 변환
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a-b);
    }
}