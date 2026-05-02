import java.time.LocalDate;

/**
 * Represents a diving regulator.
 */
public class Regulator extends DiveGear {
    private static final int SERVICE_INTERVAL_DIVES = 100;
    private boolean isColdWaterRated;
    private int divesSinceLastService;

    public Regulator(String serialNumber, String brand, LocalDate lastServiceDate, boolean isColdWaterRated) {
        super(serialNumber, brand, lastServiceDate);
        this.isColdWaterRated = isColdWaterRated;
        this.divesSinceLastService = 0;
    }

    @Override
    // Using the DiveGear method and add another method to it
    public void use() {
        super.use();
        this.divesSinceLastService++;
    }

    @Override
    public boolean isSafeToUse() {
        // Safe if used less than 100 times since last service
        return divesSinceLastService < SERVICE_INTERVAL_DIVES;
    }

    public void performService() {
        this.divesSinceLastService = 0;
        setLastServiceDate(LocalDate.now());
        System.out.println("Service performed on regulator: " + getSerialNumber());
    }
}
