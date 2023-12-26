import java.io.IOException;

public class ShutdownComputer {
    public static void main(String[] args) throws IOException {
        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("win")) {
            Runtime.getRuntime().exec("shutdown /s /t 1");
        }
        else if(os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            Runtime.getRuntime().exec("shutdown now");
        }
    }
}