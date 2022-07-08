import java.util.*;
	public class Selection
	{
	  public static  void main(String args [])
		{
		int a[]={20,12,10,15,2};
		int i,j,num,temp;
		Scanner sc=new Scanner(System.in);
		num =sc.nextInt();
		for(i=0;i<num;i++)
		{
		
		for(j=i+1;j<num;j++)
		{
			if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		}
		}
			for(i=0;i<num;i++)
				 System.out.println("array is"+a[i]);
	}
}
