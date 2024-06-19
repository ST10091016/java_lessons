public class GarbageMain{
    public static void main(String[] args){
    	Garbage garbage = new Garbage("Garbage 1");
    	Garbage garbage2 = new Garbage("Garbage 2");
    	Garbage garbage3 = new Garbage("Garbage 3");
    	Garbage garbage4 = new Garbage("Garbage 4");
    	Garbage garbage5 = new Garbage("Garbage 5");

    	garbage.finalize();
        garbage2.finalize();
        garbage3.finalize();
        garbage4.finalize();
        garbage5.finalize();

        new Garbage("Garbage 1");
        new Garbage("Garbage 2");
        new Garbage("Garbage 3");
        new Garbage("Garbage 4");
        new Garbage("Garbage 5");

        System.gc();
    }
}