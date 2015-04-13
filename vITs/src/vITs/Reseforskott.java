/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vITs;

/**
 *
 * @author Matus
 */
public class Reseforskott {
   private String Text;
   private int Summa;
   private String Valuta;
   
    public Reseforskott(String text, int summa, String valuta) {
        Text=text;
        Summa=summa;
        Valuta=valuta;
    }
    
    public String getText() {
        return Text;
    }
    
    public int getSumma() {
        return Summa;
    }
    
    public String getValuta() {
        return Valuta;
    }
}
