/**
 * Created by Николай on 06.05.2017.
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder)
    {
        this.builder = builder;
    }

    public ZestawKomputerowy getZestaw()
    {
        return builder.getZestaw();
    }

    public void skladaj()
    {
        builder.newZestaw();
        builder.buildMonitor();
        builder.buildProcesor();
        builder.buildHdd();
        builder.buildRam();
        builder.buildGrafika();
    }

}
