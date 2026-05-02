import java.util.ArrayList;
import java.util.List;

/**
 * Manages the collection of diving equipment.
 * Demonstrates the use of Lists and Polymorphism.
 */
public class DiveClubInventory {
    private List<DiveGear> inventory;

    public DiveClubInventory() {
        this.inventory = new ArrayList<>();
    }

    public void addItem(DiveGear item) {
       if (item == null) {
        throw new IllegalArgumentException("Error: Item cannot be null");
    }
    inventory.add(item);
}


    public List<DiveGear> getMaintenanceReport() {
        List<DiveGear> unsafeGear = new ArrayList<>();
        for (DiveGear item : inventory) {
            if (!item.isSafeToUse()) {
                unsafeGear.add(item);
            }
        }
        return unsafeGear;
    }

    public void showInventory() {
        System.out.println("--- Current Club Inventory ---");
        for (DiveGear item : inventory) {
            //This implicitly calls the toString() method in DiveGear
            System.out.println(item);
        }
    }
    
    public List<DiveGear> getAllItems() {
        //return a copy of the list an not the real one 
        return new ArrayList<>(inventory);
    }

    public void rentEquipment(DiveGear item) throws EquipmentUnsafeException {
        if (!item.isSafeToUse()) {
            throw new EquipmentUnsafeException(
                "CRITICAL DANGER: The gear " + item.getBrand() + 
                " (S/N: " + item.getSerialNumber() + ") failed the safety check!"
            );
        }
        
        item.use();
        System.out.println("Equipment " + item.getSerialNumber() + " rented successfully.");
    }

}
