/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11.pkg10116500.latihan3;

/**
 *
 * @author think pad
 */
public class PBO1110116500LATIHAN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Mahasiswa oMhs = new Mahasiswa();
        oMhs.nama="Dwi";
        oMhs.nim="10116500";
        oMhs.kuis=75;
        oMhs.uts=45;
        oMhs.uas=34;
        double na;
        
        oMhs.getNilaiAkhir(oMhs.kuis,oMhs.uts,oMhs.uas);
        na=oMhs.getNilaiAkhir(oMhs.kuis,oMhs.uts,oMhs.uas); 
        oMhs.getIndexNilai(na);
        
        System.out.println("Nilai Akhir ="+na);
            
        
    }
    
}
