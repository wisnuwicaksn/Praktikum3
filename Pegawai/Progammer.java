public class Progammer extends Pegawai{
    Double bonus;
    public void setBonus(Double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return this.bonus;
    }

    public void cetakInfo(){
        super.cetakInfo();
        setBonus(1200000.2);
        System.out.println("Bonus       : Rp " + getBonus());
    }
}