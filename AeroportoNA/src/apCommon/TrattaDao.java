package apCommon;

import java.util.List;


public interface TrattaDao {
	
	
	public List<Tratta> getTratte();
	public List<Tratta> getTratteAttesa();
	public boolean insertTratta(Tratta tratta, String compagnia);
	public boolean updateTratta(Tratta tratta, String stato);
	public boolean deleteTratta(Tratta tratta);
	boolean updateRitardo(Tratta tratta, String ritardo);
	List<Tratta> getTrattePartite();
	String getRitardo(Tratta tratta);
	String getStato(Tratta tratta);
	List<String[]> ricerca(String città, String terminal, String gate, String compagnia);
	
}
