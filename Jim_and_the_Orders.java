import java.io.*;
import java.util.*;
class abc{
	

public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
     int n = in.nextInt();

     TreeMap<Integer, TreeSet<Integer>> tm = new TreeMap<Integer, TreeSet<Integer>>();

     for(int i=0; i < n; i++)
	 {
       int endTime=in.nextInt()+in.nextInt();

       if(tm.containsKey(endTime)) 
	   {
		   //System.out.println("point 1");
           tm.get(endTime).add(i+1);
		   //System.out.println("tm.get(endtime)"+ tm.get(endTime));
		   
		   
       }
	   else
	   {
		   //System.out.println("point 2");
           TreeSet<Integer> orderNoSet = new TreeSet<Integer>();
            orderNoSet.add(i+1);
            tm.put(endTime,orderNoSet);
       }  
     }

     for (TreeSet<Integer> orderNos: tm.values()) 
	 
	 {
		// System.out.println("tm="+tm.values());
		// System.out.println();
        for(Integer order : orderNos)
            System.out.print(order+" ");
     }
}
}