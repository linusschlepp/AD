package mypackage;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthSearch {

	private int V;   // No. of vertices
	 
    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
 
    // Constructor
    DepthSearch(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    //Function to add an edge into the graph
    void addEdge(int v,int w)
    {
    	Iterator<Integer> i = adj[v].listIterator();
    	for(int k = 0; k <= adj[v].size(); k++)
    	{
    		if(i.hasNext())
    		{
    			int n = i.next();
        		if(w < n)
        		{
        		adj[v].add(k, w);
        		return;
        		}	
    		}
    		else
    		{
    			adj[v].add(k, w);
    			return;
    		}	
    	}
    		
        
    }
 
    // A function used by DFS
    void dfsRec(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> iter = adj[v].listIterator();
        while (iter.hasNext())
        {
            int n = iter.next();
            if (!visited[n])
                dfsRec(n, visited);
        }
    }
 
    
    void dfs(int v)
    {
        
        // marks all versited visited false by default in java
        boolean visited[] = new boolean[V];
 
        // Call the recursive helper function to print DFS traversal
        dfsRec(v, visited);
    }
	
	
	
}
