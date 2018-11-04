package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	static LinkedList<Integer> arr[] =new LinkedList[5];
	static boolean b[]=new boolean[5];
	public static void main(String args[])
	{
		DFS c=new DFS();
		 addEdge(0, 1); 
		    addEdge(0, 2); 
		    addEdge(1, 2); 
		    addEdge(2, 0); 
		    addEdge(2, 3); 
		    addEdge(3, 3); 
		    System.out.println("DFS :");
		    dfsgraph(2,b);
	}
	DFS()
	{
		for(int i=0;i<5;i++)
		{
			arr[i]=new LinkedList<>();
		}
	}
	public static void addEdge(int src,int des)
	{
		arr[src].add(des);
	}
	public static void dfsgraph(int s,boolean visit[])
	{
		visit[s]=true;
		System.out.print(s+" ");
		Iterator itr=arr[s].iterator();
		while(itr.hasNext())
		{
			int c=(int) itr.next();
			if(!visit[c])
			{
				dfsgraph(c,visit);
			}
		}
		
	}
	
	}
