package chapter11;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Forth");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			
			System.out.println(str);
			
			if(str.compareTo("Third") == 0) {
				// compareTo()는 같으면 0 이다.
				
				itr.remove();
			}
		}
		System.out.println("Third 제거 후 list");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
