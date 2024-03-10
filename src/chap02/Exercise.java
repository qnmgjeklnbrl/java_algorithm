package chap02;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 9, 6, 7};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length/2 ; i++) {
            int t = array[i];
            array[i]  = array[array.length - i -1];
            array[array.length -i -1] = t;
            System.out.println("a[" + i + "]과 a[" + (array.length - i -1) + "]를 교환합니다." );
            System.out.println(Arrays.toString(array));

        } 
        System.out.println("역순 정렬을 마쳤습니다.");

        System.out.println( sumOf( new int[] {1,3,5,7,9} ) ); 

        copy(new int[5], new int[] {1, 2, 3, 4, 5});
        rcopy(new int[5], new int[] {1, 2, 3, 4, 5});



    }
    // Q3 배열a의 모든 요소의 합계를 구하는 메소드
    static int sumOf(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    // Q4 배열b의 모든 요소를 배열 a에 복사하는 메소드
    static void copy(int[] a, int[] b){
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
        System.out.println(Arrays.toString(a));
    }

    // Q5 배열b의 모든 요소를 배열a에 역순으로 복사하는 메소드
    static void rcopy(int[] a, int[] b){
        for (int i = 0; i < b.length/2; i++) {
            a[i] = b[b.length -i -1];
            a[a.length - i -1] = b[i];
        }
        if (b.length % 2 != 0) {
           a[a.length/2]  = b[b.length/2];
        }
        System.out.println(Arrays.toString(a));
    }
}
