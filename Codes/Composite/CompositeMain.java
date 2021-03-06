package es.ull.esit.pai.exposition.Composite;

public class CompositeMain {
	public static void main (String[] args) {
		Composite root = new Composite ("root");
		root.add(new Leaf ("Leaf A"));
		root.add(new Leaf ("Leaf B"));
		
		Composite comp = new Composite ("Composite X");
		comp.add(new Leaf("Leaf C"));
		comp.add(new Leaf("Leaf D"));
		
		root.add(comp);
		root.add(new Leaf("Leaf E"));
		
		root.show(0);
		
	}

}
