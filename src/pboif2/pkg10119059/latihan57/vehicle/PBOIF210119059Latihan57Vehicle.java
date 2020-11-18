/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan vehicle
 */
package pboif2.pkg10119059.latihan57.vehicle;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan57Vehicle {

    public static void main(String[] args) {
        
        Bicycle bi = new Bicycle();
        bi.setBrand("Trek Bike");
        bi.setModel("7.4FX");
        bi.setGearCount(23);
        System.out.println("Brand : "+bi.getBrand());
        System.out.println("Model : "+bi.getModel());
        System.out.println("Jumlah Gear : "+bi.getGearCount());
        System.out.println("");
        
        Skateboard sk = new Skateboard();
        sk.setBrand("Ally Skate");
        sk.setModel("Rocket");
        sk.setBoardLength(54.5);
        System.out.println("Brand : "+sk.getBrand());
        System.out.println("Model : "+sk.getModel());
        System.out.println("Jumlah Gear : "+sk.getBoardLength());
                
    }
    
}
