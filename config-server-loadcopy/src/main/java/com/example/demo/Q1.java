package com.example.demo;

/**
 * @program:com.example.demo
 * @description:
 * @class:Q1
 * @author:SanCheng
 * @create:2018-10-15-08-28
 **/
public class Q1 {
	public static void main(String[] args) {
		String[] name={"zhangsan","lisi","wangwu","guoniu","tianqi","zhangsi"};
		String[] name1=name;
		String[] name2=name;
		for(String a:name1){
			System.out.print(a+"   ");
		}
		System.out.println("\n冒泡排序：");
		for(int i=0;i<name1.length-1;i++){
			for(int j=0;j<name1.length-1-i;j++){
				if(name1[j].compareTo(name1[j+1])>0){
					String a;
					a=name1[j+1];
					name1[j+1]=name1[j];
					name1[j]=a;
				}
			}
		}
		for(String a:name1){
			System.out.print(a+"   ");
		}
		System.out.println("\n选择排序：");
		for(int i=0;i<name2.length-1;i++){
			int k=i;
			for(int j=i+1;j<name2.length;j++){
				if(name2[i].compareTo(name2[j])>0){
					k=j;
				}
			}
			String a;
			a=name2[k];
			name2[k]=name2[i];
			name2[i]=a;
		}
		for(String a:name1){
			System.out.print(a+"   ");
		}
	}
}
