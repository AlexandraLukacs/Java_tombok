/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;


public class TombosFeladat {

    
    public static void main(String[] args) {
        //psvm tab
        /* TÖMBÖK LÉTREHOZÁSA */
        /*2 tömbbe tároljuk az adatokat, egyikbe korok, másikba nevek, 3 db*/
        //-- ha deklaráláskor tudjuk az értékeket:
        //String[] tomb = {"Isti", "Boti", "Szendy"};
        //int[] korok = {20, 19, 21};
        
        //-- ha deklaráláskor NEM tudjuk az értékeket:
        final int TOMB_MERET = 3;
        String[] nevek;//deklarálás
        int[] korok;//deklarálás
        
        //nevek = new String[3];//inicializálás
        nevek = new String[TOMB_MERET];//inicializálás
        nevek[0] = "Isti";//értékadás
        nevek[1] = "Boti";//értékadás
        nevek[2] = "Szendy";//értékadás
        
        //korok = new int[3];//inicializálás
        korok = new int[TOMB_MERET];//inicializálás
        korok[0]=20;//értékadás
        korok[1]=19;//értékadás
        korok[2]=21;//értékadás
        
        System.out.println("Versenyzők kora: ");
        int osszKor = 0;
        for(int i = 0; i < nevek.length; i++){
            String nev = nevek[i];
            int kor = korok[i];
            System.out.printf("%6s kora: %3d év\n",nev, kor);
            osszKor += kor;
        }
        
        /* int / int = int: */
        //double atlag = 1.0*osszKor / korok.length;
        double atlag = (double)osszKor / korok.length;
        
        /* d != java.lang.Double --> IllegalFormatConversionException: */
        //System.out.printf("a korok átlaga: %d\n", atlag);
        System.out.printf("a korok átlaga: %.2f év\n", atlag);
        
        /* osszKor továbbra is int: */
        //osszKor = 3.14;
    }
    
}
