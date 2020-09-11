
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Cities   {

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
		
		
	}
	  ListIterator<String> itr=cities.listIterator();  

	  //Iterator<String>  itr =cities.iterator();
	
	

}
