import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class BAEK_10951{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while((str = br.readLine()) != null){

            int A = str.charAt(0) - '0';  //charAt()는 해당 문자의 아스키코드 값을 반환
            int B = str.charAt(2) - '0';  //정수 입력 시, 공백 있으므로 charAt(2)
            sb.append(A+B).append("\n");
        }

        /*while((str = br.readLine()) != null){
            
            StringTokenizer st = new StringTokenizer(str," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");      
        }*/

        System.out.println(sb);
        br.close();
    }
}