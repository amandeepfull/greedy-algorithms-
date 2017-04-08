import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("sorted array");
for(int i=0;i<n;i++)
{
	System.out.println(arr[i]);
}
Vector<Integer> v=new Vector<Integer>();
boolean b[]=new boolean[n];
int min=Integer.MAX_VALUE;

int arr2[]=new int[k];
int diffval[]=new int[k];
int d=0;
al:

for(int i=1;i<n;i++)
{
	
		int val=Math.abs(arr[i]-arr[i-1]);
		
		if(d<k)
		{
		if(val<=min)
		{
			min=val;
			diffval[d]=min;
			d++;
		}
		}
	
}

Arrays.sort(diffval);


System.out.println("your sorted min values");
for(int i=0;i<k;i++)
{
	System.out.println(diffval[i]);
}
System.out.println("new min "+min);

int m=0;
for(int i=1;i<n;i++)
{
	for(int j=0;j<k;j++)
	{
	int val=Math.abs(arr[i]-arr[i-1]);

	if(val==diffval[j])
	{
		if(b[i]==false && b[i-1]==false)
		{
		arr2[m]=arr[i-1];
		m++;
		arr2[m]=arr[i];
		m++;
		b[i-1]=true;
		b[i]=true;
		}
		else if(b[i]==false)
		{
			arr2[m]=arr[i];
			m++;
			b[i]=true;
		}
	}
}
}
System.out.println("your new array");
for(int i=0;i<k;i++)
{
	System.out.println(arr2[i]);
}

System.out.println(Math.abs(arr2[0]-arr2[k-1]));

}
}