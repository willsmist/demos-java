package recursion;

import java.util.ArrayList;
import java.util.List;

public class Fib {

	public static void main(String[] args) {
		System.out.println(fib(1000));
	}
	
	public static List<Long> fib(int n){
		List<Long> fibs = new ArrayList<Long>();
		Long a = 0L;
		Long b = 1L;
		for(int i = 0; i < n; i++){
			fibs.add(a);
			Long t = 0L;
			t = a + b;
			a = b;
			b = t;
		}
		return fibs;
	}

}
