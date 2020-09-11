
import java.util.LinkedList;
import java.util.ListIterator;


public class City{

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		
		cities.add("Banglore");
		cities.addFirst("Manglore");
		cities.add("Mysore");
		cities.offer("Mandya");
		cities.addLast("Raichur");
		cities.add("Kolar");
		cities.add("Kodagu");
		cities.add("Hassan");
		
		System.out.println(cities);
		
		
	     ListIterator<String> litr=cities.listIterator();  
	     while(litr.hasNext()) {
	    	  //String s= litr.next();
	    	  System.out.println(litr.next());
		     //System.out.println(s);

	     }
	     System.out.println();
	     
	     while(litr.hasPrevious()) {
	    	 System.out.println(litr.previous());
	     }
	     
			System.out.println(cities.peek()); 
			System.out.println(cities.peekLast());
			//System.out.println(cities);;
			System.out.println(cities.element());
			
			System.out.println(cities.get(5));
			System.out.println(cities.getFirst());
//
	  
			cities.poll();
			System.out.println(		cities);
			cities.pollLast();
			System.out.println(		cities);
			
	
	}

}
