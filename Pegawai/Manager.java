public class Manager extends Pegawai{
    Double tunjangan;

    public void setTunjangan(Double tunjangan){
        this.tunjangan = tunjangan;
    }
    public Double getTunjangan(){
        return this.tunjangan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        setTunjangan(8000000.1);
        System.out.println("Tunjangan   : Rp " + getTunjangan());
    }
}