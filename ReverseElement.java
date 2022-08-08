package treeSet;
import java.util.*;

public class ReverseElement {

	public static void main(String[] args)
	{
		TreeSet<String> tree_set=new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree-set"+tree_set);
		  Iterator it=tree_set.descendingIterator();
		  System.out.println("Reverse Elements is");
		  while(it.hasNext())
			  
		  {
			  System.out.println(it.next());
		  }
	}

}
