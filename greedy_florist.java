import java.io.*;
import java.util.*;
class abc
{
public static void main(String gr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
int arr2[]=new int[k];
int a=0;
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	
}
Arrays.sort(arr);

int len=arr.length-1;
int result=0;
int buy=0;
while(len>=0)
{
	for(int j=0;j<k && len>=0;j++)
	{
		result+=(1+buy)*arr[len];
		len--;
	}
	buy++;
}
	

System.out.println(result);
}
}

