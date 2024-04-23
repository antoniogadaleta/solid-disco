package dizionari;

public class Book {
	protected String id;
	protected String titolo;
	protected String autore;
	
	public Book(String id, String titolo, String autore) {
		this.id=id;
		this.titolo=titolo;
		this.autore=autore;
		
	}
	@Override
	public String toString() {
		return id + ", " + titolo + ", "+autore;
	}
	public String getId() {
		return id;
	}
	public String  getTitolo() {
		return titolo;
	}
	public String  getAutore(){
		return autore;
	}

}