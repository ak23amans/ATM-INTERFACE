/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atminterface;

import java.util.Scanner;

/**
 *
 * @author Ankit
 */

class Password{
    public int password(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\tPlease Enter Your PIN\t");
        int pass1=sc.nextInt();
       
        return pass1;
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int withdraw ,deposit,balance=0;
        while(true){
            System.out.println("please select the Menu:");
            System.out.println("1 For check Balance: ");
            System.out.println("2 For withdraw Money: ");
            System.out.println("3 For Desposit Money: ");
            System.out.println("4 For Exit");
           Password p=new Password();
           int pass=1234;
           int menu=sc.nextInt();
           
           switch(menu){
               case 1:
                   
                   if (p.password()==pass) {
                   System.out.println("Balance: "+balance);    
                   }
                   else{
                       System.out.println("Sorryyyyyyyyyyyy....Incorrect Your PIN");
               }
                  
                   
                   break;
               case 2:
                   
                   if (p.password()==pass) {
                       
                   
                   System.out.println("please Enter Your Amount: ");
                       withdraw=sc.nextInt();
                   if (balance>=withdraw && balance!=0) {
                       
                       balance=balance-withdraw;
                       System.out.println("****************************");
                       System.out.println("Collect Your Money..........");
                       System.out.println("Thank You!");
                       System.out.println("****************************");
                       System.out.println("Rest Amount "+balance);
                   }
                   else if(balance<withdraw) {
                       System.out.println("Sorryyyyyyyyyyy");
                       System.out.println("Insufficient Balance....");
                   }
                   }
                   else {
                      System.out.println("Sorryyyyyyyyyyyy....Incorrect Your PIN"); 
                   }
                   break;
               case 3:
                   System.out.println("Please Enter Your Amount: ");
                   deposit=sc.nextInt();
                   balance=balance+deposit;
                   System.out.println("Your money is desposited successfully!");
                   break;
               case 4:
                System.out.println("Thank You for using my Atm Machine");
                   System.exit(0);
                
                   break;
                   
           }
                
        }
       
    }
    
}