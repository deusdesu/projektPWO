/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.kalkulator;

/**
 *
 * @author macie
 */
public abstract class Kalkulator implements
        Request.RequestHandler {

    protected Kalkulator next = null;

    public void add(Kalkulator txtProc) {
        if (next == null) {
            next = txtProc;
        } else {
            next.add(txtProc);
        }
    }

    protected String next(Request request) {
        if (next != null) {
            return next.processRequest(request);
        } else {
            return null;
        }
    }
}
