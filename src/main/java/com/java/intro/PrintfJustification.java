package com.java.intro;

public class PrintfJustification {

	public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1="Test";
                int x=54;
                //Complete this line
                System.out.printf("%-15s%03d",s1, x);
                System.out.println();
            }
            
            System.out.println(Math.pow(2, 3));
            System.out.println("================================");
	}

}
