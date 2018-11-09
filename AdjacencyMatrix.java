package Graphs;
import java.util.*;
public class AdjacencyMatrix {
	
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of vertices");
		 int n=sc.nextInt();
		 int arr[][]=new int[n][n];int x;int a,b;
		 do {
		 System.out.println("Enter your choice:");
		 System.out.println("Enter 1  to insert edge");
		 System.out.println("Enter 2 to display");
		 System.out.println("Enter 3 to delete edge");
		 System.out.println("Enter any oher value to terminate");
		  x=sc.nextInt();
		 switch (x) {
		   case 1:
		    System.out.println("enter source");
			   a=sc.nextInt();
			   System.out.println("enter destination");
			   b=sc.nextInt();
			   if(a<n&&b<n&&a>-1&&b>-1)
		   insertedge(arr,a,b);
		   display(n,arr);
		   break;
		   case 2:
		   display(n,arr);
		   break;
		   case 3:
			    System.out.println("enter source");
				   a=sc.nextInt();
				   System.out.println("enter destination");
				    b=sc.nextInt();
				   if(a<n&&b<n&&a>-1&&b>-1)
			   delete_edge(arr,a,b);
			   display(n,arr);
			   break;
			   default:
				   System.exit(0);
		 }}while(x==1||x==2||x==3);

	}
		 public static void insertedge(int arr[][],int a,int b)
		 {
		   
		   arr[a][b]=1;
		 }
		 public static void display(int n,int arr[][])
		 {
		   for(int i=0;i<n;i++)
		   {
		     for(int j=0;j<n;j++)
		     {
		       System.out.print(arr[i][j]+" ");
		     }
		     System.out.println();
		   }
		   
		 }
		 public static void delete_edge(int arr[][],int a,int b)
		 {
		   
		   arr[a][b]=0;
		 }


}
