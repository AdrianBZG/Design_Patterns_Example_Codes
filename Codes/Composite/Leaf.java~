package es.ull.esit.pai.exposition.Composite;

public class Leaf extends Component {

	public Leaf (String name) {
		super (name);
	}
	@Override
	public void add(Component c) {
		System.out.println ("you can't add anything to an Element");
	}

	@Override
	public void remove(Component c) {
		System.out.println ("You can't remove anything for Element");
	}

	@Override
	public void show(int depth) {
		String title = new String();
		for (int i = 0; i < depth; i++)
			title += "    ";
		title += "-" + name;
		System.out.println (title);
	}
}
