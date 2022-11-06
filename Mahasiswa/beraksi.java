public class beraksi{
    public static void main (String[] args){
        
        Mahasiswa anton = new Mahasiswa();

        anton.setnama ("Anton Santoso");
        anton.setjenisKelamin("Laki-laki");
        anton.setumur(28);
        anton.setalamat("Bekasi Kota");
        anton.cetakInfo();
    }
}