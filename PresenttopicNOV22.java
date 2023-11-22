/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenttopicnov22;

/**
 *
 * @author Gonzales_CPE
 */
public class PresenttopicNOV22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Z[]={2,4,6,8,10,12,14,16,18,20};
        int sum=0; double ave;
        for (int i =0; i < Z.length; i++){
            
            System.out.println(Z[i]);
            sum=sum+Z[i];
        }
        
        ave=sum/Z.length;
        System.out.println( sum);
        System.out.print( ave);
    }
    
}
