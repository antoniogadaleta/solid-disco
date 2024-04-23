package dizionari;

public class Book2 {
	private String ID;
	private String name;
	private String author;
	
	public void setID(String ID)
	{
		this.ID=ID;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return name;
	}
	public String getAuthor()
	{
		return author;
	}
	public String toString() {
		return ID+" "+name+" "+author;
	}
}
