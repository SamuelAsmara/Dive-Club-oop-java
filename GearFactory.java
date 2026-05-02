import java.time.LocalDate;

/**
 * Factory pattern to create different types of gear.
 */
public class GearFactory {
    public static DiveGear createGear(String type, String serial, String brand) {
        LocalDate now = LocalDate.now();
        switch (type.toUpperCase()) {
            case "TANK":
            case "CYLINDER":
                return new Cylinder(serial, brand, now, 12.0, 200);
            case "REGULATOR":
                return new Regulator(serial, brand, now, true);
            case "COMPUTER":
                return new DiveComputer(serial, brand, now, "Buhlmann ZHL-16C");
            default:
                throw new IllegalArgumentException("Unknown gear type: " + type);
        }
    }
}
