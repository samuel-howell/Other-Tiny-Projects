import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine();
            StringBuilder sb = new StringBuilder();

            sb.append(s);
            sb = sb.reverse();
            System.out.println(sb);
        }
    }
}