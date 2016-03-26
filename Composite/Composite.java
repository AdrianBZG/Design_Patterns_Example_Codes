/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 */
package es.ull.esit.pai.exposition.Composite;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> sons = new ArrayList<Component> ();
	
	/**
	 * Constructor
	 * @param name of the Component
	 */
	public Composite (String name) {
		super(name);
	}
	
	/**
	 * Add Component to this composite
	 */
	@Override
	public void add(Component component) {
		sons.add(component);
	}

	/**
	 * Remove Component from this composite
	 */
	@Override
	public void remove(Component component) {
		sons.remove(component);
	}

	/**
	 * Show all sons inside the composite
	 */
	@Override
	public void show(int depth) {
		String title = new String();
		for (int i = 0; i < depth; i++)
			title += "    ";
		title += "-" + name;
		System.out.println (title);
		for (int i = 0; i < sons.size(); i++) {
			sons.get(i).show(depth + 1);
		}
	}

}
