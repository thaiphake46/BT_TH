import java.util.Scanner;

public class Main {
    public static void sort(int[] a, int n){
        int m, temp;
        for(int i = 0; i < n-1; i++){
            m = i;
            for(int j = i+1; j < n; j++){
                if(a[j] < a[m]){
                    m = j;
                }
            }
            if(m != i){
                temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }
        }
    }

    public static double tbc(int[] a, int n) {
        double tong = 0;
        for(int i = 0; i < n; i++) {
            tong += a[i];
        }
        return tong;
    }

    public static void B1() {
        System.out.println("Bai 1:");
        System.out.println("- A. Sap xep day so.");
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhap vao so luong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        // Nhap mang
        for(int i = 0; i < n; i++){
            System.out.printf("\t+ a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        // Sap xep
        sort(a,n);
        System.out.println("- In ra day so da sap sep:");
        for(int i = 0; i < n; i++){
            System.out.printf("\t+ a[%d]: %d\n", i, a[i]);
        }

        System.out.println("- B. Tinh trung binh cong day so.");
        System.out.println("\t+ Tbc = " + tbc(a, n)/n);
    }

    public static void B2() {
        Point A = new Point(1, -1),
                B = new Point(2, 1),
                C = new Point(4, 5);

        Point.baDiemThangHang(A, B, C);

        Point.phuongTrinhDT(A, B);

        System.out.println("- Chu vi tam giac ABC: " + Point.chuVi(A, B, C));

        System.out.println("- Dien tich tam giac: " + Point.dienTich(A, B, C));
    }

    public static void B3() {

    }

    public static void main(String[] args) {
        B1();
        B2();
    }
}
