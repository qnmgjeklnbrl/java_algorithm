package chap03;

import java.util.Scanner;

// 선형검색 (보초법)
public class SeqSearchSen {
     // 요솟수가 n인 배열a에서 key와 값이 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key){
        int i = 0;

        a[n] = key; // 보초를 추가

        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num+1]; // 요솟수가 num+1인 배열

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값: ");
        int key = stdIn.nextInt();

        int idx = seqSearch(x, num, key); // 배열 x에서 값이 key인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }

    }
}
