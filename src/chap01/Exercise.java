package chap01;

public class Exercise {
    public static void main(String[] args) {
       npira(11);
    }

    public static int max4(int a, int b, int c, int d){
        int max = a;
        if (max<b) max = b;
        if (max<c) max = c;
        if (max<d) max = d;
        
        return max;
    }

    public static int min3(int a, int b, int c){
        int min = a;
        if (a>b) min = b; 
        if(b>c) min = c;
        return min;
    }  

    public static int min4(int a, int b, int c, int d){
        int min = a;
        if (min>b) min = b;
        if (min>c) min = c;
        if (min>d) min = d;
        
        return min;
    }

    public static int med(int a, int b, int c){
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    //Q7
    public static int gause(int n){
        return n*(n+1)/2;
    }
    //Q8 
    public static int sumof(int a, int b){
        int min;		// a, b의 작은 쪽의 값 
		int max;		// a, b의 큰 쪽의 값 

		if (a < b) {
			min = a;  max = b;
		} else {
			min = b;  max = a;
		}

		int sum = 0;		// 총합
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
    }
    //Q11
    public static void q11(){
        for (int i = -1; i <= 9; i++) {
            if (i == -1) {
                System.out.println("   |  1  2  3  4  5  6  7  8  9");
                continue;
            }
            if (i == 0) {
                System.out.println("---+---------------------------");
                continue;
            }
            System.out.print(i+ "  |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i+j);
            }
            System.out.println();
        }    
    }
    //Q12
    public static void q12(int n){
        System.out.println("정사각형을 출력합니다.");
        System.out.println("변의 길이: "+ n );
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Q14 왼쪽 아래가 직각인 삼각형
    public static void triangleLB(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Q14 왼쪽위가 직각
    public static void triangleLU(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Q14 오른쪽위가 직각
    public static void triangleRU(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(i-1) + "*".repeat(n-i+1));
        }
    }
    // 오른쪽 아래가 직각
    public static void triangleRB(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+"*".repeat(i));
        }
    }

    //n단 피라미드
    public static void spira(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
        }
    }
    //n단 피라미드 숫자
    public static void npira(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+ String.valueOf(i%10).repeat(2*i-1));
        }
    }
}
