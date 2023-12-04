import java.util.*;

public class Methods 
{
    // Data Fields
    private int num1;
    private int num2;
    private int userInput;
    Scanner in = new Scanner(System.in);
    
    public Methods()
    {
        createMenu();
    } // end default constructor
    
    public int getNum1()
    {
        return num1;
    } // end default constructor
    
    public void setNum1(int num1)
    {
         // Variable
        boolean badInput = true;
        
        // Validation
        do
        {
            try
            {
                System.out.print("Enter the first number: ");
                num1 = in.nextInt();   
                badInput = false;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invaild input. Must be an integer. Try again");
                badInput = true;
                in.nextLine();
            }
        }while(badInput);
        
        this.num1 = num1;
    } // end mutator method
    
    public int getNum2()
    {
        return num2;
    } // end accessor method
    
    public void setNum2(int num2)
    {
         // Variable
        boolean badInput = true;
        
        // Validation
        do
        {
            try
            {
                System.out.print("Enter the second number: ");
                num2 = in.nextInt();   
                badInput = false;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invaild input. Must be an integer. Try again");
                badInput = true;
                in.nextLine();
            }
        }while(badInput);
        System.out.println();
        
        this.num2 = num2;
    } // end mutator method
    
    public int getUserInput()
    {
        return userInput;
    } // end accessor method
    
    public void setUserInput(int userInput)
    {
        // Variable
        boolean badInput = true;
        
        // Validation
        do
        {
            try
            {
                System.out.print("Enter your choice: ");
                userInput = in.nextInt();
                badInput = false;
            }catch(InputMismatchException e)
            {
                System.out.println("Invaild input. Must be an integer. Try again");
                badInput = true;
                in.nextLine();
            }
        }while(badInput);
        
        this.userInput = userInput;
    } // end mutator method
        
    public void createMenu() // Need a meaningful name
    {
        // Input
        System.out.println("Welcome to my personalized calculator!");
        System.out.println("To get started, you will need to numbers.");
        setNum1(num1);
        setNum2(num2);
        displayMenu(); 
 
        do
        {
            setUserInput(userInput);
            switch(getUserInput())
            {
                case 1: // Addition
                    calcAddition();
                    break;

                case 2: // Subtraction
                    calcSubtraction();
                    
                    break;

                case 3: // Multiplication
                    calcMultiplication();
                    break;

                case 4: // Division
                    break;
                    
                case 6:
                    System.out.println("Thank you for using my program. Goodbye!");
                    in.close();
                    break;

                default:
                    displayErrorMessage();

            } // end switch
        }while(userInput != 6);
    } // end createMenu method
    
    
    public void displayMenu()
    {
        System.out.println("**Calculator Menu**");
        System.out.println("[1]. Addition");
        System.out.println("[2]. Subtraction");
        System.out.println("[3]. Multiplication");
    } // end displayMenu method
    
    public void displayErrorMessage()
    {
        System.out.println("Error. Invaild choice");
    } // end displayErrorMessage method
    
    public void calcAddition()
    {
        // Variable
        int total = 0;
        
        // Calculation
        total = getNum1() + getNum2();
        
        // Output
        System.out.println("The sum of two numbers is: " + total);
    } // end calcAddition method
    
    public void calcSubtraction()
    {
        // Variable
        int total = 0;
        
        // Calculation
        total = getNum1() - getNum2();
        
        // Output
        System.out.println("The difference is " + total);
    } // end calcSubtraction method
    
    public void calcMultiplication()
    {
        // Variable
        int total = 0;
        
        // Calculation
        total = getNum1() * getNum2();
        
        // Output
        System.out.println("THe product is: " + total);
    } // end calcMultiplication method
    
    
    
} // end Methods Class
