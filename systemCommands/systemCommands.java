import java.io.IOException;

class systemCommands {
    public static void main(String[] args) {

        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException ioException) {
            System.out.println("Cannot find cmd");
        }

    }
}
