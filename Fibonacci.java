package pro1;

import java.math.BigInteger;
import java.util.*;
public class Fibonacci {
	public static BigInteger of(int count)
    {
          BigInteger number1=new BigInteger("1");        
          BigInteger number2 = new BigInteger("1");
          BigInteger tmp_number; 
          for(int i = 3;i<= count;i++){
              tmp_number = number1.add(number2);
        	  number1=number2;
              number2 = tmp_number;
           }
           return  number2;
    }

	public static void main(String[] args) {
		
         BigInteger value;
         Fibonacci fibonacci=new Fibonacci();
         for(int i=1;i<=200;i++)
         {
           value=fibonacci.of(i);
           System.out.println("Fibonacci("+i+") == "+value);
         }
	}
}