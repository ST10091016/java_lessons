public class ConvertNumbers implements Converter{
    
    //declaring and initialising static variables
	static int i = 5;
	static int j = 7;
    
    //declaring and initialising instance variables
	int x = 6;
	int y = 8;
	int var4, var5;
    
    //declaring and initialising final variables
	static final int var2 = 10;
    static final String var3 = "10";
    static final int var1 = 0;
    static int var6, var7;

    static{
    	var7 = 11;
    }

    {
    	var4 = 15;
    	i++;
    	j++;
    	x++;
    	y++;
    	var4++;
    	var5++;
    	var6++;
    	var7++;
    }

    public ConvertNumbers(){
       var5 = 13;
       var6 = 9;
    }

    public ConvertNumbers(int i, int j){
      double result = (i + j - this.var6 + 4.0) + this.var7;
      System.out.println("Result 2: " + result);
    }

    public ConvertNumbers(int a, int b, int c){
      this(a,b);
      double result = (a - b + this.var6 + c) - this.var7;
      System.out.println("Result 3: " + result);
    }

    public void converter(String input){

    	int stringToInt = Integer.parseInt(input);
    	System.out.println("Converted string: " + stringToInt);
    }

    public void doIt(){
    	int a = 2;
    	System.out.println("First overloaded: " + this.doIt(this.x, this.y, a));
    	
    }

    public int doIt(int i, int j, int x){
    	int a = 4, b = 1;
    	System.out.println("Second overloaded: " + this.doIt(i, j, a, b));
        return (i + j - x) / a * var2;
    }

    public static int doIt(int i, int j, int x, int y){
    	
        int a = 3;
    	return (i + j * x) /a * var2;
    }
}