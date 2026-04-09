
package zohoquestion;


public class ZohoQuestion2 
{
    public static void main(String[] args) 
    {
        int r = 5;

            for (int i = 1; i <= r; i++) {
            
            int n = i; 
            int difference = r - 1; 

            for (int j = 1; j <= i; j++) {
                
                System.out.print(n + " ");
                
                n = n + difference;
                
                difference--; 
            }
            
            System.out.println();
        }
    }
}
