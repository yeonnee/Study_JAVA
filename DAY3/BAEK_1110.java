import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEK_1110{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int copy = N;

        while(true){

            N = (((N%10)*10) + (((N/10)+(N%10))%10));
            count++;
            if(copy == N) break;
            
        }

        /*do{
            N = (((N%10)*10) + (((N/10)+(N%10))%10));
            count++;
        }while(copy != N);*/

        System.out.println(count);

        br.close();
    }
}