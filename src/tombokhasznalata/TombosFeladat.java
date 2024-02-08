/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class TombosFeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*2 tömbbe tároljuk az adatokat, egyikbe korok, másikba nevek, 3 db*/
        //String[] tomb = {"Isti", "Boti", "Szendy"};
        final 
        int TOMB_MERET = 3;
        nevek = new String[TOMB_MERET];//inicializálás
        nevek[0] = "Boti";//értékadás
        nevek[1] = "Boti";//értékadás
        nevek[2] = "Szendy";//értékadás
        
        korok = new int[TOMB_MERET];//inicializálás
        korok[0]=19;//értékadás
        korok[1]=20;//értékadás
        korok[2]=21;//értékadás
        
        System.out.println("Versenyzők kora: ");
        for(int i = 0; i < nevek.length; i++){
            String nev = nevek[i];
            int kor = korok[i];
            System.out.printf("%5s kora: %2d év\n",nev, kor);
        }
        
        System.out.println("Versenyzők kora: ");
        int osszkor = 0;
        for(int i = 0; i < nevek.length; i++){
            String nev = nevek[i];
            int kor = korok[i];
            osszkor += kor;
            System.out.printf("%5s kora: %2d év\n",nev, kor);
        }
        double atlag = (double)osszKor / korok.length;
        //double atlag = 1.0*osszKor / korok.length;
        System.out.println("a korok átlaga: %.2f\n", atlag);
        
    }
    
}
