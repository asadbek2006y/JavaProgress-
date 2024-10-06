import java.util.Random;

public class SwitchCaseExample {

    public static void main(String[] args) {
        
        Random random = new Random();
        // Correctly defining the array of days
        String[] days = {"Monday", "Sunday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // Selecting a random day from the array
        String day = days[random.nextInt(days.length)];

        // Printing the randomly selected day
        System.out.println("Random day: " + day);

        // Using switch to perform actions based on the day
        switch(day){
            case "Sunday": 
                System.out.println("It is Sunday!");
                break;
            case "Monday": 
                System.out.println("It is Monday!");
                break;
            case "Tuesday": 
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday": 
                System.out.println("It is Wednesday!");
                break;
            case "Thursday": 
                System.out.println("It is Thursday!");
                break;
            case "Friday": 
                System.out.println("It is Friday!");
                break;
            case "Saturday": 
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
