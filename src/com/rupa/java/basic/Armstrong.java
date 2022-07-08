import java.lang.Math.*;
public class Armstrong
{
public static void main(String args[])
{
   int a=1634,count=0,r=0,temp,i;
double s=0;
 temp=a;
while(a>0)
{
 count=count+1;
a/=10;
}
a=temp;

while(a!=0)
{
r=a%10;
s=s+Math.pow(r,count);
a/=10;
}

if(temp==s)
System.out.println("armstrong: "+s);
else
System.out.println(" not armstrong: "+s);
}
}

