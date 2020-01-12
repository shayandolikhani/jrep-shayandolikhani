package comp290;
import java.util.*;
class Jrep {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        if (args.length > 1 || args.length == 0) {
            System.out.println("Usage: jrep [PATTERN]");
            System.exit(1);
        } else if (args[0].equals("--help") && args.length == 1) {
            System.out.println("Usage: jrep [PATTERN]");
            System.exit(1);
    } else {
    while(in.hasNext()) {
        String input = in.nextLine();
        if (input.contains(args[0])) {
            System.out.println(input);
        }
    }
}
    }
}
