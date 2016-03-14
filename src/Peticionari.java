/**
 * Created by 46066294p on 14/03/16.
 */
public class Peticionari extends Peticio {

    private String descripcio = "";
    boolean hiHapermis = false;


    //constr
    public Peticionari(){}

    //metodes
    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public void addDadesTemps(DadesTemps dadesTemps) {
        super.addDadesTemps(dadesTemps);
    }

    @Override
    public void deleteDadesTemps(DadesTemps dadesTemps) {
        super.deleteDadesTemps(dadesTemps);
    }
}
