/*
1. Ask for user credentials (must be in loop).
2. Choices.
3. Business Calculation flexible enough to solve missing I, P, R, T.
4. Exit program

Additional Point
- Clean output 
- Fallback 
*/

import java.util.Scanner;

public class Main { 
    static Scanner scan = new Scanner(System.in);
    static String Password = "Tulagan";
    static String Username = "Eljay";
    static boolean isLogin = false;
    
    public static void main(String[] math){
        while(true){
            System.out.print("Username?: ");
            String User = scan.nextLine();
            
            System.out.print("Password?: ");
            String Pass = scan.nextLine();
            
            if(Pass.equals(Password) && User.equals(Username)){
                System.out.println("Succesfully login as " + User);
                isLogin = true;
                break;
            }else{
                System.out.println("Wrong Password Or Username, Please try again");
            }
        }   
        // solving math problem
        if(isLogin){
            
            double Interest = 0.0;
            double Principal = 0.0;
            double Rate = 0.0;
            double Time = 0.0;
            
            while(true){
                System.out.println("Welcome to Math solver Buisness Math\nWhat Problem is Missing?\n[1] = Interest\n[2] = Principal\n[3] = Rate\n[4] = Time\n[5] = Leave.");
                int choices = scan.nextInt();
                if(choices == 1){
                    System.out.println("Finding Interest\nAnswer the following question");
                    System.out.print("Principal: ");
                    Principal = scan.nextDouble();
                    System.out.print("Rate: ");
                    Rate = scan.nextDouble() / 100;
                    System.out.print("Time: ");
                    Time = scan.nextDouble();
                    System.out.println("Your Answer is: " + Principal * Rate * Time);
                }else if(choices == 2){
                    System.out.println("Finding Principal\nAnswer the following question");
                    System.out.print("Interest: ");
                    Interest = scan.nextDouble();
                    System.out.print("Rate: ");
                    Rate = scan.nextDouble() / 100;
                    System.out.print("Time: ");
                    Time = scan.nextDouble();
                    System.out.println("Your Answer is: " + Interest / (Rate * Time));
                }else if(choices == 3){
                    System.out.println("Finding Rate\nAnswer the following question");
                    System.out.print("Interest: ");
                    Interest = scan.nextDouble();
                    System.out.print("Principal: ");
                    Principal = scan.nextDouble() / 100;
                    System.out.print("Time: ");
                    Time = scan.nextDouble();
                    System.out.println("Your Answer is: " + Interest / (Principal * Time));
                }else if(choices == 4){
                    System.out.println("Finding Time\nAnswer the following question");
                    System.out.print("Interest: ");
                    Interest = scan.nextDouble();
                    System.out.print("Principal: ");
                    Principal = scan.nextDouble() / 100;
                    System.out.print("Rate: ");
                    Rate = scan.nextDouble();
                    System.out.println("Your Answer is: " + Interest / (Principal * Rate));
                }else{
                    System.out.println("Program End");
                    break;
                }
            }
        }
    }
}

