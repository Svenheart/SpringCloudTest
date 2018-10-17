package com.example.demo;

import java.util.Scanner;

/**
 * @program:com.example.demo
 * @description:
 * @class:Q3
 * @author:SanCheng
 * @create:2018-10-15-09-58
 **/
public class Q3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		String[] num=new String[Integer.valueOf(a)];
		for(int i=0;i<Integer.valueOf(a);i++){
			num[i]=scanner.next();
		}

	}
}
