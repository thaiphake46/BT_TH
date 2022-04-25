import java.io.IOException;

public class CountDownThread extends Thread{
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

    public void run() {
        int count = 10;
        for(int i = count; i >=0; i--) {
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec ("cls");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//            clearConsole();
            System.out.println(i);
            if(i == 0) {
                System.out.println("Het gio");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
