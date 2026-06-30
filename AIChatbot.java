import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class AIChatbot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String userInput;

        System.out.println("========================================");
        System.out.println("        SMART AI CHATBOT");
        System.out.println("========================================");
        System.out.println("Hello! I am your virtual assistant.");
        System.out.println("Ask me anything or type 'help' to see commands.");
        System.out.println("Type 'exit' to end the chat.");
        System.out.println();

        while(true)
        {
            System.out.print("You : ");
            userInput = sc.nextLine().toLowerCase();

            if(userInput.equals("exit"))
            {
                System.out.println("Bot : Thank you for chatting with me.");
                System.out.println("Bot : Have a wonderful day!");
                break;
            }

            else if(userInput.equals("help"))
            {
                System.out.println("\nAvailable Commands");
                System.out.println("-----------------------------");
                System.out.println("hello");
                System.out.println("how are you");
                System.out.println("your name");
                System.out.println("java");
                System.out.println("date");
                System.out.println("time");
                System.out.println("motivate me");
                System.out.println("tell me a joke");
                System.out.println("calculate");
                System.out.println("bye");
                System.out.println();
            }

            else if(userInput.contains("hello") || userInput.contains("hi"))
            {
                System.out.println("Bot : Hello! Nice to meet you.");
            }

            else if(userInput.contains("how are you"))
            {
                System.out.println("Bot : I am doing great. Hope you are doing well too!");
            }

            else if(userInput.contains("your name"))
            {
                System.out.println("Bot : My name is Smart AI Chatbot.");
            }

            else if(userInput.contains("java"))
            {
                System.out.println("Bot : Java is an object-oriented programming language used for developing desktop, web and mobile applications.");
            }

            else if(userInput.contains("date"))
            {
                System.out.println("Bot : Today's Date is " + LocalDate.now());
            }

            else if(userInput.contains("time"))
            {
                System.out.println("Bot : Current Time is " + LocalTime.now().withNano(0));
            }

            else if(userInput.contains("motivate"))
            {
                System.out.println("Bot : Success doesn't come from what you do occasionally.");
                System.out.println("Bot : It comes from what you do consistently.");
            }

            else if(userInput.contains("joke"))
            {
                System.out.println("Bot : Why do programmers prefer dark mode?");
                System.out.println("Bot : Because light attracts bugs!");
            }

            else if(userInput.contains("calculate"))
            {
                System.out.print("Enter First Number : ");
                int a = sc.nextInt();

                System.out.print("Enter Second Number : ");
                int b = sc.nextInt();

                sc.nextLine();

                System.out.println("Addition       : " + (a+b));
                System.out.println("Subtraction    : " + (a-b));
                System.out.println("Multiplication : " + (a*b));

                if(b!=0)
                    System.out.println("Division       : " + (a/b));
                else
                    System.out.println("Division       : Cannot divide by zero");
            }

            else if(userInput.contains("thank"))
            {
                System.out.println("Bot : You're welcome! Happy to help.");
            }

            else if(userInput.contains("bye"))
            {
                System.out.println("Bot : Goodbye! Take care.");
                break;
            }

            else
            {
                System.out.println("Bot : Sorry! I don't understand that.");
                System.out.println("Bot : Type 'help' to view available commands.");
            }
        }

        sc.close();
    }
}