import java.util.Scanner;

public class BAEK_11720{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        sc.nextInt(); // 첫번째 숫자는 입력만 받기
        int sum = 0;

        /*sc.next()로 읽어들인 getBytes()를 이용하여 byte[]로 변환하고 
        for each 구문으로 문자열의 문자를 하나씩 읽음*/
        for(byte value : sc.next().getBytes()){
            sum += (value - 48);
        }

        /*int first = sc.nextInt();
        String second = sc.next();
        int sum = 0;

        for(int i=0; i<first; i++){
            sum += second.charAt(i) - 48;
        }*/

        System.out.println(sum);
        sc.close();
    }
}