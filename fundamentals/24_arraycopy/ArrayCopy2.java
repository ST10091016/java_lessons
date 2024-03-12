public class ArrayCopy2 {
   public static void main(String[] args) {
       Integer[ ] src  = new Integer[]{1,2,3,4,5,6,7,8,9};
       Integer[ ] dest = new Integer[9];

       System.arraycopy( src, 0, dest, 0, src.length -5 );
       for(int i = 0; i< dest.length ; i++){
           System.out.println(dest[i]);
     }
   }
}
