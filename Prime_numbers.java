/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prime_numbers;
import java.util.Scanner;
/**
 *
 * @author Mamba
 */
public class Prime_numbers {

public static void main(String[] args) {
        System.out.println("Enter the number whose prime numbers will be printed: ");
        int n= new Scanner(System.in).nextInt();
        int i=2;
        System.out.println("The prime numbers of " + n + " are: ");
        while(n>1){
            if(n%i==0){
                System.out.println(i + " ");
                n=n/i;
            }
            else
                i++;
        }
        
    }
       
}
