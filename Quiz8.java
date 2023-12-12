package week8;
import java.util.*;

public class Quiz8 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		  System.out.println(list);
		  add5Numbers(list);
		  System.out.println(list);
		}
	public static void add5Numbers(ArrayList<Integer> list) {
		  list.add(1);
		  list.add(2);
		  list.add(3);
		  list.add(4);
		  list.add(5);
		  System.out.println(list);
		}
}
