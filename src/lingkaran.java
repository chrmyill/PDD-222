import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lingkaran {
    public static void main(String[] args) throws IOException
    {
        // inputan
        int r;
        double luas;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)
        );

        System.out.print("Masukan Jari-Jari =");
        r= Integer.parseInt(br.readLine());


        // proses
        luas = 3.14*r*r ;

        //output
        System.out.println("Luas Lingkaran " + luas);

    }
}
