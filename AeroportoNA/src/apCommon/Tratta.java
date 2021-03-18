package apCommon;

public class Tratta {
	
	//Attributi
	private String città;
	private String orarioPartenza;
	private String orarioArrivo;
	private String dataPartenza;
	private String dataArrivo;
	private int numPrenotazioni;
	
	//Costruttore vuoto
	public Tratta() {
		
	}
	
	
	//Costruttore con parametri
	public Tratta(String città, String orarioPartenza, String orarioArrivo, String dataPartenza, String dataArrivo,
			int numPrenotazioni) {
		super();
		this.città = città;
		this.orarioPartenza = orarioPartenza;
		this.orarioArrivo = orarioArrivo;
		this.dataPartenza = dataPartenza;
		this.dataArrivo = dataArrivo;
		this.numPrenotazioni = numPrenotazioni;
	}

	//Metodi
	public String getCittà() {
		return città;
	}


	public void setCittà(String città) {
		this.città = città;
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


	public void setDataArrivo(String dataArrivo) {
		this.dataArrivo = dataArrivo;
	}


	public void setOrarioArrivo(String orarioPartenza, String città) {
		int minSom = 0;
		int oraSom = 0;
		int ora = 0;
		int min = Integer.parseInt(orarioPartenza.substring(3, 5));
		switch (città) {
			case "Amsterdam":
				minSom = min + 40;
				ora = 2;
				break;
			case "Atene":
				minSom = min + 40;
				ora = 1;
				break;
			case "Barcellona":
				minSom = min + 5;
				ora = 2;
				break;
			case "Berlino":
				minSom = min + 20;
				ora = 2;
				break;
			case "Bruxelles":
				minSom = min + 25;
				ora = 2;
				break;
			case "Cagliari":
				minSom = min + 10;
				ora = 1;
				break;
			case "Catania":
				minSom = min + 0;
				ora = 1;
				break;
			case "Cracovia":
				minSom = min + 0;
				ora = 2;
				break;
			case "Dubai":
				minSom = min + 50;
				ora = 5;
				break;
			case "Genova":
				minSom = min + 25;
				ora = 1;
				break;
			case "Roma":
				minSom = min + 0;
				ora = 1;
				break;
			case "Londa":
				minSom = min + 40;
				ora = 2;
				break;
			case "Torino":
				minSom = min + 40;
				ora = 2;
				break;
			case "Trieste":
				minSom = min + 30;
				ora = 1;
				break;
			case "Venezia":
				minSom = min + 15;
				ora = 1;
				break;
			case "Milano":
				minSom = min + 20;
				ora = 1;
				break;
		}
		
		if(minSom>59){
			oraSom+=1;
			minSom%=60;
		}

		oraSom = oraSom + Integer.parseInt(orarioPartenza.substring(0, 2)) + ora;
		
		if (oraSom>24) {
			oraSom-=24;
			this.orarioArrivo=String.valueOf(oraSom)+":"+String.valueOf(minSom);
		}
		if (oraSom<10) 
			this.orarioArrivo="0"+String.valueOf(oraSom)+":"+String.valueOf(minSom);
		else
			this.orarioArrivo=String.valueOf(oraSom)+":"+String.valueOf(minSom);
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


	public void setDataArrivo(String dataPartenza, String orarioPartenza, String orarioArrivo) {
		int partenza = Integer.parseInt(orarioPartenza.substring(0,2));
		int arrivo = Integer.parseInt(orarioArrivo.substring(0,2));
		if(partenza+arrivo>24) {
			if(dataPartenza.equals("31/03/21")) {
				this.dataArrivo = "01/04/21";
			}
			else if (partenza<10)
				this.dataArrivo = "0"+String.valueOf((Integer.parseInt(dataPartenza.substring(0, 2))+1)+(dataPartenza.substring(2, 8)));
			else
				this.dataArrivo = String.valueOf((Integer.parseInt(dataPartenza.substring(0, 2))+1)+(dataPartenza.substring(2, 8)));
		}
		else
			this.dataArrivo = dataPartenza;
	}


	public int getNumPrenotazioni() {
		return numPrenotazioni;
	}


	public void setNumPrenotazioni(int numPrenotazioni) {
		this.numPrenotazioni = numPrenotazioni;
	}

}
