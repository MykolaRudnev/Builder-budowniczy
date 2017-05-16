/**
 * Created by Николай on 06.05.2017.
 */
public class ZestawABC996 extends Builder {
    @Override
    public void buildMonitor() {
        zestawKomputerowy.setMonitor("LG");
    }

    @Override
    public void buildProcesor() {
        zestawKomputerowy.setProcesor("INTEL");
    }

    @Override
    public void buildGrafika() {
            //zestaw nie obejmuje karty graficznej
    }

    @Override
    public void buildRam() {
        zestawKomputerowy.setRam("DDR3");
    }

    @Override
    public void buildHdd() {
        zestawKomputerowy.setHdd("Samsung");

    }
}
