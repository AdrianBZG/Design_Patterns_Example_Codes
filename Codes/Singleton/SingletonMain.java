package es.ull.esit.pai.exposition.Singleton;


public class SingletonMain {
	public static void main (String args[]) {
		
		SingletonClass singleton = SingletonClass.getInstance();
		singleton.setValue(10);
		System.out.println (singleton.getValue());
		
		SingletonClass singleton2 = SingletonClass.getInstance();
		System.out.println (singleton2.getValue());
		
		singleton2.setValue(30);
		System.out.println (singleton.getValue());
		

		//SingletonClass singleton3 = new SingletonClass ();
		
	}

}
