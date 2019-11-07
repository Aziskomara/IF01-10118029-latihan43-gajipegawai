/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan43.gajipegawai;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Gaji Pegawai
 */
public class IF0110118029Latihan43Gajipegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
    System.out.println("------------------------------------");
    gajipegawai gajipegawai = new gajipegawai();
    gajipegawai.setNama("Azis Komara");
    gajipegawai.setAlamat("Jalan Sekeloa Utara No 2");
    gajipegawai.setUangTransport(250000);
    gajipegawai.setUangTunjangan(300000);
    gajipegawai.setGajiPokok(4500000);
    gajipegawai.setTotalGaji(gajipegawai.totalGaji(gajipegawai.getUangTunjangan()
          ,gajipegawai.getUangTransport(),gajipegawai.getGajiPokok()));
    gajipegawai.tampilData(gajipegawai.getNama(),gajipegawai.getAlamat(),
          gajipegawai.getUangTunjangan(),gajipegawai.getUangTransport()
          ,gajipegawai.getGajiPokok(),gajipegawai.getTotalGaji());
   
    }
    
}
