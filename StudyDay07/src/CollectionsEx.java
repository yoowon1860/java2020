import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {

	static void printlist(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else 
				separator = "\n";
			System.out.print(e+separator);
		}
	}

		public static void main(String[] args) {

			LinkedList<String> myList = new LinkedList<String>();
			myList.add("1");
			myList.add("2");
			myList.add("3");
			myList.add("4");
			myList.add("5");
			myList.add("6");
			
			Collections.sort(myList);
			printlist(myList);
			
			Collections.reverse(myList);
			printlist(myList);

		}

	}
