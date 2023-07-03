import java.util.Random;
public class Main {
    public static void main(String args[]) {

        Random rand = new Random();

        int upperbound = 100;

        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);

        if (int_random >= 50){
            System.out.println("MONEDA!");
        }
        else if (int_random < 50){ 
            System.out.println("CRUZ!");
        }

    }
}