
public class Node {

	
	 Object obj;

	    Node nextElem;

	    public Node()
	    {
	    	this.obj = null;
	    	nextElem = null;
	    }
	    
	    public Node(Object obj) {
	        this.obj = obj;
	        nextElem = null;
	    }

	    public void setNextNode(Node nextElem) {
	        this.nextElem = nextElem;
	    }

	    public Node getNextNode() {
	        return nextElem;
	    }

	    public Object getObj() {
	        return obj;
	    }
	    
	    public void setNode(Node thisNode)
	    {
	    	this.obj = thisNode;
	    }
	
}
