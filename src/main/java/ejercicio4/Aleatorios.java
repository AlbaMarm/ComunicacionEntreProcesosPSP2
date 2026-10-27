package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Aleatorios {
    public static final int NUM_MAX = 10;

    public static void main(String[] args) {
        Random num = new Random();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // cada línea es una petición de un número aleatorio
            while(br.readLine() != null){
                System.out.println(num.nextInt(NUM_MAX + 1));
            }
        } catch (IOException e) {
            System.out.println("ERROR: Error de I/O");
        }

    }
}
