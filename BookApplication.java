/*
Plamen Ivanchev , B00793955
*/


package coursework;

import java.util.ArrayList;
import java.util.Scanner;


public class BookApplication {
        
    static ArrayList<Books> books=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        showMenu();
        
        sc.close();
       
    }
    
   
        public static void showMenu(){
            
            /*
            Creating user menu with 4 options to chose
            */
            
            Scanner input=new Scanner(System.in);
        
            System.out.print("========== WELCOME TO THIS BOOK APPLICATION ==========");
            System.out.println();
            System.out.println("1: How many books you want this application to store?");
            System.out.println("   Add books details.");
            System.out.println("============================================================");
            System.out.println("2: Search for a book.");
            System.out.println("============================================================");
            System.out.println("3: Display all the books.");
            System.out.println("============================================================");
            System.out.println("4: Exit application.");
            System.out.println();
            System.out.println();
            
            int choice = input.nextInt(); //getting user input
            
            
              
            switch(choice){
                
                case 1:addingBooks();
                        break;
                    
                case 2:displaySpecificBook();
                    break;
                    
                case 3:displayAllTheBooks();
                        break;
                    
                case 4: exitApplication();
                        break;
                    
                default: 
                         backToMenu();
                         break;
                }
}
        
        
        public static void addingBooks(){
            
            /*
            Creating method to add books to the list
            */
            
            System.out.print("How many books you want to add to the list?: ");
            int choice1=sc.nextInt();
            

            int num=0;//creating variable num which will count how many books are added
            while(num<choice1){
                
              
            sc.nextLine();  
            System.out.print("Enter book title: ");
            String title=sc.nextLine();
            
            System.out.print("Enter author:");
            String author=sc.nextLine();
            
            System.out.print("Enter date of publishing: ");
            String date=sc.nextLine();
                
                /*
                adding book to the Fiction class
                */
                System.out.println("Press 'F' if this book is a Fiction and press 'N' if this book is Non-fiction");
                char answer=sc.next().charAt(0);
                if(answer=='f' || answer=='F'){
                    books.add(new Fiction(title,author,date));
                    System.out.print("Book added to Fiction Section");
                    
                }
                /*
                adding book to the Non Fiction class
                */
                else if(answer=='n'|| answer=='N'){
                    books.add(new NonFiction(title,author,date));
                    System.out.print("Book added to Non-Fiction Section");
                }else{
                    System.out.print("Wrong input!");
                    
                }
                System.out.println();
                num++;
            }
                backToMenu();
        }  
        
        public static void displaySpecificBook(){
            /*
             Creating a method to display specific book
             */
            
            System.out.println("Which book from the list you want to be displayed?");
            String bookDisplayed=sc.next();
            
            for(Books b : books){
               if(b.title.contains(bookDisplayed)){
                   System.out.println(b);
               }
           }
                   
                 
            backToMenu();
                    
        }
                    
        
        public static void displayAllTheBooks(){
            System.out.println("The book list is: \n");
            
            System.out.println(books.toString());
            
            backToMenu();
        }
        
        public static void exitApplication(){
            System.out.println("You chose to exit the application.");
            System.out.println("============ Goodbye ============");
        }
        
        public static void backToMenu(){
             System.out.println("Do you want to go back to the main menu? Y/N");
            char answer1=sc.next().charAt(0);
            if(answer1=='y' || answer1=='Y'){
                showMenu();
            }else if(answer1=='n' || answer1=='N'){
                 exitApplication();
            }else{
                System.out.print("Invalid input.Try again!");
                showMenu();
        }
   }
}
        