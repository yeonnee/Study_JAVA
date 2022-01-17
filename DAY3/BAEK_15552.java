import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BAEK_15552{
    public static void main(String[] args) throws IOException{
        //BufferedReader.readLine()으로 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            //입력 받은 두 정수 문자열 분리
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            // string형을 int형으로 바꿔준 후, 두 토큰을 더해준다
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close();
        bw.flush();  //버퍼 비우기
        bw.close();
    }
}