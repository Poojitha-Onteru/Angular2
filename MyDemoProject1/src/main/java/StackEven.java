import java.util.*;


public class StackEven {
	
	static void onlyEven(LinkedList<Integer> l) {
		for(Integer ele:l) {
			if(ele%2==0) {
				System.out.print(ele+" ");
			}
		}
		
	}
	
	
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(23);
		l.add(12);
		l.add(1);
		l.add(55);
		l.add(22);
		l.add(23);
		onlyEven(l);
	}
}
