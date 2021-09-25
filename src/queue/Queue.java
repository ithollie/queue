package queue;

public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize  = size;
		this.queArray  = new long[size];
		front =  0;
		rear   = -1;
		nItems = 0;
		
	}
	//insert function
	public void  insert(long j) {
		if(rear  == maxSize) {
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	//number of item function
	public int numOfItems() {
		return  nItems;
	}
	//peek front 
	public   long  peekFront() {
		return queArray[front];
	}
	
	//peek rear
	public  long  peekLast(){
		return  queArray[rear];
	}
	public boolean isEmpty() {
		return (nItems == 0);
	}
	// is full
	public  boolean  isFull() {
		return (nItems ==  maxSize);
		
	}
	// remove  function that remove items from  the array 
	public long  remove() {
		long  temp  =  queArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return  temp;
	}
	//view items  function.
	public  void view() {
		for(int i = 0 ; i < queArray.length; i++) {
			System.out.println("Items " +  i + " " + queArray[i]);
		}
	}
	
}
