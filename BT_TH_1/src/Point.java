public class Point {
    protected double x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    public double getX() {return x;}
    public double getY() {return y;}

    public static void phuongTrinhDT(Point A, Point B) {
        double a, b;
        b = (B.getY()*A.getX() - B.getX()*A.getY()) / (-1*B.getX() + A.getX());
        a = (A.getY() - b) / A.getX();

        if(b > 0) {
            System.out.printf("Phuong trinh duong thang: y = %.2fx + %.2f", a, b);
        }
        else if(b < 0) {
            System.out.printf("Phuong trinh duong thang: y = %.2fx %.2f", a, b);
        }
        else {
            System.out.printf("Phuong trinh duong thang: y = %.2fx", a);
        }
    }

    public static void baDiemThangHang(Point A, Point B, Point C) {
        double D = A.getX() - B.getX(),
                Da = A.getY() - B.getY(),
                Db = A.getX() * B.getY() - B.getX() * A.getY();
        if(D == 0) {
            if(Da == 0 && Db == 0) {
                System.out.println("- 3 diem A, B , C trung nhau.");
                return ;
            }
            else {
                System.out.println("- 3 diem A, B , C khong thang hang.");
                return ;
            }
        }
        else {
            double a = Da / D,
                    b = Db / D;
            if(C.getY() == a * C.getX() + b) {
                System.out.println("- 3 diem A, B , C thang hang.");
            }
        }
        // return 2;
    }

    public static double KhoangCach(Point A, Point B) {
        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2) +
                Math.pow(B.getY() - A.getY(), 2));
    }

    public static double chuVi(Point A, Point B, Point C) {
        return Point.KhoangCach(A, B) +
                Point.KhoangCach(A, C) +
                Point.KhoangCach(C, B);
    }

    public static double dienTich(Point A, Point B, Point C) {
        double p = chuVi(A, B, C) / 2;
        return Math.sqrt(p * (p - Point.KhoangCach(A, B)) *
                (p - Point.KhoangCach(A, C)) *
                (p - Point.KhoangCach(C, B)) );
    }
}
