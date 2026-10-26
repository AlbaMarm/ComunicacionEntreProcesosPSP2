package ejercicio1;

public class ValidaArgumentos {
    public static void main(String[] args) {

        if(args.length < 1){
            System.exit(1);
        }

        try {
            int numArg = Integer.parseInt(args[0]);
            if(numArg < 0){
                System.exit(3);
            } else {
                System.exit(4);
            }
        } catch (NumberFormatException e){
            System.exit(2);
        }

    }
}
