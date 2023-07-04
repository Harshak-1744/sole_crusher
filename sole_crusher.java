import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sole_crusher 
{
    public static void main(String[] args) {
        ArrayList<String> swear_string = new ArrayList<>();
        swear_string.add("Your programming abilities are so outdated, they should be stored in a museum.");
        swear_string.add("The complexity of your code is truly mesmerizing—to the point of inducing sleep.");
        swear_string.add("Congratulations on achieving the bare minimum. You must be so proud.");
        swear_string.add("Your code is so advanced, it's practically back in the Stone Age.");
        swear_string.add("Your project's success rate is like dividing by zero — a guaranteed crash.");
        swear_string.add("Your problem-solving skills are like a never-ending loop of incompetence.");
        swear_string.add("Your programming abilities are so outdated, they should be stored in a museum.");
        swear_string.add("You cant win..!");
        swear_string.add("Your skills are truly one in a billion. Too bad there are billions of others.");

        Collections.shuffle(swear_string);

        int index = 0;

        Scanner sc = new Scanner(System.in);
        String response;

        System.out.println("Enter 'quit' to give up or any other input to get a response:");
        while (true) 
        {
            response = sc.nextLine();

            if (response.equalsIgnoreCase("quit")) 
            {
                break;
            }

            String element = swear_string.get(index);
            System.out.println(element);

            index = (index + 1) % swear_string.size();
        }

        System.out.println("Goodbye!");
    
    
    
    sc.close();
    }
}
