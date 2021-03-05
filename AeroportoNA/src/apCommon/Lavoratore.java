package apCommon;

public class Lavoratore {
	
	//Attributi
	private String nome;
	private String cognome;
	private String CF;
	private String sesso;
	private int giornoNascita;
	private int meseNascita;
	private int annoNascita;
	private String email;
	private String cellulare;
	private String CAP;
	private String indirizzo;
	private int numeroIndirizzo;
	private String password;
	private String IDLavoratore;

	//Costruttore vuoto
	public Lavoratore(){
	}
		
	//Costruttore con parametri
	public Lavoratore(String nome, String cognome, String CF, String sesso, int giornoNascita, int meseNascita,
			int annoNascita, String email, String cellulare, String CAP, String indirizzo, int numeroIndirizzo,
			String password, String IDLavoratore) {
		this.nome = nome;
		this.cognome = cognome;
		this.CF=CF;
		this.sesso = sesso;
		this.giornoNascita = giornoNascita;
		this.meseNascita = meseNascita;
		this.annoNascita = annoNascita;
		this.email = email;
		this.cellulare = cellulare;
		this.CAP = CAP;
		this.indirizzo = indirizzo;
		this.numeroIndirizzo = numeroIndirizzo;
		this.password = password;
		this.IDLavoratore = IDLavoratore;
	}

	//Metodi
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public int getGiornoNascita() {
		return giornoNascita;
	}

	public void setGiornoNascita(int giornoNascita) {
		this.giornoNascita = giornoNascita;
	}

	public int getMeseNascita() {
		return meseNascita;
	}

	public void setMeseNascita(int meseNascita) {
		this.meseNascita = meseNascita;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public String getCAP() {
		return CAP;
	}

	public void setCAP(String cAP) {
		CAP = cAP;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getNumeroIndirizzo() {
		return numeroIndirizzo;
	}

	public void setNumeroIndirizzo(int numeroIndirizzo) {
		this.numeroIndirizzo = numeroIndirizzo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIDLavoratore() {
		return IDLavoratore;
	}

	public void setIDLavoratore(String iDLavoratore) {
		IDLavoratore = iDLavoratore;
	}

	
	
	
}
