import java.util.*;
   class Prime
	{
	public static void main(String args[])

	{
		Scanner sc=new Scanner(System.in);

			 int n,fact=0,i,num;
			n=sc.nextInt();
		for(i=2;i<n/2;i++)
		{
			num=n%i;
          if(num==0)
		fact++;
		}
	System.out.println("prime no is "+n);
}
}

			
				
		
