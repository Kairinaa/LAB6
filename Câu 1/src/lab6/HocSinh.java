
package lab6;

import java.util.Scanner;

class HocSinh {
    private String hoTen;
    private String lop;
    private double toan;
    private double ly;
    private double hoa;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    public double DTB() {
        return (this.toan + this.ly + this.hoa)/3;
    }
    Scanner input = new Scanner(System.in);
    public void nhapThongTin() {
        System.out.println("Nhap Ho va ten: "); String name = input.nextLine();
        System.out.println("Nhap Lop: "); String lp = input.nextLine();
        System.out.println("Nhap diem Toan: "); double t = input.nextDouble();
        System.out.println("Nhap diem Ly: "); double l = input.nextDouble();
        System.out.println("Nhap diem Hoa: ");double h = input.nextDouble();
        
        setHoTen(name);
        setLop(lp);
        setToan(t);
        setLy(l);
        setHoa(h);
        
        input.close();
    }
    
    public void xuatThongTin() {
        System.out.println("Ho va Ten: " + getHoTen());
        System.out.println("Lop: "+ getLop());
        System.out.println("Diem Toan: " + getToan());
        System.out.println("Diem Ly: "+ getLy());
        System.out.println("Diem Hoa: "+ getHoa());
        System.out.println("DTB: "+ DTB());
    }
}
