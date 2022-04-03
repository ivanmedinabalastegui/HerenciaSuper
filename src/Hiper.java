import java.util.Date;

public class Hiper extends Establecimiento {
    public Hiper(String nombre, Date fechaApertura, String ubicacion, int extension, double facturacionAnual) {
        super(nombre, fechaApertura, ubicacion, extension, facturacionAnual);
    }

    protected void denomina() {
        System.out.println("\tEste " + getClass().getName() + " se abrió el " + formadate() + ".");
    }
}
