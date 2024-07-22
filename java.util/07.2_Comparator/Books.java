public class Books{

	private String title;
	private int price;

	public void setTitle(String t){

        this.title = t;
	}

	public String getTitle(){

		return this.title;
	}

	public void setPrice(int p){

		this.price = p;
	}

	public int getPrice(){

		return this.price;
	}

	public Books(String t, int p){

		this.title = t;
        this.price = p;

	}

	public String toString(){

		return "Title = " + this.title + " Price = " + this.price; 
	}
}