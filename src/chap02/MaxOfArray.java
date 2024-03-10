package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num = random.nextInt(20)+1;
        System.out.println("사람 수: "+ num);
        

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            height[i] = random.nextInt(90)+ 100;
            System.out.println("height[" + i + "]:" + height[i]);
        }

        System.out.println("최댓값은" + maxOf(height) + "입니다.");
    }
}
