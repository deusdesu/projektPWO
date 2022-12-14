/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.kalkulator;

/**
 *
 * @author macie
 */
public class Request {

    public interface RequestHandler {

        String processRequest(Request request);
    }

    public final int liczba1;
    public final String action;
    public final int liczba2;

    public Request(int liczba1, String action, int liczba2) {
        this.liczba1 = liczba1;
        this.action = action;
        this.liczba2 = liczba2;
    }
}
