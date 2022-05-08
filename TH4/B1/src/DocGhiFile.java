import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.Arrays;

public class DocGhiFile {
    public static Scanner sc = new Scanner(System.in);
    public static void taoFile() throws IOException {
        File fileDaySo = null;
        boolean isCreat = false;
        String tenFile = sc.nextLine();
//        System.out.printf("%s",tenFile);
        try{
            fileDaySo = new File("file\\"+tenFile+".txt");
            isCreat = fileDaySo.createNewFile();
            if (isCreat)
                System.out.print("Da tao file thanh cong!");
            else
                System.out.print("Tao file that bai");
        }
        catch (Exception e){
            System.out.print(e);
        }

    }

    public static void ghiFile() throws IOException{
        int[] arr = {1,2,3,4,5};
        String strArr = Arrays.toString(arr);
//        String tenFile = sc.nextLine();
        try {
            FileWriter fw = new FileWriter("file\\out.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(strArr);
            bw.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void docFile() throws IOException {
//        String tenFile = sc.nextLine();
        try {
            FileReader fr = new FileReader("file\\out.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
//            System.out.println(line);
            String[] splitt = line.split(", ");
            for(String s : splitt) {
                System.out.println(s);
            }
//            while (true) {
//                a;
//            }
            br.close();
            fr.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
