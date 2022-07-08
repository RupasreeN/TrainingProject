import java.util.Scanner;
 public class Strong 
{
                 public static void main(String args[])
                  {
                   int a=145,s=0,r,temp,rem,fact;
			temp=a;
                   while(a>0)
		{ 
			rem=a%10;
			for(fact=1;rem>0;rem--)
			{
			fact=fact*rem;
			}
			s=s+fact;
		
			a/=10;
		}

		
			if(temp==s)
		System.out.println("strong is"+s);
		else
  		System.out.println("not a strong"+s);
		}
}
  
  
