/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class TombokHasznalata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //index:       0       1        2
        //pylista = ["egy", "kettő", "három"]

        /* deklarálásnál az értékekkel rögtön feltöltve */
        String[] tomb = {"egy", "kettő", "három"};
        
        /* memória címet írja ki, nem a tartalmat: */
        System.out.println("tomb = " + tomb);
        
        /* a tömb mérete nem változtatható: */
        //tomb = {"nulla", "egy", "kettő", "három"};
        
        /* tomb osztályban length elérhető adattag */
        System.out.println("A tömb elemei:");
        for(int i = 0; i < tomb.length; i++){
            /*d != java.lang.String IllegalFormatConversionException*/
            //System.out.printf("[%d. index] = %d\n", i, tomb[i])
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        /* deklarálásnál a mérettel és késöbb feltöltve */
        /* mérete nem változhat, de új tömb lehet:  */
        tomb = new String[4]; //megadom az új méretet
        System.out.println("az üres tömb: "); //minden elem értéke: null
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        tomb[2] = "zwei";
        System.out.println("részben -németül- feltöltött tömb: ");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[3] = "two";
        /*ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4*/
        //tomb[4] = "";
        System.out.println("vegyesen feltöltött tömb: ");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        System.out.println("teljesen -angolul- feltöltött tömb: ");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        System.out.println("\"null\" vagy null?");
        /* String == REFERENCIA */
        if("null" == null){
            System.out.println("egyezik");
        }else{
            System.out.println("nem egyezik");
        }
        
        /* le sem fordítható: */
        /* ÉRTÉK == REFERENCIA */
        /* if(0 == null) */
        
    }
    
}
