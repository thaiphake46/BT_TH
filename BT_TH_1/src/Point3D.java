public class Point3D extends Point {
    private double z;

    Point3D(){}

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) {this.z = z;}

    public double getZ() {return z;}

    public Point3D vertor(Point3D A, Point3D B) {
        double x, y, z;
        x = A.getY()*B.getZ() - B.getY()*A.getZ();
        Point3D vectorAB;
        return vectorAB;
    }

    public static void phuongTrinhMP(Point3D A, Point3D B, Point3D C) {
        double xn,yn,zn;
        Point3D vectorN = new Point3D();
    }
}
