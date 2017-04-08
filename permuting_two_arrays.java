import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
for(int j=0;j<k;j++)
{
int n=sc.nextInt();
int d=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++)
{
	b[i]=sc.nextInt();
	
}
Arrays.sort(a);
Arrays.sort(b);
int count=0;
for(int m=0,f=n-1;m<n && f>=0;m++,f--)
{
	int val=(int)Math.abs(a[m]+b[f]);
	//System.out.println("val "+val);
	if(val>=d)
	{
count++;		
	}
}
//System.out.println("count "+count);
if(count==n)
{
	System.out.println("YES");
}
else
{
	System.out.println("NO");
}
}
}
}