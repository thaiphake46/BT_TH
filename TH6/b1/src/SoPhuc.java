public class SoPhuc {
    private int phanThuc;
    private int phanAo;

    SoPhuc() {}
    SoPhuc(int pt, int pa) {
        this.phanThuc = pt;
        this.phanAo = pa;
    }

    public int getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(int phanAo) {
        this.phanAo = phanAo;
    }

    public int getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(int phanThuc) {
        this.phanThuc = phanThuc;
    }

    public String toString() {
        if(getPhanAo() == 0 && getPhanThuc() == 0) {
            return "0";
        }
        else if(getPhanThuc() == 0 && getPhanAo() !=0) {
            String str = String.format("%dj",getPhanAo());
            return str;
        }
        else if(getPhanAo() == 0 && getPhanThuc() !=0) {
            String str = String.format("%d", getPhanThuc());
            return str;
        }
        else {
            if( getPhanAo() < 0) {
                String str = String.format("%d %dj", getPhanThuc(),getPhanAo());
                return str;
            }
            else {
                String str = String.format("%d + %dj", getPhanThuc(),getPhanAo());
                return str;
            }
        }
    }

    public double modunSP(int pt, int pa) {
        return Math.sqrt(pt*pt + pa*pa);
    }

    public double modunSP(SoPhuc sp) {
        return Math.sqrt(sp.getPhanThuc()*sp.getPhanThuc() + sp.getPhanAo()*sp.getPhanAo());
    }

    public static boolean sssp(SoPhuc sp1, SoPhuc sp2) {
        if(sp1.getPhanThuc() == sp2.getPhanThuc() && sp1.getPhanAo() == sp2.getPhanAo()) {
            return true;
        }
        return false;
    }

    public static boolean sssp(int pt1, int pa1, int pt2, int pa2) {
        if(pt1 == pt2 && pa1 == pa2) {
            return true;
        }
        return false;
    }

    public SoPhuc nhanSoPhuc(int k, SoPhuc sp) { // Nhan so phuc voi 1 so thuc
        SoPhuc kq = new SoPhuc();
        kq.setPhanThuc(k * sp.getPhanThuc());
        kq.setPhanAo(k * sp.getPhanAo());
        return kq;
    }

    public SoPhuc lienHop (SoPhuc sp1) {
        SoPhuc sp2 = new SoPhuc();
        sp2.setPhanThuc(sp1.getPhanThuc());
        sp2.setPhanAo(-sp1.getPhanAo());
        return sp2;
    }
}
