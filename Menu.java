import java.util.Scanner;

public class Menu {
    public static void main (String[] Args) {
        Scanner kbd = new Scanner(System.in);
        int mode;

        System.out.println("Welcome to Apartment Finder! Please enter a number from the menu options below:\n");
        System.out.println("1. Add an apartment\t\t\t\t\t\t\t\t2. Update an apartment\n3. Remove an apartment\t\t\t\t\t\t\t4. Find apartment with the lowest rent\n5. Find apartment with the most space\t\t\t6. Find the cheapest apartment by city\n7. Find the largest apartment by city\n");
        mode = kbd.nextInt();
    }
}