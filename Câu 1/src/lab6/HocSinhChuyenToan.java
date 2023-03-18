

package lab6;

class HocSinhChuyenToan extends HocSinh{

    @Override
    public double DTB() {
        return (this.getToan()*2 + this.getLy()+ this.getHoa())/4;
    }
    
}
