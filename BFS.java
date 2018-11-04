package Graphs;
import java.util.*;
public class BFS {
	static LinkedList<Integer> arr[]=new LinkedList[7];
public static void main(String args[]) {
	BFS a=new BFS();
	 addEdge(1,2); 
     addEdge(1,3); 
     addEdge(2,4); 
     addEdge(2, 5); 
     addEdge(3,5); 
     addEdge(4,6);
     addEdge(5,6);
     System.out.println("breadth first traversal starting from 1:");
     dobfs(1);
	
}
BFS()
{
	for(int i=1;i<7;i++)
	{
		arr[i]=new LinkedList<>();
	}
}
public static void addEdge(int src,int des)
{
	arr[src].add(des);
	arr[des].add(src);
}
public static void dobfs(int s)
{
	boolean visited[]=new boolean[7];
	LinkedList<Integer> queue=new LinkedList<>();
	queue.add(s);
	visited[s]=true;
	while(queue.size()!=0)
	{
		int c=queue.poll();
		System.out.print(c+" ");
		Iterator itr=arr[c].iterator();
		while(itr.hasNext())
		{
			int i=(Integer)itr.next();
			while(!visited[i])
			{
				visited[i]=true;
				queue.add(i);
				
			}
			
		}
	}
}

}
