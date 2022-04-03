import java.util.Date;

public class Super extends Establecimiento {
    public Super(String nombre, Date fechaApertura, String ubicacion, int extension, double facturacionAnual) {
        super(nombre, fechaApertura, ubicacion, extension, facturacionAnual);
    }

    protected void denomina() {
        System.out.println("\tEste " + getClass().getName() + " se inaguró el " + formadate() + ".");
    }
}