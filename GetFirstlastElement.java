package treeSet;
import java.util.*;

public class GetFirstlastElement {

	public static void main(String[] args)
	{
		TreeSet<String> tree_set=new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree-set"+tree_set);
		  String first_element=tree_set.first();
		  System.out.println("First elements:"+first_element);
		  String last_element=tree_set.last();
		  System.out.println("Last element:"+last_element);

	}

}
