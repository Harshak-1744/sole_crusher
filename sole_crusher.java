import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sole_crusher 
{
    public static void main(String[] args) throws InterruptedException
    {
            String banner =
                "   _  __  _      _      _       \n" +
                "  | |/ / (_)  __| |  __| |  ___ \n" +
                "  | ' <  | | / _` | / _` | / _ \\\n" +
                "  |_|\\_\\ |_| \\__,_| \\__,_| \\___/\n";
    
            for (int i = 0; i < banner.length(); i++) 
            {
                System.out.print(banner.charAt(i));
                Thread.sleep(17); 
            }
        System.out.println("Enter 'start' to Start the Program :");
        ArrayList<String> swear_string = new ArrayList<>();
        
        swear_string.add("You cant win..!");
        swear_string.add("Your programming abilities are so outdated, they should be stored in a museum.");
        swear_string.add("The complexity of your code is truly mesmerizing—to the point of inducing sleep.");
        swear_string.add("Congratulations on achieving the bare minimum. You must be so proud.");
        swear_string.add("Your code is so advanced, it's practically back in the Stone Age.");
        swear_string.add("Your project's success rate is like dividing by zero — a guaranteed crash.");
        swear_string.add("Your problem-solving skills are like a never-ending loop of incompetence.");
        swear_string.add("Your programming abilities are so outdated, they should be stored in a museum.");
        swear_string.add("Your skills are truly one in a billion. Too bad there are billions of others.");
        swear_string.add("You're a master of inconsistency. Your work is consistently disappointing.");
        swear_string.add("Congratulations on creating a program that perfectly emulates a sloth—slow, unresponsive, and always taking naps.");
        swear_string.add("You have a knack for turning simple tasks into complex problems. It's like a talent for creating your own obstacles.");
        swear_string.add("Your coding style is a beautiful mess—a Picasso painting with syntax errors.");
        swear_string.add("Your commit messages are so descriptive that they rival the complexity of the code changes themselves.");
        swear_string.add("Your coding speed is impressive. It's like watching a sloth in a marathon—slow and steady wins the race... eventually.");
        swear_string.add("Congratulations on achieving a perfect balance between over-engineering and under-delivering.");
        swear_string.add("Your coding skills are so remarkable, they could almost qualify for a new Guinness World Record category: 'Most Creative Bugs Per Line of Code.");
            
        
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

        System.out.println("Haaha Suck it up looser!");
    
    
    
    sc.close();
    }
}
