/**
 * Created by Николай on 06.05.2017.
 */
public class ZestawKomputerowy {
    private String monitor;
    private String procesor;

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setGrafika(String grafika) {
        this.grafika = grafika;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    private String grafika;
    private String ram;
    private String hdd;

    public void show() {
        if (monitor != null) System.out.println("Monitor = " + monitor);
        if (procesor != null) System.out.println("Procesor = " + procesor);
        if (grafika != null) System.out.println("Grafika = " + grafika);
        if (ram != null) System.out.println("RAM = " + ram);
        if (hdd != null) System.out.println("HDD = " + hdd);
    }
}
