package apCommon;

import java.sql.Time;
import java.util.Calendar;

public class Volo {
	
	//Attributi
	private String orarioPartenza;
	private String orarioArrivo;
	private String dataPartenza;
	private String dataArrivo;
	private int numPrenotazioni;
	private Aereo aereo;
	
	//Costruttore vuoto
	public Volo(){
		
	}

	//Costruttore con parametri
	public Volo(String orarioPartenza, String orarioArrivo, String dataPartenza, String dataArrivo, int numPrenotazioni, Aereo aereo){
		this.orarioPartenza = orarioPartenza;
		this.orarioArrivo = orarioArrivo;
		this.dataPartenza = dataPartenza;
		this.dataArrivo = dataArrivo;
		this.numPrenotazioni = numPrenotazioni;
		this.aereo = aereo;
	}
	
	//Metodi
	/**Metodo che permette di rischedulare un volo attraverso la modifica dell'aereo, del'orario e della data della partenza/arrivo
	 * @param orarioPartenza
	 * @param orarioArrivo
	 * @param dataPartenza
	 * @param dataArrivo
	 */
	public void rischedula(Time orarioArrivo, Calendar dataPartenza, Calendar dataArrivo) {
		//this.orarioArrivo=orarioArrivo;
		//this.dataPartenza=dataPartenza;
		//this.dataArrivo=dataArrivo;
	}

	public String getOrarioPartenza() {
		return orarioPartenza;
	}

	public void setOrarioPartenza(String orarioPartenza) {
		this.orarioPartenza = orarioPartenza;
	}

	public String getOrarioArrivo() {
		return orarioArrivo;
	}

	public void setOrarioArrivo(String orarioArrivo) {
		this.orarioArrivo = orarioArrivo;
	}

	public String getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(String dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

	public String getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(String dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public int getNumPrenotazioni() {
		return numPrenotazioni;
	}

	public void setNumPrenotazioni(int numPrenotazioni) {
		this.numPrenotazioni = numPrenotazioni;
	}

	public Aereo getAereo() {
		return aereo;
	}

	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}

	
}
