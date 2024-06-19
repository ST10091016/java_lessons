package za.access;

class SamePackageAccessor{
   public String getProperty(){

   	 AccessMe am = new AccessMe();
   	 return am.getName();

   }
}