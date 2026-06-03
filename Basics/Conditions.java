public class Conditions {
    public static void main(String[] args) {
        
        // 1. Voting Eligibility
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        // 2. Even or Odd
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        // 3. Switch 
        int day = 3; 
        switch (day) {
            case 1:  System.out.println("Monday"); break;
            case 2:  System.out.println("Tuesday"); break;
            case 3:  System.out.println("Wednesday"); break;
            default: System.out.println("Other day"); break;
        }
    }
}
