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
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){
        System.out.println("Skateboard");
    }
    
    public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}
