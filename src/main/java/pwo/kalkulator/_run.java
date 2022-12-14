/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.kalkulator;
import java.util.Scanner;

/**
 *
 * @author macie
 */
public class _run {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // utworz łańcuch z paczki pwo.kalkulator.operacje 
 
        int liczba1,liczba2;
        String operacja;
        Request request0;

        while (true) {
            System.out.print("==========================\n");
            System.out.print("          menu            \n");
            System.out.print("ADD -             dodawanie\n");
            System.out.print("SUBSTRACT -       odejmowanie\n");
            System.out.print("MULTIPLICATION -  mnożenie\n");
            System.out.print("DIVIDE -          dzielenie\n");
            System.out.print("EXIT -            wyjście\n");
            System.out.print("==========================\n");
            
            System.out.print("podaj liczbe 1:");
            liczba1 = scanner.nextInt();
            
            System.out.print("podaj operacje:");
            operacja = scanner.next();
            
            if(operacja.equals("EXIT")){
                break;
            }
            System.out.print("podaj liczbe 2:");
            liczba2 = scanner.nextInt();
            
            request0 = new Request( liczba1,  operacja, liczba2);

            System.out.println("Wynik to: "+ "Wynik z łańcucha");
        }
        System.out.print("Zakończono działanie kalkulatora :)!");

    }
}
