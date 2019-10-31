/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan52.siapakamu;

/**
 *
 * @author Lenovo
 */
public class PBOUlang10116413Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    protected static String nama;
    protected static int umur;
    private static String nip;
    private static String mataKuliah;
    private static String nim;
    private static String kelas;

    public static void main(String[] args) {
        // TODO code application logic here
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        mahasiswa.setNim("10116413");
        mahasiswa.setNama("Harry Apriadi");
        mahasiswa.setUmur(22);
        mahasiswa.setKelas("PBOULANG");

        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }

}
