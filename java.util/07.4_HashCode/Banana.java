public class Banana {
    private String colour;
    private int size;
    public String getColour() {
   	 return colour;
    }
    public void setColour(String colour) {
   	 this.colour = colour;
    }
    public int getSize() {
   	 return size;
    }
    public void setSize(int size) {
   	 this.size = size;
    }

    //--------HashCode method
    @Override
    public int hashCode() {
   	 return colour.hashCode()+size;
    }
}
