public class InputSanitizer {

    // Vulnerable method that leaves some characters unsanitized
    public String sanitizeInput(String input) {
        return input != null ? input.replaceAll("[!\"$%&'()*+,./:;<=>?@[\\]^`{|}~]", "\\$&")
                              .replaceAll("\\\\", "") : ""; // Not properly escaping backslashes
    }
}
