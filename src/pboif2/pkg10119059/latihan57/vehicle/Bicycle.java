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
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}
