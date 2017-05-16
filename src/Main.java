/**
 * Created by Николай on 06.05.2017.
 */
public class Main {
    public static void main(String args[]){
        Director director = new Director();
        Builder builder = new ZestawXT001();
        Builder builder2 = new ZestawABC996();

        System.out.println("\nZESTAW1");
        director.setBuilder(builder);
        director.skladaj();
        ZestawKomputerowy zestaw1 = director.getZestaw();


        director.setBuilder(builder2);
        director.skladaj();
        ZestawKomputerowy zestaw2 = director.getZestaw();


        zestaw1.show();
        System.out.println("\n\nZESTAW2");
        zestaw2.show();

        //String s = Console.ReadLine();
    }
}
