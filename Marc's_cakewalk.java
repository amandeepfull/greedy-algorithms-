import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
long sum=0;
Arrays.sort(arr);
int j=0;
for(int i=n-1;i>=0;i--)
{
	sum+=arr[i]*(long)Math.pow(2,j);
	j++;
}
System.out.println(sum);
}
}