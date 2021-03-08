package apCommon;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import apCommon.TrattaDao;

public class Tratta {
	
	//Attributi
	private Volo volo;
	private String città;
	//private IDTratta IDtratta;
	
	//Costruttore vuoto
	public Tratta() {
		
	}
	
	//Costruttore con attributi
	public Tratta(Volo volo, String città) {
		this.volo=volo;
		this.città=città;
	}
	
	//Metodi
	public Volo getVolo() {
		return volo;
	}

	public void setVolo(Volo volo) {
		this.volo = volo;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public interface TrattaDao {
		public List<String> getAllCittà() throws SQLException;
	}
	
	
}
