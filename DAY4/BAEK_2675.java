import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BAEK_2675{
    public static void main(String[] args) throws IOException{    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            String S = str[1];

            for(int j=0; j<S.length(); j++){
                for(int k=0; k<N; k++){
                    sb.append(S.charAt(j));
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);
   
        /*Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            
            int N = sc.nextInt();
            String S = sc.next();
            
            for(int j=0; j<S.length(); j++){
              for(int k=0; k<N; k++){
                  System.out.print(S.charAt(j));
              }
            }

            System.out.println();
        }
        sc.close();*/
    }
}