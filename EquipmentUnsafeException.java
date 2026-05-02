/**
 * Custom exception to be thrown when unsafe equipment is attempted to be used.
 */
public class EquipmentUnsafeException extends Exception {
    public EquipmentUnsafeException(String message) {
        super(message);
    }
}
