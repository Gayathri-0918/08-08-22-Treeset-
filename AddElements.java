package treeSet;

import java.util.TreeSet;

public class AddElements {

	public static void main(String[] args) 
	{
		TreeSet<String> tree_set1=new TreeSet<String>();
		  tree_set1.add("Red");
		  tree_set1.add("Green");
		  tree_set1.add("Orange");
		  tree_set1.add("White");
		  tree_set1.add("Black");
		  System.out.println("Tree-set"+tree_set1);
		  TreeSet<String> tree_set2=new TreeSet<String>();
		  tree_set2.add("Red");
		  tree_set2.add("Green");
		  tree_set2.add("yellow");
		  System.out.println("Tree-set"+tree_set2);
		  tree_set1.addAll(tree_set2);
		  System.out.println("Adding two Strings"+tree_set1);

	}

}
