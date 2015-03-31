/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advanced_for;

/**
 *
 * @author Mamba
 */
public class Advanced_for {

    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        int my_array[]={3,4,5,6,7,8,9};
        for(int holder: my_array)
        {
            sum+=holder;
        }
        System.out.println("The sum is "+sum);
    }
    
}
