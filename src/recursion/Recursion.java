package recursion;

/**
 *
 * @author nick.sabanis
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getSum(3));
        
    }
    
    public static int getSum (int number){
        if (number ==1){
            return 1;
        }else{
            return number+ getSum(number-1);
        }
    }
    
}
