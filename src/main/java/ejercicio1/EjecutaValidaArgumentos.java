package ejercicio1;

import java.io.IOException;

public class EjecutaValidaArgumentos {
    public static void main(String[] args) {
        // caso sin nada
        validaArgumentos();
        // caso cadena
        validaArgumentos("cadena");
        // caso num mayor o igual a 0
        validaArgumentos("7");
        // caso num menor que 0
        validaArgumentos("-2");
    }

    public static void validaArgumentos(String... argumentos) {
        // creo el proceso con la ruta de salida
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", "build/classes/java/main", "ejercicio1.ValidaArgumentos");
        // se añaden argumentos como una lista
        pb.command().addAll(java.util.Arrays.asList(argumentos));

        try{
            Process p = pb.start();
            int arg = p.waitFor();

            System.out.println("Valor de salida" + arg);
            switch (arg){
                case 1:
                    System.out.println("No hay argumentos.");
                    break;
                case 2:
                    System.out.println("El argumento introducido es una cadena");
                    break;
                case 3:
                    System.out.println("El argumento introducido es un número menor que 0");
                    break;
                case 4:
                    System.out.println("El argumento introducido es un número mayor o igual a 0");
                    break;
                default:
                    System.out.println("Valor de salida incorrecto o no se entiende");
            }
            System.out.println();
        } catch (IOException e){
            System.out.println("No se inicio el proceso " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El proceso fue interrumpido.");
        }
    }
}
