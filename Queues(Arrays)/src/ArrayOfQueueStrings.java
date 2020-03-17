import java.util.Arrays;

public class ArrayOfQueueStrings {
    
	private static int head=-1;
    private static int tail=-1;
    private static String[] s;
    public static String[] createArray(int capacity) { 
    	return s= new String[capacity];
    }
    
	public boolean isEmpty() {
		return (head == -1) && (tail==-1);
	}
	public boolean isFull() {
		return ((s.length-1)==tail);
	}
    public static void enqueue(String item) {
    	if((s.length-1)==tail){ //this means the array is full
    	   resize(2 * s.length); //double the array
    	}
    	s[tail+1]=item; 
    	if(head==-1 && tail==-1) { //if the array is empty
    		head++; //instead of just incrementing tail by one also increment head
    		tail++;
    	}
    	else {
    		tail++;
    	}
    	
    }
    
    private static String[] resize(int capacity) {
     	String[] copy= new String[capacity]; //creates a new array with the desired capacity
    	for(int i=0;i<(tail-head+1);i++) { //copies only the part of the previous array that had actual items
    		copy[i]=s[head+i]; 
    	}
    	
    	return s=copy;//equals the previous array to the new one, "organized" and with the capacity desired
    }
    public static String dequeue() {
    	String item = null;
    	
    	if(head==-1 && tail==-1) { //if the head is -1 and the tail is also -1 then the array is just empty
    		System.out.println("The list is empty");
    	}
    	else if(head==tail) { //if the head is equal to the tail then the array only has one item
    		item=s[head]; //storing the item that is going to be removed
    		s[head]=null;// making that one item null
    		head=-1; //since the array only had one item then by removing it I make it empty again so head and tail are again -1
    		tail=-1;
    		return item;
    	}
    	else {
    		item=s[head]; //saving the item
    		s[head]=null; //making the item null at beginning 
    		head++;// adding one to head and making the new head the next item
    	}
    	if((tail-head+1)==(s.length/4)) { //if the number of items in the array(no matter in which position they are) are less or equal to one quarter of the whole array then halve the array
    		resize(s.length/2); //here I introduce a function made by myself for this specific case
    		tail=tail-head; //since its going to be halve now I also have to change the value of head and tail.
    		head=0; //you can imagine the items like a block, for example, in the middle of the list and I transfer that block to the beginning, so head is going to go to zero and since its a block then tail is going to be tail-head.
    		
    	}
    	return item;
    	
    }
    public static void readQueue() { //this one I tried not to use a function not made by myself but it was a bit hard so I just googled
    	
    	//for(i=head;i<=tail;i++) {
    		//Arrays.deepToString(a)
    	//}
    	System.out.println(Arrays.deepToString(s));
    }
    
    public static void main(String[] args) {
		 String[] s=createArray(3);
		 enqueue("hello");
		 enqueue("good");
		 enqueue("double next");
		 readQueue();
		 enqueue("now doubled");
		 readQueue();
		 dequeue();
		 dequeue();
		 readQueue();
		 System.out.println(head);
		 System.out.println(tail);
		 dequeue();
		 readQueue();
		 System.out.println(head);
		 System.out.println(tail);
	}

}
