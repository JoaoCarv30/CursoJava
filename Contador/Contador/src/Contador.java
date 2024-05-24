import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numberOne: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter numberTwo: ");
        int numberTwo = scanner.nextInt();

        System.out.println("---------------");

        try {
            accountantFor(numberOne, numberTwo);
        } catch (InvalidParams e) {
            System.out.println(e.getMessage());
        }
        
    
    }


    public static class InvalidParams extends Exception {
        public InvalidParams(String message) {
            super(message);
        }
    }
    

    static void accountantFor(int numberOne, int numberTwo) throws InvalidParams {
        if (numberOne > numberTwo) { 
            throw new InvalidParams("numberOne cannot be greater than numberTwo");
        } else {
           
            int account = numberOne - numberTwo;

            for( int i = numberOne +1; i <= numberTwo; i++) {
                System.out.println(i);
            }
        }
    }
}
