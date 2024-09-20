package week11;

public class Student {
    private String msv, hoten;
    private double diem;

    public Student(){

    }

    public Student(String hoten, String msv, double diem){
        this.hoten = hoten;
        this.msv = msv;
        this.diem = diem;
    }

    public void printInfor()

    {
        System.out.println(msv + " " + this.hoten + " " + this.diem);

    }

    public String getName(){
        return this.hoten;
    }

    public String setName(String hoten){
        this.hoten = hoten;
        return this.hoten;
    }
    public String getMsv(){
        return msv;
    }
    public String setMsv(String msv){
        this.msv = msv;
        return this.msv;
    }
    public double getDiem(){
        return this.diem;
    }
    public double setDiem(double diem){
        this.diem = diem;
        return this.diem;
    }

}
