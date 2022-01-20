import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEK_1157{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[26];
        int max = -1;
        char ch = '?';
        String word = br.readLine().toUpperCase();
        br.close();
        
        for(int i=0; i<word.length(); i++){
            arr[word.charAt(i) - 'A']++;
            if(arr[word.charAt(i) - 'A'] > max){
                max = arr[word.charAt(i) - 'A'];
                ch = word.charAt(i);
            }
            else if(arr[word.charAt(i) - 'A'] == max) ch = '?';
        }
        System.out.println(ch);
    }    
}