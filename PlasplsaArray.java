/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plasplsa.array;

/**
 *
 * @author Gonzales_CPE
 */
public class PlasplsaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int large,small,i;
    int a[] = new int[]{ 200, 900 , 3300, 4, 5};
    int n = a.length;
    large=small=a[0];
    for(i=1;i<n;++i)
    {
    if(a[i]>large)
    large=a[i];

    if(a[i]<small)
    small=a[i];
    }

    System.out.println("The smallest element is "  +  small );
    
    System.out.println("The largest element is "  +  large );
    
    
    }
    }
    
    
    
