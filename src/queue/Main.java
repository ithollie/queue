package queue;

/**
 *
 * @author Ibrahim Thollie
 * This  code is written  by  Ibrahim Thollie.
 */
public class Main {

	public static void main(String[] args) {
		//queue instance
		Queue q  = new Queue(6);
		//list is  empty  or  not 
		System.out.println("Is Empty == " + "  " + q.isEmpty());

		q.insert(20);
		q.insert(20);
		q.insert(79);
		q.insert(90);
		q.insert(70);
		q.insert(69);
		//q.insert(200);
		//view array
		q.view();
		
		//peekfront
		System.out.println("Peek  front" + " " + q.peekFront());
		System.out.println("peek last "   + " " + q.peekLast()) ;
		System.out.println("Items  removed");
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		//view items
		q.view();
		System.out.println("number of Items is " + "  "  + q.numOfItems());
		System.out.println("Peek  front" + " " + q.peekFront());
	}
	

}
