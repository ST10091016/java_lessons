 public class Money implements Comparable<Money>{
   
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

      if(this.getValue() > m.getValue()){
         return 1;
      }
      else if (this.getValue() < m.getValue()){
         return -1;
      }else{
         return 0;
      }
   }

   public boolean equals(Money m1){
      
      if(m1 == m1){
         return true;
      }else if(m1 == null){
         return false;
      }else{
         return false;
      }
   }
}
