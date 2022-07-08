import java.util.Scanner;
	public class Linear
	{
		public static void main(String[] args)
		{
			int i;
			int array[]={45,36,11,85,6,877,0,96};
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
		
		for(i=0;i<=15;i++)
		{
			if(array[i]==number)
			{
			System.out.println("searched number is " +array[i]);
			break;
			}
 			
			}
		}
	}
