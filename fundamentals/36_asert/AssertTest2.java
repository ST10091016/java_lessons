public class AssertTest2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        boolean c = (a > 0 && b > 10);
       
        assert c : "expected number to be greater than number";
        System.out.println("Finished");
    }
}
