
package factorial;


public class Factorial {

    
    public static void main(String[] args) {
       
        int fac=1;
        int num=5;
        
        
        while (num!=0) {
            
            fac=fac*num;
            num--;
         }
        
        System.out.println(fac);
        
       
    }
    
}
