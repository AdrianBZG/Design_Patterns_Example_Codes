/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description This class will show int value in Hexadecimal 
 * when the subject updates its value.
 */
package es.ull.esit.pai.exposition.Observer;

public class HexaObserver extends Observer {

	/**
	 * Constructor
	 * @param subject will be the observed object
	 */
	public HexaObserver(Subject subject){
		this.subject = subject;
	    this.subject.attach(this);
	}

	/**
	 * update will be called every time subject set new state
	 */
	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}
