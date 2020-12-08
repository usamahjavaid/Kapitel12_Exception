public class Training {

    public static void main(String[] args) {

    try{

        String[] biler = {"Mercedes", "Toyota", "BMW", "Kia"};

        System.out.println(biler[5]);

    }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Something went wrong");
    }

    }
}
