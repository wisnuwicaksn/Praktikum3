public class Manusia {
    String nama;
    String jenisKelamin;
    int umur;
    String alamat;

    public void setnama(String nama){
        this.nama = nama;
    }
    public void setjenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setumur(int umur) {
        this.umur = umur;
    }
    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnama(){
        return this.nama;
    }
    public String getjenisKelamin(){
        return this.jenisKelamin;
    }
    public int getumur(){
        return this.umur;
    }
    public String getalamat(){
        return this.alamat;
    }

    public void cetakInfo(){
        System.out.println("Nama            : " + getnama());
        System.out.println("Jenis Kelamin   : " + getjenisKelamin());
        System.out.println("Umur            : " + getumur());
        System.out.println("Alamat          : " + getalamat());
    }
}