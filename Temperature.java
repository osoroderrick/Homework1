import java.util.Scanner;

public class Temperature {


    public static void main(String[] args) {
        while(true) {
            Scanner askTemp = new Scanner(System.in);
            System.out.println("Do you think the temperature is High, Low, or Humid?:");
            String userAnswer = askTemp.nextLine();

            if (userAnswer.equalsIgnoreCase("High")) {
                System.out.println("sunblock may be needed");
                break;
            } else if (userAnswer.equalsIgnoreCase("Low")) {
                System.out.println("a coat may be needed");
                break;
            } else if (userAnswer.equalsIgnoreCase("Humid")) {
                System.out.println("it's muggy!");
                break;
            } else {
                System.out.println("Try Again");

            }
        }
    }
}
