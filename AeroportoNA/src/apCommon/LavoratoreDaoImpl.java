package apCommon;

import java.util.ArrayList;
import java.util.List;

public class LavoratoreDaoImpl implements LavoratoreDao {

	//list is working as a database
	 List<Lavoratore> lavoratori;
	 
	 
	 
	public LavoratoreDaoImpl(){
	      lavoratori = new ArrayList<Lavoratore>();
	      Lavoratore lavoratore1 = new Lavoratore("Mario", "Belillo", "MRBLZI53R02G979M", "M", 2, 1, 1987, "mario.belillo@hotmail.com",
	    		  									"3399957060", "64014", "Via Amerigo Vespucci", 47 , "Password123123", "0");
	      Lavoratore lavoratore2 = new Lavoratore("Federico", "Alberghini", "FDALTF89R65F020Q", "M", 16, 7, 1995, "f3d3r1c0@hotmail.com",
	    		  									"6747627574", "00060", "Via Piave", 51, "ForzaNapoli", "1");
	      lavoratori.add(lavoratore1);
	      lavoratori.add(lavoratore2);	
	   }
	 
	@Override
	public List<Lavoratore> getAllLavoratori() {
		return lavoratori;
	}

	@Override
	public Lavoratore getLavoratore(String CF) {
		for (Lavoratore lavoratore: lavoratori) {
		     if((lavoratore.getCF()).equals(CF))
		    	 return lavoratore;
		    }
		return null;
	}
	
	//public Lavoratore(String nome, String cognome, String CF, String sesso, int giornoNascita, int meseNascita,
//	int annoNascita, String email, String cellulare, String CAP, String indirizzo, int numeroIndirizzo,
//	String password) 
	
	@Override
	public void updateLavoratori(Lavoratore lavoratore) {
		int ID = Integer.parseInt(lavoratore.getIDLavoratore());
		(lavoratori.get(ID)).setNome(lavoratore.getNome());
		(lavoratori.get(ID)).setCognome(lavoratore.getCognome());
		(lavoratori.get(ID)).setCF(lavoratore.getCF());
		(lavoratori.get(ID)).setSesso(lavoratore.getSesso());
		(lavoratori.get(ID)).setGiornoNascita(lavoratore.getGiornoNascita());
		(lavoratori.get(ID)).setMeseNascita(lavoratore.getMeseNascita());
		(lavoratori.get(ID)).setAnnoNascita(lavoratore.getAnnoNascita());
		(lavoratori.get(ID)).setEmail(lavoratore.getEmail());
		(lavoratori.get(ID)).setCellulare(lavoratore.getCellulare());
		(lavoratori.get(ID)).setCAP(lavoratore.getCAP());
		(lavoratori.get(ID)).setIndirizzo(lavoratore.getIndirizzo());
		(lavoratori.get(ID)).setNumeroIndirizzo(lavoratore.getNumeroIndirizzo());
	}

	@Override
	public void deleteLavoratore(Lavoratore lavoratore) {
		lavoratori.remove(lavoratore);
	}

}
