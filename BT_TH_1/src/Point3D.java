public class Point3D extends Point {
    private double z;

    Point3D(){}

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) {this.z = z;}

    public double getZ() {return z;}

    public Point3D vector(Point3D A, Point3D B) {
        x = B.getX() - A.getX();
        y = B.getY() - A.getY();
        z = B.getZ() - A.getZ();
        Point3D vectorAB = new Point3D(x,y,z);
        return vectorAB;
    }

    public Point3D vertorPT(Point3D A, Point3D B) {
        double x, y, z;
        x = A.getY()*B.getZ() - B.getY()*A.getZ();
        y = A.getZ()*B.getX() - B.getZ()*A.getX();
        z = A.getX()*B.getY() - B.getX()*A.getY();
        Point3D vectorpt = new Point3D(x,y,z);
        return vectorpt;
    }

    public static void phuongTrinhMP(Point3D A, Point3D B, Point3D C) {
//        double xn,yn,zn;
//        Point3D vectorN =
    }
}
