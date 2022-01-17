import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Scanner;

public class BAEK_2438{
    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                bw.write("*");
            }
            bw.newLine();
        }
        
        br.close();
        bw.flush();
        bw.close();

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                sb.append("*");
            }
            sb.append('\n');
        }
        
        System.out.print(sb);
        br.close(); */

        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close()*/
    }
}