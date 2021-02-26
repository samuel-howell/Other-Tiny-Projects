import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine().trim();
            if(s.length() == 0){
                System.out.println(0);
                System.exit(0);
            }

                String st = s.trim().replaceAll(" +", " ");

                int c = 0; //counter
                String[] strArr = st.split(" ");
                for (int i = 0; i < strArr.length; i++) {
                    c++;
                }
                System.out.println(c);
            }
        }

    }


//class Main {
//    public static void main(String[] args) throws Exception {
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            // start coding here
//            StringBuilder sb = new StringBuilder();
//            int x = reader.read();
//            if (x == -1) {
//                System.out.println(0);
//            } else {
//                while (x != -1) {
//                    sb.append((char) x);
//                    x = reader.read();
//                }
//                String st = sb.toString().trim().replaceAll(" +", " ");
//
//                String[] strings = st.split(" ");
//
//                System.out.println(strings.length);
//
//            }
////            for (String sx : strings) {
////                System.out.println(sx);
////            }
//        }
//    }
//
//}