import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//import java.util.Scanner;

public class BAEK_10952{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
            

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," "); //공백 분리
                
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A==0 && B==0){
                br.close();
                break;
            }

            sb.append(A+B).append("\n");
        }

        System.out.println(sb);

       /* Scanner sc = new Scanner(System.in);
        
        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(A==0 && B==0){
                sc.close();
                break;
            }

            System.out.println(A+B);
        } */          
    }
}