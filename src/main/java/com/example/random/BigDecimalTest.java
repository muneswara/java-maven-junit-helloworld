package com.example.random;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		String s[] = new String[] {"0.000", "2.34", "0.12", "0.12", "90", "56.6", "0", "50", "-100"};
		int n = s.length;
		for(int i=0; i<n-1; i++){
            //int temp =s[i+1];
            int j=i+1;

            String tempString = s[j];
            BigDecimal temp= new BigDecimal(s[j]);
            BigDecimal ai = new BigDecimal(s[i]);
            //BigDecimal aj = new BigDecimal(s[j]);

            while(j>0 && ai.doubleValue()<temp.doubleValue()){
            	s[j] = s[j-1];
            	j--;
            	if(j!=0) {
            		ai = new BigDecimal(s[j-1]);
            	}
            }

            s[j] = tempString;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

	}

}
