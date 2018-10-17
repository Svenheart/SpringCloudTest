package com.example.demo;

/**
 * @program:com.example.demo
 * @description:
 * @class:Q2
 * @author:SanCheng
 * @create:2018-10-15-09-12
 **/
public class Q2 {
	public static void main(String[] args) {
		String[] name={"zhangsan","lisi","wangwu","guoniu","tianqi","zhangsi"};
		for(String a:name){
			System.out.print(a+"   ");
		}
		System.out.print("\n");
		if(name.length%2==0){
			String a=name[(name.length-1)/2];
			name[(name.length-1)/2]=name[(name.length-1)/2+1];
			name[(name.length-1)/2+1]=a;
		}
		int j=name.length-1;
		for(int i=0;i<(name.length-1)/2;i++){
			String a=name[i];
			name[i]=name[j];
			name[j]=a;
			j--;
		}
		for(String a:name){
			System.out.print(a+"   ");
		}
	}
}
