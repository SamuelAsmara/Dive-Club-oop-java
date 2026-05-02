import java.util.List;

/**
 * Main class to simulate the Dive Club operations.
 * This class brings together the Factory Pattern, Inventory Management, and Custom Error Handling.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting Dive Club System ===\n");

        // Step 1: Initialize the club's inventory manager.
        DiveClubInventory club = new DiveClubInventory();

        // Step 2: Create gear using the Factory Design Pattern.
        // The factory handles the creation logic.
        DiveGear myTank = GearFactory.createGear("TANK", "T-100", "Luxfer");
        DiveGear myRegulator = GearFactory.createGear("REGULATOR", "R-200", "Scubapro");
        DiveGear myComputer = GearFactory.createGear("COMPUTER", "C-300", "Suunto");

        // Step 3: Add the newly created gear to the club's inventory list.
        club.addItem(myTank);
        club.addItem(myRegulator);
        club.addItem(myComputer);

        // Step 4: Display the current inventory.
        // This loop internally calls the toString() method in the DiveGear abstract class.
        System.out.println("Initial Inventory:");
        club.showInventory();
        System.out.println("\n---------------------------------\n");

        // Step 5: Simulate club operations and test Error Handling (try-catch block).      
            try {
                // Simulate heavy usage for the regulator (100 dives is the limit before service is needed).
            for (int i = 0; i < 100; i++) {
                myRegulator.use();
            }
            // Simulate a drained battery on the dive computer.
            if (myComputer instanceof DiveComputer) {
                ((DiveComputer) myComputer).setBatteryPercentage(10);
            }
            // Step 6: Attempt to rent unsafe equipment.
            // Since the computer's battery is at 10%, this method WILL fail and throw our custom exception.
            System.out.println("Trying to rent the Dive Computer...");
            club.rentEquipment(myComputer); 

        } catch (EquipmentUnsafeException e) {
            System.err.println("\n[SYSTEM ALERT] " + e.getMessage());
        }

        System.out.println("\n---------------------------------\n");

        // Step 7: The inventory manager loops through all items, and each item runs its own unique 'isSafeToUse()' logic.
        System.out.println("Generating Maintenance Report:");
        for (DiveGear unsafeItem : club.getMaintenanceReport()) {
            System.out.println("- Needs Service: " + unsafeItem.getBrand() + " (S/N: " + unsafeItem.getSerialNumber() + ")");
        }
    }
}