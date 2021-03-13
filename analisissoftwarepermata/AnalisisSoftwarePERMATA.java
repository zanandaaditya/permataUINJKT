/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisissoftwarepermata;

/**
 *
 * @author Nanda
 */
public class AnalisisSoftwarePERMATA {

     public static void main(String[] args) {
        double gajiPokok = 15000;
        double gajiLembur = 1.5 * gajiPokok;
        double jam = 52;
        double atabung = 1050000;
        // System.out.println(gajiLembur);
        System.out.println("Jhon Travolta");
        double gaTOT= gajiAkhir(jam, gajiPokok, gajiLembur);
        String hasil = menabung(gaTOT,atabung);
        System.out.println(gaTOT);
        System.out.println(hasil);
    }

    public static double gajiAkhir (double jam, double gp, double gl){
        if (jam <= 40) {
            double gatot= jam*gp;
            return gatot;
        } else {
            double gabur = (jam-40) * gl;
            double gahir= jam*gp;
            double gatot = gabur+gahir;
            return gatot;
        }
    }

    public static String menabung(double gaTOT, double tabung){
        if (gaTOT > tabung) {
            return "Bisa Menabung";
        } else if (gaTOT == tabung){
            return "Tidak Bisa Menabung";
        } else {
            return "Cari Tambahan";
        }
    }
    
}
