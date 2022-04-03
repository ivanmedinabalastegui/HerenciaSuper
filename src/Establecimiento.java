import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;

public class Establecimiento {

    // Atributos
    protected String nombre;
    protected Date fechaApertura;
    protected String ubicacion;
    protected int extension;
    protected double facturacionAnual;

    // Constructor
    public Establecimiento(String nombre, Date fechaApertura, String ubicacion, int extension, double facturacionAnual) {
        this.nombre = nombre;
        this.fechaApertura = fechaApertura;
        this.ubicacion = ubicacion;
        this.extension = extension;
        this.facturacionAnual = facturacionAnual;
    }

    protected void denomina() {
        System.out.println("Este " + getClass().getName() + " se fundó el " + formadate() + ".");
    }

    protected void facturacion() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(getClass().getName() + " " + nombre + " ha tenido una facturación de " + nf.format(facturacionAnual) + ".");
    }

    protected String formadate() {
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaCadena = fecha.format(fechaApertura);
        return fechaCadena;
    }

    public String toString() {
        facturacion();
        denomina();
        return "";
    }

    public static void main(String[] args) {

        Date fechaEstablecimiento = new Date("2014/03/01");
        Date fechaHiper = new Date("2015/01/02");
        Date fechaSuper = new Date("2018/07/02");
        Date fechaCash = new Date("2017/10/15");

        Establecimiento[] HoldingAlim = new Establecimiento[4];
        HoldingAlim[0] = new Establecimiento("Mi Tienda", fechaEstablecimiento, "afueras", 400, 1.0);
        HoldingAlim[1] = new Hiper("San Pablo", fechaHiper, "céntrico", 400, 5252525.74);
        HoldingAlim[2] = new Super("Macarena", fechaSuper, "céntrico", 400, 1212121.38);
        HoldingAlim[3] = new Cash("Nervión", fechaCash, "polígono", 400, 2020202.13);

        System.out.println();
        System.out.println("\t\t\tPROGRAMA ESTABLECIMIENTO");
        System.out.println();
        HoldingAlim[0].denomina();
        System.out.println();

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        double facturacionTotal = 0;
        int x = HoldingAlim.length;
        for (int i = 1; i < x; i++) {
            System.out.println(HoldingAlim[i]);
            facturacionTotal += HoldingAlim[i].facturacionAnual;
        }
        System.out.println("La facturación total de nuestros establecimientos fue: " + nf.format(facturacionTotal) + ".");
    }
}