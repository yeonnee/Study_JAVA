import java.util.Scanner;

public class BAEK_10950{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int arr[] = new int[test];

        for(int i=0; i<test; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }

        for(int j : arr){
            System.out.println(j);
        }

        sc. close();
    }   
}   