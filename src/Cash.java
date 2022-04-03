import java.util.Date;

public class Cash extends Establecimiento {
    public Cash(String nombre, Date fechaApertura, String ubicacion, int extension, double facturacionAnual) {
        super(nombre, fechaApertura, ubicacion, extension, facturacionAnual);
    }

    protected void denomina() {
        System.out.println("\tEste " + getClass().getName() + " se puso en servicio el " + formadate() + ".");
    }
}
