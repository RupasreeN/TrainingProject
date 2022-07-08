import java.util.*;
 	public class Bin
	{
		public static void main(String args[])

			{

				int a[]={2,12,36,44,69,85,108,256};

 			int low=0,high, key;
		Scanner sc=new Scanner(System.in);
			key=sc.nextInt();
		
     high=7;
   while(low<=high)
   {
     int mid=(low+high)/2;
     if(a[mid]<key)
     {
         low=mid+1;
     }
     else if(a[mid]>key)
     {
         high=mid-1;
     }
     else
     {
        low= mid+1;
     }
   } }
}
