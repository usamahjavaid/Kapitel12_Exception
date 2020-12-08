public class Exception_training {

    static boolean happy = true;

    static void checkHappiness() {
        if (happy = false) {
            throw new ArithmeticException("Clap your hands");
        } else {
            System.out.println("do not clap your hands");
        }
    }
    public static void main(String[] args) {
        checkHappiness();
    }
}