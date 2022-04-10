package com.Lab2.Problem1;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		 
		//input 
		Scanner n = new Scanner(System.in);
        System.out.println("enter size of array");
        //take array size
        int size = n.nextInt();
        
        System.out.println("enter the values of array");
        
        //take values
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
        	arr[i]=n.nextInt();
        
        System.out.println("enter the no of target");
        int t =n.nextInt();
        
        for (int j=0;j<t;j++) {
        System.out.println("enter the values of targets");
        int target=n.nextInt();
		
		int sum=0;
		for (int i=0;i<size;i++) {
			sum=sum+arr[i];
			if(sum>=target) {
           break;
		}
		}
			if(sum<target) {
				System.out.println("not achive");
			}
			else {
				System.out.println("achieve");
			}
			
        
	}
	}

}


