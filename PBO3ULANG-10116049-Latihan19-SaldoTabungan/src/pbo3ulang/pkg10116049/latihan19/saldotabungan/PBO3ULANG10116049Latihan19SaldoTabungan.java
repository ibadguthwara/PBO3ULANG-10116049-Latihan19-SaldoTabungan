package pbo3ulang.pkg10116049.latihan19.saldotabungan;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program Saldo Tabungan
 */
public class PBO3ULANG10116049Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoawal = 100000, Lama_b = 5;
        int bonus =500;
        
        for(int i =1; i<=Lama_b; i++){
            saldoawal=saldoawal + bonus;
            System.out.printf("Saldo di bulan ke-".concat(String.valueOf(i))
            .concat(" Rp. ")
            .concat(String.valueOf("%d\r\n")),saldoawal);   
        }   
    }
}
