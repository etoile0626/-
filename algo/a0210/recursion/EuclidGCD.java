package a0210;

import java.util.Scanner;

//유클리드 호제법으로 최대공약수를 구함
class EuclidGCD {
    //--- 정수 x, y의 최대공약수를 구하여 반환 ---//
    static int gcd(int x, int y) {
  
    	System.out.println("x : " + x + ", y : " + y);

    	if (y == 0)	return x;
        else		return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.println("최대공약수는 " + gcd(22, 8) + "입니다.");
    }
}
