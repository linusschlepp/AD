package mypackage;

public class PriorityQueue {

	Element firstElement;
	Element lastElement;
	
	static int counter = 0;
	
	public void insert(Element insertElement) {
		if(getSize() == 0) {
			firstElement = insertElement;
		}else if(getSize() == 1) {
			if(insertElement.getKey() > firstElement.getKey()) {
				Element tempElement = firstElement;
				firstElement = insertElement;
				lastElement = tempElement;
				firstElement.setNextElement(lastElement);
				lastElement.setPrevElement(firstElement);
			}
			else {
				lastElement = insertElement;
				firstElement.setNextElement(lastElement);
				lastElement.setPrevElement(firstElement);
			}
		}
		else {
			Element e = firstElement;
			if(insertElement.getKey() > getMin().getKey()) {
			while(e != null) {
				if(insertElement.getKey() > e.getKey()) {
					if(e.equals(firstElement)) {
						Element tempElement = firstElement;
						firstElement = insertElement;
						firstElement.setNextElement(tempElement);
						tempElement.setPrevElement(firstElement);
						break;
					}
					else {
					insertElement.setPrevElement(e.getPrevElement());
					e.getPrevElement().setNextElement(insertElement);
					e.setPrevElement(insertElement);
					insertElement.setNextElement(e);
					break;
					}
				}
				e = e.getNextElement();
			}
			}
			else {
				lastElement = getLastElement();
				lastElement.setNextElement(insertElement);
				insertElement.setPrevElement(lastElement);
			}
		}
	}
	
	
	public int getSize() {
		
		Element e = firstElement;
		int sizeCounter = 0;
		
		while(e != null) {
			e = e.getNextElement();
			sizeCounter++;
		}
		return sizeCounter;
	}
	
	
	public Element getMin() {
		int min = Integer.MAX_VALUE;
		Element e = firstElement;
		Element retElem = firstElement;
		
		while(e != null) {
			
			if(e.getKey() < min) {
				min = e.getKey();
				retElem = e;
			}
			
			e = e.getNextElement();
		
		}
		
		return retElem;
	}
	
	
	public void printQueue() {
		
		Element e = firstElement;
		
		while(e != null) {
			
		 System.out.println(e.getKey());
			
			e = e.getNextElement();
		}
		
		System.out.println();
		
	}
	
	public int getMaxValue() {
		
		int max = Integer.MIN_VALUE;
		Element e = firstElement;
		
		
		while(e.getNextElement() != null) {
			
			if(e.getKey() > max) 
				max = e.getKey();
			
			
			e = e.getNextElement();
		
		}
		
		return max;
	}
	
	
	private Element getLastElement() {
		
		Element e = firstElement;
		
		while(e.getNextElement() != null) {
			
			e = e.getNextElement();
			
		}
	
		
		return e;
	}
	
	
	public void decreaseKey(int pos, int key) {
		Element e = firstElement;
		int counter = 1;
		
		while(e != null) {
			if(counter == pos) {
				if(key >= e.getKey()) {
					System.out.println("Value has to be smaller than original value");
				return;	
				}
				e.setKey(key);
				break;
			}
			counter++;
			e = e.getNextElement();
			
		}
		
		e = firstElement;
		/*
		while(e != null) {
			insert(e);
			
			e = e.getNextElement();
		}
*/
	}
	

	public Element extractMin() {
		
	
		Element e = firstElement;
		int min = getMin().getKey();
		Element retElem = null;
		
		
		while(e != null) {
			
		if(e.getKey() <= min) {
			retElem = e;
			e.getPrevElement().setNextElement(e.getNextElement());
			e = null;
			break;
		}
		e = e.getNextElement();	
		}
			
		return retElem;
	}
	}
	
	

