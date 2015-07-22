// 1st Phase: Alla base dell'incapsulamento c'è il dichiarare tutti gli attrivuti di una classe privati!!
// 2nd Phase: Creare tutti i metodi Setter and Getter (saranno la nostra interfaccia per accedere alle variabili dalle
//            altre classi)
// 3st Phase: Si può dichiarare privata anche una metodo, questo fa si che quel metodo sia visibile solo a quella classe
//            la si utilizza quando si vogliono proteggere dati privati

public class Motorino {
	private String colore;
	private float velocita;
	private String tipo;
	private boolean antifurto = false;

	public Motorino(String colore, float velocita, String tipo) {

		this.colore = colore;
		this.velocita = velocita;
		this.tipo = tipo;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public float getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAntifurto() {
		return antifurto;
	}

	public void setAntifurto(boolean antifurto) {
		this.antifurto = antifurto;
	}

	public void accelera(float v) {
		if (antifurto == false) {
			velocita += v;
		}
	}

	public void inserisciAntifurto() {
		antifurto = true;
	}

}
