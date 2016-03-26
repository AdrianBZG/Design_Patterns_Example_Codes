/**
 * @Author Rudolf Cicko & Adrián Bazaga 
 */
package es.ull.esit.pai.exposition.Composite;

public abstract class Component {
	protected String name;
	public Component (String aName) {
		name = aName;
	}
	abstract public void add (Component c);
	abstract public void remove (Component c);
	abstract public void show (int depth);
}


