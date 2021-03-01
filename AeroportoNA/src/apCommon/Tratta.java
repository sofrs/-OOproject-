package apCommon;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tratta {
	
	//Attributi
	private String città;
	private Volo volo;
	
	//Costruttori
	
	
	//Metodi
	public String getCittà() {
		return città;
	}
	
	public void setCittà(String città) {
		this.città = città;
	}
	
	public Volo getVolo() { //TO-DO
		return volo.getVoloInfo();
	}
	
	public void setVolo(Volo volo){
		this.volo = volo;
	}
}
