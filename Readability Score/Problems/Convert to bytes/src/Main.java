import java.io.FileInputStream;
import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        try (InputStream inputstream = System.in) {
            int currentByte = inputstream.read();
            while (currentByte != -1) {
                System.out.print(currentByte);
                currentByte = inputstream.read();
            }
        }

        }
    }
