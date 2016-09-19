package hw;

	/*
	 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
	 * Date: 2016/09/19
	 * Author: 105021058 蕭懋霖
	 */
	
	import java.util.Scanner;
	import java.util.Random;
	public class hw03_105021058 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			Random rdm=new Random();
			System.out.println("請輸入a:");
			int a=Math.round(scn.nextFloat());
			System.out.println("請輸入b:");
			int b=Math.round(scn.nextFloat());
			System.out.println("請輸入c:");
			int c=Math.round(scn.nextFloat());
			System.out.println("請輸入d:");
			int d=Math.round(scn.nextFloat());
			System.out.println("請輸入e:");
			int e=Math.round(scn.nextFloat());
			System.out.println("請輸入f:");
			int f=Math.round(scn.nextFloat());
			int x=Math.min(a,b);
			x=Math.min(x,c);
			x=Math.min(x,d);
			x=Math.min(x,e);
			x=Math.min(x,f);
			System.out.println("Min="+x);
			
			
			
		}

	}