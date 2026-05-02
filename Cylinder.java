import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Represents a diving tank (Cylinder).
 * Inheritance from DiveGear.
 */
public class Cylinder extends DiveGear {
    private double volume;
    private int maxPressure;
    private LocalDate lastHydroTestDate;

    public Cylinder(String serialNumber, String brand, LocalDate lastServiceDate, double volume, int maxPressure) {
        super(serialNumber, brand, lastServiceDate);
        this.volume = volume;
        this.maxPressure = maxPressure;
        this.lastHydroTestDate = lastServiceDate; // Initializing with service date
    }

    @Override
    public boolean isSafeToUse() {
        // A cylinder is safe if the hydrostatic test was within the last 2 years (730 days)
        long daysSinceHydro = ChronoUnit.DAYS.between(lastHydroTestDate, LocalDate.now());
        return daysSinceHydro < 730;
    }

    public void setLastHydroTestDate(LocalDate date) {
        this.lastHydroTestDate = date;
    }
}
