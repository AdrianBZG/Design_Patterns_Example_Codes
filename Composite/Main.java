package es.ull.esit.pai.exposition.Composite;

public class Main {
	public static void main (String[] args) {
		Composite root = new Composite ("root");
		root.add(new Element ("Element A"));
		root.add(new Element ("Element B"));
		
		Composite comp = new Composite ("Composite X");
		comp.add(new Element("Element C"));
		comp.add(new Element("Element D"));
		
		root.add(comp);
		root.add(new Element("Element E"));
		
		root.show(0);
		
	}

}
