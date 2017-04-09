import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		try
		{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int k=Integer.parseInt(br.readLine());
for(int i=0;i<k;i++)
{
	int n=Integer.parseInt(br.readLine());
	int budget=Integer.parseInt(br.readLine());
	int c[]=new int[n];
	int c1[]=new int[n];
	int p[]=new int[n];
	int a=0;
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	for(int j=0;j<n;j++)
	{
		c[j]=Integer.parseInt(br.readLine());
		c1[a++]=c[j];
		
	}
	
	for(int j=0;j<n;j++)
	{
		p[j]=Integer.parseInt(br.readLine());
		hm.put(c[j],p[j]);
	}
	Arrays.sort(c1);
	
	
	int result=0;
	for(int l=n-1;l>=0;l--)
	{
		int val=c1[l];
			int price=hm.get(val);
		//System.out.println("b "+price);
		
		result=result+val;
			budget=budget-price;
			
			price=p[l-1];
			 
			
		if(budget<price)
		{
			break;
		}
		
	}
	
	System.out.println(result);
	
}

}
catch(Exception e)
{
	
}
}
}