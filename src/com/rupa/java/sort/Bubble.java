import java.util.*;
	public class Bubble
	{
	  public static  void main(String args [])
		{
		int a[]={20,12,10,15,2};
		int i,j,num,temp;
		Scanner sc=new Scanner(System.in);
		num =sc.nextInt();
		for(i=0;i<num-1;i++)
		{
		
		for(j=0;j<num-1;j++)
		{
			if(a[j]>a[i+1])
			{
			temp=a[j];
			a[j]=a[i+1];
			a[i+1]=temp;
			
		}
		}
		}
			for(i=0;i<num;i++)
				 System.out.println("array is"+a[i]);
	}
}
