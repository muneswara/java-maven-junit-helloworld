package com.example.random;

import java.util.Scanner;

public class PrintNumbersInWord {


                                                  
	static String units[] = { "Zero", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen" };
	static String tens[] = { "", "","Twenty", "Thirty","Forty","Fifty","Sixty", "Seventy","Eighty","Ninety" };

	public static String Convert(int n)
	{
		if (n < 20) {
			return (units[n]);
		}

		else if (n < 100) {
			if (n%10==0){
				return (tens[n / 10]);
			}
			else
			{
				return (tens[n / 10] +" "+ units[n % 10]);
			}
		}

		else if (n < 1000) {

			if(n%100==0){
				return (units[n / 100] + " Hundred" );
			}
			else
			{
				return (units[n / 100] + " Hundred and "  +  Convert(n%100) );
			}
		}
		else if(n < 10000){
			if(n%1000==0){
			return (units[n/1000]+"thousand");
	        }
			else{
				return (units[n/1000] + " thousand " + Convert(n%1000));
			}
			
		}
		else if(n < 100000){
			return (Convert(n/1000) +" thousand "+ Convert(n%1000) );
		}
		else{
			return ("Try another number ");
		}

	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to convert into words:");
		int n=s.nextInt();
		System.out.println(Convert(n));
		s.close();
	}
}
