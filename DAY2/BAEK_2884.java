import java.util.Scanner;

public class BAEK_2884{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int h, m, time;

        time = (H*60 + M) - 45; //주어진 시각을 분 단위로 변경
        h = time/60;
        m = time%60;
        if(m<0) {
            h = 23;
            m = 60 + m;
        }

        System.out.println(h);
        System.out.println(m);

        sc.close();
    }   
}