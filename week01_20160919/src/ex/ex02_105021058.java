package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class ex02_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入體重:");
		float a=scn.nextFloat();
		a=a/0.45359f;
		System.out.println("磅="+a);
	}

}
