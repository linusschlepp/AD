
public class Node {

	
	 Object obj;

	    private Node nextNode;
	    private Node prevNode;

	    public Node()
	    {
	    	this.obj = null;
	    	nextNode = null;
	    	prevNode = null;
	    }
	    
	    public Node(Object obj) {
	        this.obj = obj;
	        nextNode = null;
	    }

	    public void setNextNode(Node nextElem) {
	        this.nextNode = nextElem;
	    }

	    public Node getNextNode() {
	        return nextNode;
	    }
	    public Node getPrevNode() {
	        return prevNode;
	    }

	    public Object getObj() {
	        return obj;
	    }
	    
	    public void setNode(Node thisNode)
	    {
	    	this.obj = thisNode;
	    }
	    
	    
	
}
