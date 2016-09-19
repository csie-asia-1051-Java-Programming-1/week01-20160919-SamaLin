package hw;

	/*
	 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
	 * Date: 2016/09/19
	 * Author: 105021058 蕭懋霖
	 */
	
	import java.util.Scanner;
	import java.util.Random;
	public class hw02_105021058 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			Random rdm=new Random();
			System.out.println("請輸入a:");
			int a=scn.nextInt();
			int val1=rdm.nextInt(a)+1;
			int val2=rdm.nextInt(a)+1;
			int val3=rdm.nextInt(a)+1;
			int val4=rdm.nextInt(a)+1;
			int val5=rdm.nextInt(a)+1;
			int val6=rdm.nextInt(a)+1;
			System.out.print(val1);
			System.out.print("  ");
			System.out.print(val2);
			System.out.print("  ");
			System.out.print(val3);
			System.out.print("  ");
			System.out.print(val4);
			System.out.print("  ");
			System.out.print(val5);
			System.out.print("  ");
			System.out.print(val6);
		}

	}