package com.mphasis.MyDemoProject1;
import java.util.*;
public class Singledim {
	public static void  main(String args[]) {
		Scanner s=new Scanner(System.in);
		int[][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int[] row:arr) {
			for(int ele:row) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}

}
