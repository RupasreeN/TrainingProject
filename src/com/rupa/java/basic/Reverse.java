import java.util.Scanner;
 public class Reverse 
{
                 public static void main(String args[])
                  {
                   int a=1221,s=0,r,temp	;
			temp=a;
                   while(a!=0)
		{ 
			r=a%10;
			s=s*10+r;
			a/=10;
		}

			System.out.println("reverse of a no  is"+s);
			if(temp==s)
		System.out.println("palindrome is"+s);
		else
  		System.out.println("not a palindrome"+s);
		}
}
  
  
