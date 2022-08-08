package treeSet;

import java.util.TreeSet;

public class CloneTreeset {

	public static void main(String[] args) 
	{
		TreeSet<String> tree_set=new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree-set"+tree_set);
		  TreeSet<String> new_tree_set=(TreeSet<String>)tree_set.clone();
		  System.out.println("New tree set"+new_tree_set);

	}

}
