import java.util.Scanner;

/**
 * Created by Николай on 06.05.2017.
 */
public class ZestawXT001 extends  Builder {
    Scanner scanner = new Scanner(System.in);
        int i ;
    String wynik;
    @Override
    public void buildMonitor() {
        zestawKomputerowy.setMonitor("Benq 19");
    }

    @Override
    public void buildProcesor() {
        zestawKomputerowy.setProcesor("amd");
    }

    @Override
    public void buildGrafika() {
        zestawKomputerowy.setGrafika("ATI");
    }

    @Override
    public void buildRam() {
        zestawKomputerowy.setRam("DDR3");
    }

    @Override
    public void buildHdd() {


        int t;
        while (true){
            System.out.println("Dysk do wyboru: (1) Samsung, (2) Segate, (3) Caviar");
            i= scanner.nextInt();

            if(i>0 && i<4) break;

        }

        if(i==1) wynik = "Samsung";
        else if(i==2) wynik = "Segate";
        else if(i==3) wynik = "Caviar";

        zestawKomputerowy.setHdd(wynik);

    }
}
