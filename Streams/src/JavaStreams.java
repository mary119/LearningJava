import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {

		ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		num.add(16);
		
		System.out.println("The numbers are:"+num);
		
		//square each num
		num.forEach(n->System.out.println(n*n));
		
		List<Integer> result=num.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("The result is:"+result);
		
		Predicate<Integer> checkEven=sqr->(sqr%2==0);
		
		List<Integer> evenresult=num.stream().map(n->n*n).filter(checkEven).collect(Collectors.toList());
		System.out.println("The result of even is:"+evenresult);
		
		System.out.println("Using forEach");
		num.stream().map(n->n*n).filter(checkEven).forEach(n->System.out.println("*****"+n));
		
		
		map.entrySet().stream().map(e->e.getkey().getClassName(), e.getValue()).collect;
	}

}
