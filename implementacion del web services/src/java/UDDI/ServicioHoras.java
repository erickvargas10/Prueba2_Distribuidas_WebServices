package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServicioHoras")
public class ServicioHoras {

    
    @WebMethod(operationName = "pago")
    public double pago(@WebParam(name = "pago") double pago) {
        return pago;
    }
    @WebMethod(operationName = "horas")
    public double horas(@WebParam(name = "h1") double h1, @WebParam(name="h2") double h2,
            @WebParam(name="h3") double h3, @WebParam(name="h4") double h4, @WebParam(name="h5") double h5,
            @WebParam(name="h6") double h6, @WebParam(name="h7") double h7) {
        return (h1+h2+h3+h4+h5+h6+h7);
    }
}
