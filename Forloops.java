/**
 * Skelton code for the for loops practice day
 * 
 * @author Roy Chancellor
 * @version 2/26/2019
 */
public class Forloops
{
    public static void main( String args[] ) {
        int i, cube;
        
        System.out.println();
        System.out.println("i\tcube i");
        
        for (i=1; i <=10; i = i + 1) {
            cube = i * i * i;
            System.out.println(i + "\t" + "\t" + cube);
        }
        
        for(i=99; i >= 1; i = i - 2) {
            cube = i * i * i;
            System.out.println(i + "\t" + "\t" + cube);
        } 
        
        String myStr = "The quick brown fox jumped over the lazy dog";
        System.out.println(myStr);
        
        int n = myStr.length();
        myStr.charAt(0);
        for(int t=0; t < n; t++){
            System.out.println(myStr.charAt(t));
    }
        
    }
}
            
            
         