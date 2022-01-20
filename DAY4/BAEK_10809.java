import java.util.Scanner;

public class BAEK_10809{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int alphabet[] = new int[26];

        for(int i=0; i<alphabet.length; i++){
            alphabet[i] = -1;
        }

        String word = sc.next();
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

            if(alphabet[ch - 'a'] == -1){
                alphabet[ch - 'a'] = i;
            }
        } 

        for(int val : alphabet){
            System.out.print(val + " ");
        }          

        //또는 word.indexOf() 사용하여 특정 문자 위치 가능
    
        sc.close();
    }    
}