public class Mahasiswa extends Manusia{
    String NIM, Jurusan;

    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }

    public String getNIM(){
        return this.NIM;
    }
    public String getJurusan(){
        return this.Jurusan;
    }
    public void cetakInfo(){
        super.cetakInfo();
        setNIM ("10102020");
        setJurusan("Informatika");
        System.out.println("NIM             : " + getNIM());
        System.out.println("Jurusan         : " + getJurusan());
    }
}