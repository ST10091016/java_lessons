public class RapperBean implements java.io.Serializable{
    
    public RapperBean(){

    }
	private int houses;
	private int albums;
	private double cash;

    public void setHouse(int house){
    	this.houses = house;
    }

    public int getHouse(){
    	return houses;
    }

    public void setAlbums(int albums){
    	this.albums = albums;
    }

    public int getAlbums(){
    	return albums;
    }
    
    public void setCash(double cash){
    	this.cash = cash;
    }

    public double getCash(){
    	return cash;
    }

}