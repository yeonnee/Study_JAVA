import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEK_14681{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader은 문자열로만 입력받기 때문에 Integer.parseInt()로 int형 저장
        int x = Integer.parseInt(br.readLine()); 
        int y = Integer.parseInt(br.readLine());

        int quadrant;
        if((x > 0) && (y > 0)) quadrant = 1;
        else if((x < 0) && (y > 0)) quadrant = 2;
        else if((x < 0) && (y < 0)) quadrant = 3;
        else quadrant = 4;

        System.out.println(quadrant);

        br.close(); 
    }
}