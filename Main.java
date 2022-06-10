package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int sum2 = 0;
		double avg = 0;
		int count = 0;
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
		}
		sc.close();
		//Â¦¼ö
		for(int i = 1; i < arr.length; i += 2) {
			sum += arr[i];
		}
		
		// È¦¼ö
		for(int i = 0; i < arr.length; i += 2) {
			count++;
			sum2 += arr[i];
			avg = (double)sum2/count;
		}
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f",avg);
	}

}
