public class Tren {
	public String destinatie;
	public String ora;
	public String cod;
	
	public Tren(String destinatie,String ora,String cod) {
		this.destinatie=destinatie;
		this.ora=ora;
		this.cod=cod;
	}
	
	public String Destinatie() {
		return destinatie;
	}
	
	public String Ora() {
		return ora;
	}
	
	public String Cod() {
		return cod;
	}
	
	public String toString() {
		return "Destinatia : "+this.destinatie+" Ora plecarii : "+this.ora+" Codul trenului : "+this.cod;
	}
}
