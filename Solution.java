package co.anbu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] strNums;
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Number of Input You Want : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		strNums = bi.readLine().split(" ");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(strNums[i]);
		}
		if(n>0 && n<=20) {
			if(n%2==0) {
				for(int i=0;i<n;i++) {
					for(int j=i+1;j<n;j++) {
						if(arr[j]<arr[i]) {
							int temp = arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
				
			}
			else {
				for(int i=0;i<n;i++) {
					for(int j=i+1;j<n;j++) {
						if(arr[j]>arr[i]) {
							int temp = arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		else
			System.out.println("Invalid");
	}
}
