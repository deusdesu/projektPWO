/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.kalkulator.operacje;
import pwo.kalkulator.Kalkulator;
import pwo.kalkulator.Request;
/**
 *
 * @author tomek
 */
public class KalkulatorDivide extends Kalkulator {

    public static String ACTION = "DIVIDE";

    @Override
    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {
            if(request.liczba2 == 0){
                return "Dzielenie przez zero!";
            }
            return Float.toString(request.liczba1 / request.liczba2);
        } else {
            return next(request);
        }
    }
}
