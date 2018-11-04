package Graphs;
import java.util.*;
public class AdjacencyListRepresentation {
	 static LinkedList<Integer> arr[]=new LinkedList[5];
	
	AdjacencyListRepresentation()
	{
		for(int i=0;i<5;i++)
		{
			arr[i]=new LinkedList<>();
		}
	}
	
	
	public static void main(String args[]) {
		AdjacencyListRepresentation a=new AdjacencyListRepresentation();
		
		
		edges(a,0,1);
		edges(a,0,4);
		edges(a,1,2);
		edges(a,1,3);
		edges(a,1,4);
		edges(a,2,3);
		edges(a,3,4);
		
		display(a);
		
		
		
		
		
	}

	public static void edges(AdjacencyListRepresentation a,int src,int des)
	{
		a.arr[src].add(des);
		a.arr[des].add(src);
	}
	public static void display(AdjacencyListRepresentation a)
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("arr["+i+"]:");
			Iterator itr=a.arr[i].iterator();
			while(itr.hasNext())
				System.out.print(itr.next()+"-> ");
			System.out.println();
		}
	}
}
