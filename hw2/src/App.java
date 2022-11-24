// Вывести все простые числа от 1 до 1000

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;    

public class App {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int count=0;
        int limit;

        System.out.println("Введите конечное число: ");

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        limit = Integer.parseInt(in.readLine());

        System.out.println("Все простые числа в дипазоне от 1 до " + limit);

        //цикл от 1 до limit
        for(int i=1; i < limit; i++) {

            boolean isPrime = true;

            //Проверка, что число простое
            for(int j=2; j < i ; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Вывод, если простое
            if(isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nКоличество простых чисел: "+count);
    }

}


