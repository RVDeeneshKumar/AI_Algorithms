/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author deene
 */
public class hillClimbing {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int n,i,j;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of nodes in graph");
		n=sc.nextInt();
		
			
		int[][] graph=new int[n][n];
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				graph[i][j]=0;
						
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				System.out.println("Is "+i+" is connected to "+ j);	
				graph[i][j]=sc.nextInt();
			}
		}
		System.out.println("The adjacency matrix is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{		System.out.print(graph[i][j]+ "\t");
			}
			System.out.println();
		}
    }
}
