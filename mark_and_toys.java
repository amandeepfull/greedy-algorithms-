import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
int n;
int k;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int count=0;
Arrays.sort(arr);
for(int i=0;i<n;i++)
{
	k=k-arr[i];
	if(k>0)
	{
		count++;
	}
	else
		break;
}
System.out.println("count "+count);
}
}