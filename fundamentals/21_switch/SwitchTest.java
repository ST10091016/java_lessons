public class SwitchTest {
    public static void main(String[] args) {
        int a = 4;
       
        // if(a == 1){
        //     System.out.println("Cool 1");
        // }else if(a == 2){
        //     System.out.println("Cool 2");
        // }else if(a == 3){
        //     System.out.println("Cool 3");
        // }else{
        //     System.out.println("Not cool");
        // }

        switch(a){

        case 1:
            System.out.print("Cool 1");
            break;

        case 2:
            System.out.print("Cool 2");
            break;

        case 3:
            System.out.print("Cool 3");
            break;

        case 4:
            System.out.print("Not cool");
            break;

        }
    }
}