package es.ull.esit.pai.exposition.Singleton;

/**
 * @version 0.0.1
 * @author Rudolf Cicko & Adrián Bazaga Ramón Rodríguez
 * @Description Example of Singleton class
 *
 */
public class SingletonClass {
	private static SingletonClass instance;
	private int value;
	
	/**
	 * Useless constructor
	 */
	private SingletonClass() {}
	
	/**
	 * This is the important method, that allows clients to access the instance
	 * @return the instance 
	 */
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		else {
			System.out.println ("The SingletonClass is already instantiated");
		}
		return instance;
	}
	
	/**
	 * Setter for value attribute
	 * @param aValue is the new value
	 */
	public void setValue (int aValue) {
		value = aValue;
	}
	
	/**
	 * Getter for the value attribute
	 * @return the value
	 */
	public int getValue () {
		return value;
	}
	
}
