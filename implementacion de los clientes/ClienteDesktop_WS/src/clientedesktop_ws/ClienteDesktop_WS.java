package clientedesktop_ws;

public class ClienteDesktop_WS {

    public static void main(String[] args) {  
        int h1,h2,h3,h4,h5,h6,h7 ;
        h1=2;
        h7=3;
        h6=5;
        h5=1;
        h4=10;
        h3=2;
        h2=2;
        
        int pagos=10;
        System.err.println("El pago por hora es de : " + pago(pagos));
        System.err.println("Las horas a la semana es de : " + horas(h1, h2, h3, h4, h5, h6, h7));
        System.err.println("El sueldo es de " + (pago(pagos))*horas(h1, h2, h3, h4, h5, h6, h7));
    }

    private static double pago(double pago) {
        uddi.ServicioHoras_Service service = new uddi.ServicioHoras_Service();
        uddi.ServicioHoras port = service.getServicioHorasPort();
        return port.pago(pago);
    }

    private static double horas(double h1, double h2, double h3, double h4, double h5, double h6, double h7) {
        uddi.ServicioHoras_Service service = new uddi.ServicioHoras_Service();
        uddi.ServicioHoras port = service.getServicioHorasPort();
        return port.horas(h1, h2, h3, h4, h5, h6, h7);
    }
    
}
