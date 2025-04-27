public class testing {
    public static void main(String[] args) {
        System.out.println("Number of command line arguments = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
        }
    }
}
