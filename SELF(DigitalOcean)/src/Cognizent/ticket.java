package Cognizentq;

import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Ticket: ");
        float t = sc.nextFloat();
        sc.nextLine();

        if (t < 5 || t > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            sc.close();
            return;
        }

        System.out.println("Do you want refreshments Y or N: ");
        String r = sc.next();

        System.out.println("Do you have coupon code Y or N: ");
        String cc = sc.next();

        System.out.println("Enter the circle k or q: ");
        String cir = sc.next();

        float cost = 0;

        if (cir.equalsIgnoreCase("k")) {
            cost = t * 75;
        } else if (cir.equalsIgnoreCase("q")) {
            cost = t * 150;
        } else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Bulk booking discount
        if (t > 20) {
            cost -= (0.1f * cost);
        }

        // Coupon code discount
        if (cc.equalsIgnoreCase("y")) {
            cost -= (0.02f * cost);
        }

        // Refreshments
        if (r.equalsIgnoreCase("y")) {
            cost += (50 * t);
        }

        System.out.printf("Ticket cost: %.2f", cost);
    }
}
