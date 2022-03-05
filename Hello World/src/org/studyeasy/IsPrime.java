package org.studyeasy;

public class IsPrime {

	public static boolean IsPrime(int num)
	
	{
		boolean prime = true;
		for (int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{

prime=false;
break;
			}
		}
		if(prime)
			return true;
		else
			
		return false;
	}
}
