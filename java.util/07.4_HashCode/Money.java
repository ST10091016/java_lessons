class Money implements Comparable<Money>{
   
   private Currency currency;
   private double value;
   
   public double getValue(){
      return value;
   }

   public Currency getCurrency(){
      return currency;
   }

   public void setValue(double v){
      this.value = v;
   }

   public void setCurrency(Currency c){
      this.currency = c;
   }

   public String toString() {
        return "Money " +
                "currency = " + currency +
                ", value = " + value; }

   public Money(Currency c, double v){
      
	      this.currency = c;
	      this.value = v;
   }
   
   @Override
   public int compareTo(Money m){
      return 0;
   }

   @Override
    public int hashCode() {
       return this.currency.hashCode() + (int)(this.value * 100);
    }
}