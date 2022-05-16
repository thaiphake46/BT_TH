public class Main {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc(3,4);
        SoPhuc sp2 = new SoPhuc(3,4);
//        System.out.println(sp1.toString());
//        System.out.println(sp1.modunSP(sp1));
//        System.out.println(SoPhuc.sssp(sp1, sp2));
        SoPhuc sp3 = new SoPhuc();
        sp3 = sp1.lienHop(sp1);
        System.out.println(sp3.toString());
    }
}
