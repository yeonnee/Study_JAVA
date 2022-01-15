import java.util.Scanner;

public class BAEK_10869{
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        
        sb.append(a+b).append('\n');
        sb.append(a-b).append('\n');
        sb.append(a*b).append('\n');
        sb.append(a/b).append('\n');
        sb.append(a%b);

        System.out.print(sb);   
        
        scanner.close();
    }
}