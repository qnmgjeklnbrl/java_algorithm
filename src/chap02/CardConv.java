package chap02;

import java.util.Scanner;

// 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 출력
public class CardConv {
    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(r + " |\t" + x+"  ..."+x%r);
        System.out.println("  +---------");
        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r; 
            System.out.println(r + " |\t" + x+ "  ..."+x%r);
            System.out.println("  +---------");
        } while (x != 0);

        for (int i = 0; i < digits /2; i++) {
            char t = d[i];
            d[i] = d[digits - i -1];
            d[digits - i -1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        int retry; // 다시 한번?
        char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어 두는 배열

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.println("변환하는 음이 아닌 정수: ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.println("어떤 진수로 변환할까요? (2 ~ 36)");
                cd = stdIn.nextInt();               
            } while (cd < 2 || cd > 36);

            System.out.println();

            dno = cardConv(no, cd, cno);
            
            System.out.print(cd + "진수로 ");
            
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            } 
            
            System.out.println("입니다.");

            System.out.println("한 번 더할까요? (1...예 / 0...아니요): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
