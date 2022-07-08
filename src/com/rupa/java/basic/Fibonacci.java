public class Fibonacci
{
public static void main(String args[])
{
   int a=0,b=1,c=0,n=1;
   System.out.println(a +","+b+",");
while(n<10)
{
c=a+b;
a=b;
b=c;
n++;
System.out.println(c+",");
}
}
}
