import java.time.LocalDate;

/**
 * Represents a dive computer. Implements Electronic.
 */
public class DiveComputer extends DiveGear implements Electronic {
    private int batteryPercentage;
    private String algorithm;

    public DiveComputer(String serialNumber, String brand, LocalDate lastServiceDate, String algorithm) {
        super(serialNumber, brand, lastServiceDate);
        this.algorithm = algorithm;
        this.batteryPercentage = 100; // Start fully charged
    }

    @Override
    public boolean isSafeToUse() {
        // Safe if battery is above 20%
        return batteryPercentage > 20;
    }

    @Override
    public int getBatteryLevel() {
        return batteryPercentage;
    }

    @Override
    public void charge() {
        this.batteryPercentage = 100;
        System.out.println("Dive computer " + getSerialNumber() + " charged.");
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
