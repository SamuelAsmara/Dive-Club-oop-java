import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Abstract base class for all diving equipment.
 * Demonstrates Abstraction and Encapsulation.
 */
public abstract class DiveGear {
    private String serialNumber;
    private String brand;
    private int usageCount;
    private LocalDate lastServiceDate;

    public DiveGear(String serialNumber, String brand, LocalDate lastServiceDate) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.lastServiceDate = lastServiceDate;
        this.usageCount = 0;
    }

    // Abstract method to be implemented by subclasses 
    public abstract boolean isSafeToUse();

    public void use() {
        this.usageCount++;
        System.out.println(brand + " (" + serialNumber + ") was used. Total dives: " + usageCount);
    }

    public long daysSinceLastService() {
        return ChronoUnit.DAYS.between(lastServiceDate, LocalDate.now());
    }

    // Getters and Setters
    public String getSerialNumber() { return serialNumber; }
    public String getBrand() { return brand; }
    public int getUsageCount() { return usageCount; }
    public void setLastServiceDate(LocalDate date) { this.lastServiceDate = date; }
    public LocalDate getLastServiceDate() { return lastServiceDate; }

    @Override
    public String toString() {
        return String.format("[%s] S/N: %s, Brand: %s, Dives: %d", 
                this.getClass().getSimpleName(), serialNumber, brand, usageCount);
    }
}
