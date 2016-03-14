/**
 * Created by 46066294p on 14/03/16.
 */
public class Estadistica extends Peticionari implements DadesTemps {

    String estatTemps;

    public Estadistica(){
        Peticionari peticionari = new Peticionari();
        estatTemps = peticionari.getDescripcio();
    }


    @Override
    public void getTemps() {

    }

    @Override
    public void getHumitat() {

    }

    @Override
    public void getPressio() {

    }

    @Override
    public void dadesActualitzades() {

    }
}
