/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description This class will show int value in Binary when 
 * the subject updates its value.
 */
package es.ull.esit.pai.exposition.Observer;

public class BinaryObserver extends Observer {
	
	/**
	 * Constructor
	 * @param subject will be the observed object
	 */
	public BinaryObserver(Subject subject){
		this.subject = subject;
	    this.subject.attach(this);
	}

	/**
	 * update will be called every time subject set new state
	 */
	@Override
	public void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	}
}
