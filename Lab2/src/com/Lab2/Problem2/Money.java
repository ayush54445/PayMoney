package com.Lab2.Problem2;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		 
		Scanner n = new Scanner(System.in);
        System.out.println("enter size of currency domination");
        //take array size
        int size = n.nextInt();
        
        System.out.println("enter the currency domination values");
        
        //take values
        int domination[]= new int[size];
        for(int i=0;i<size;i++)
        	domination[i]=n.nextInt();
        
        System.out.println("enter the amount you want to pay");
        int amount =n.nextInt();
        
        //Arrange data in ascending order using sorting
        int no=domination.length;
        Money ob = new Money();
        ob.sort(domination);
        
        int[] notecounter=new int[domination.length];
        
        try {
        	for(int i=0;i<no;i++) {
        		if(amount>=domination[i]) {
                 notecounter[i]=amount/domination[i];
                 amount=amount-notecounter[i]*domination[i];
        		}
        	}
        	if(amount>0) {
        		System.out.println("exact amount cannot be given with highest domination");
        	}else {
        		System.out.println("Your payment apprach");
        		for(int i=0;i<no;i++) {
        			System.out.println(domination[i]+":"+notecounter[i]);
        		}
        	}
        }
        catch(ArithmeticException e){
        	System.out.println(e+"Invalid domination");
        }
    
	}
	
	void sort(int domination[])
	{
		int temp;
		int size=domination.length;
		for(int step=0;step<size-1;step++) {
			for(int i=0;i<size-1-step;i++){
				if(domination[i]<domination[i+1]){
					temp=domination[i];
					domination[i+1]=domination[i];
					domination[i]=temp;
				}

			}

		}
	}
	

}

