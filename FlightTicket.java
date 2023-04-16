import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {
        int distance, age, travelType;
        double discount = 1, distanceKM = 0.1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your travel distance.");
        distance = input.nextInt();
        System.out.println("Enter your age.");
        age = input.nextInt();
        System.out.println("Enter your travel type.");
        travelType = input.nextInt();

        while(!(((age > 0) && (distance > 0)) && ((travelType == 1) || (travelType == 2))))
        {
            System.out.println("Your entered information is wrong. Try again.");
            System.out.println("Enter your travel distance.");
            distance = input.nextInt();
            System.out.println("Enter your age.");
            age = input.nextInt();
            System.out.println("Enter your travel type.");
            travelType = input.nextInt();
        }

        if (age < 12)
        {
            if (travelType == 1)
            {
                discount = 1 - (1 * 0.5);
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
            else if (travelType == 2)
            {
                discount = 1 - (1 * 0.5) - ((1 - 1 * 0.5) * 0.2);
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
        }
        else if (age >= 12 && age <= 24)
        {
            if (travelType == 1)
            {
                discount = 1 - (1 * 0.1);
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
            else if (travelType == 2)
            {
                discount = 1 - (1 * 0.1) - ((1 - (1 * 0.1)) * 0.2);
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
        }
        if (age > 65)
        {
            if (travelType == 1)
            {
                discount = 1 - (1 * 0.3);
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
            else if (travelType == 2)
            {
                discount = 1 - (1 * 0.3) - ((1 - 1 * 0.3) * 0.2);
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
        }
        else
        {
            if (travelType == 1)
            {
                discount = 1;
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
            else if (travelType == 2)
            {
                discount = 1 - (1 * 0.2);
                System.out.println("Total fee is: " + (distance * distanceKM * discount * travelType));
            }
        }
    }
}