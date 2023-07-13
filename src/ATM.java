import java.awt.*;
import java.util.Scanner;


public class ATM {

    private int balance=10000;



    public void menu(){
        System.out.println("1. WITHDRAW");
        System.out.println("2. DEPOSIT");
        System.out.println("3. SEE BALANCE");
        System.out.println("4. EXIT");
    }
    private int pin=123;
    int pin_count=1;
    boolean flag=true;


    Scanner sc=new Scanner(System.in);
    int user_pin=0;


    public void function(){
        while (flag){

            System.out.println("enter the pin code");
            user_pin=sc.nextInt();
            if (user_pin!=pin){
                System.out.println("please enter correct password");
                user_pin=sc.nextInt();
                pin_count=pin_count+1;
                if(pin_count==3){
                    System.out.println("please collect your card");
                    System.exit(0);
                }

            } if(user_pin==pin)  {

                while (flag){
                    menu();
                    System.out.println("enter the choice");
                    int choice=sc.nextInt();
                    switch (choice){
                        case (1):
                            System.out.println("enter the amount to withdraw!!!");
                            int with_draw=sc.nextInt();
                            if (balance<with_draw){
                                System.out.println("you have insufficient amount");
                            } else {
                                balance=balance-with_draw;
                                System.out.println("AMOUNT HAS BEEN DETECTED!!");
                            }
                            break;
                        case(2):
                            System.out.println("enter deposit amount");
                            int deposit=sc.nextInt();
                            balance= balance+deposit;
                            System.out.println("amount has benn added");
                            break;

                        case (3):
                            System.out.println("your balance is : "+balance);
                            break;
                        case (4):
                            System.out.println("thank u for visiting");
                            System.exit(0);
                            break;

                    }
                }
                }

        }

















        }

    }


