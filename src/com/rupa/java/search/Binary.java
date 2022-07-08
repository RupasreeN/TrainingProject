import java.util.*;
 	public class Binary
	{
		public static void main(String args[])
		{
			int a[]={2,12,36,44,69,85,108,256};
			int low=0,high=8,mid,num;
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
				
			while(low<high)
			{
				mid=(low+high)/2;	
				if(num==a[mid])
				{
				System.out.println("number is at"+mid);
				break;
				}
				else if(num<a[mid])
		
			high=mid-1;
		else
		{
			low=mid+1;
		
		}
}		
}
}
