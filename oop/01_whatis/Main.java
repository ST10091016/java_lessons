
public class Main {
    public static void main(String[] args) {
      
      new O().product(3);
  }
}

class M{
  
  int product(int i){
    int result = i*i;
    return result;
  }
}

interface N{
  int product(int i);
}

class O extends M implements N{
  
  public int product(int i){
    
    int result = super.product(i) * i;
    
    System.out.println("In O " + super.product(i) * i);
    return result;
  }
  
}