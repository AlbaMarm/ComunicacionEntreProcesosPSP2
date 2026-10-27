package ejercicio3;

public class Visualizador {
    public static void main(String[] args) {
        if(args.length < 1 || args[0].isEmpty()){
            System.out.println("Cadena introducida vacía");
            System.exit(1);
        }

        String line = args[0];
        int vecesline = Integer.parseInt(args[1]);

        for(int i = 1; i <= vecesline; i++){
            System.out.println(i + ". " + line);
        }

    }
}
