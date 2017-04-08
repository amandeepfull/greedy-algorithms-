import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
Vector<Integer> v=new Vector<Integer>();
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
Arrays.sort(arr);

int min=Math.abs(arr[0]-arr[1]);
for(int i=1, m=i+1;i<n-1 && m<n;i++,m++)
{
	int val=Math.abs(arr[i]-arr[m]);
	if(val<min)
	{
		min=val;
	}
}
System.out.println(min);
}
}