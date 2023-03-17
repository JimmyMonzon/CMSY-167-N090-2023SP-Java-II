import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * keeps track of gizmo supplies
 */
public class GizmoMain {

    public static void main(String[] args){

        boolean run = true;
        int menuChoice;
        Scanner scanner = new Scanner(System.in);

        List<Gizmo> gizmos = new ArrayList<>();
        gizmos.add(new Gizmo("Waxbill", 618001, 2015,3, 499.99));
        gizmos.add(new Gizmo("Heron", 618002, 2016,13, 299.99));
        gizmos.add(new Gizmo("Crane", 618003, 2017,195, 49.99));
        gizmos.add(new Gizmo("Duck", 618004, 2018,295, 99.99));
        gizmos.add(new Gizmo("Wallaby", 618005, 2019,973, 149.99));
        gizmos.add(new Gizmo("Egret", 618006, 2020,495, 199.99));

        System.out.print("Welcome to the Gizmo Group LLC Inventory Program.\n");
        //Welcome message

        while(run){


            menuChoice = promptMenu(scanner);

            if(menuChoice == 1){
                addEntry(gizmos,scanner);

            } else if (menuChoice==2) {

            } else if (menuChoice == 8){
                run=false;
            }

        }

        System.out.print("\nThank You for using this program.");
    }

    public static int promptMenu(Scanner scanner){
        String line;
        int temp;

        System.out.print("""

                Menu:\s
                1. Add Entry\s
                2. Remove an Entry\s
                3. Sort List by Year
                4. Sort List by Price\s
                5. Sort List by Quantity
                6. Calculate and Print the Total Value of the Inventory\s
                7. Print Inventory
                8. Quit""");

        System.out.print("\n\nPlease select a menu option: ");
        line = scanner.nextLine();
        temp= validateInt(line, scanner);

        while (temp<1 || temp>8){
            System.out.print("Invalid menu option, please enter a valid option (1-8): ");
            line = scanner.nextLine();
            temp= validateInt(line, scanner);
        }

        return temp;
    }

    public static void addEntry(List<Gizmo> gizmos, Scanner scanner){

        System.out.print("\nAdding Entry:");

        System.out.print("\nEnter a Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a product number: ");
        String prodNumStr = scanner.nextLine();
        int prodNumInt = validateInt(prodNumStr, scanner);

        System.out.print("Enter year when created: ");
        String yearStr = scanner.nextLine();
        int yearInt = validateInt(yearStr, scanner);

        System.out.print("Enter quantity in stock (can't be 0): ");
        String quantStr = scanner.nextLine();
        int quantInt = validateInt(quantStr, scanner);

        System.out.print("Enter price: ");
        String priceStr = scanner.nextLine();

        double price =-1;
        while(price < 0){
            try {
                price = Double.parseDouble(priceStr);
            }
            catch (NumberFormatException e) {
                System.out.print("Error: Invalid double. Try again: ");
                priceStr = scanner.nextLine();
            }
            if(price < 0){
                System.out.print("Error: Price must be greater than 0. Try again: ");
                priceStr = scanner.nextLine();

            }

        }
        //Checks that price is a valid double (positive)

        gizmos.add(new Gizmo(name, prodNumInt, yearInt, quantInt, price));
    }

    public static int validateInt(String line, Scanner scanner){
        int integer=0;

        while(integer==0){
            try {
                integer = Integer.parseInt(line);
            }
            catch (NumberFormatException e) {
                System.out.print("Error: Invalid integer. Try again: ");
                line = scanner.nextLine();
            }

        }

        return integer;
    }
    //validates that input is an int when needed(product #, year, quantity)
}
