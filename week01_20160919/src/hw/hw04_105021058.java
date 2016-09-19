package hw;
	/*
	 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
	 * Date: 2016/09/19
	 * Author: 105021058 蕭懋霖
	 */
	
	import java.util.Scanner;
	import java.util.Random;
	public class hw04_105021058 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			System.out.println("請輸入a:");
			float a=scn.nextInt();
			System.out.println("請輸入b:");
			float b=scn.nextInt();
			double x=(double)Math.pow(a,1f/b);
			System.out.println("結果為"+x);
			
			
			
		}

	}