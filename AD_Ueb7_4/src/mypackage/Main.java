package mypackage;

public class Main {

	public static void main(String[] args) {
		
		
		/**
		 * g ist gerichtet, da die Adjazenzmatrix nicht an der Symmetrie-
		 * achse gespiegelt werden kann.
		 */
		
		DepthSearch g = new DepthSearch(9);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 6);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 6);
        g.addEdge(4, 0);
        g.addEdge(4, 5);
        g.addEdge(4, 8);
        g.addEdge(5, 2);
        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(5, 7);
        g.addEdge(6, 7);
        g.addEdge(7, 3);
        g.addEdge(7, 8);
        g.addEdge(8, 5);
        
 
        
        System.out.println("DepthSearch:");
 
        g.dfs(0);
        
        
        WidthSearch f = new WidthSearch(9);
        
        f.addEdge(0, 1);
        f.addEdge(0, 2);
        f.addEdge(0, 6);
        f.addEdge(1, 3);
        f.addEdge(2, 0);
        f.addEdge(2, 3);
        f.addEdge(2, 4);
        f.addEdge(3, 6);
        f.addEdge(4, 0);
        f.addEdge(4, 5);
        f.addEdge(4, 8);
        f.addEdge(5, 2);
        f.addEdge(5, 3);
        f.addEdge(5, 4);
        f.addEdge(5, 7);
        f.addEdge(6, 7);
        f.addEdge(7, 3);
        f.addEdge(7, 8);
        f.addEdge(8, 5);
 
        System.out.println("");
        System.out.println("WidthSearch:");
 
        f.bfs(0);

	}
		

	}


