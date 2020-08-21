<%-- 
    Document   : consumo
    Created on : Aug 20, 2020, 3:37:15 PM
    Author     : andre
--%>

<%@page import="uddi.ServicioHoras_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sección de Pagos por Hora</h1>
        
         <%-- Formulario captura datos --%>
        <form action="consumo.jsp" method="POST">
            <label for="txt_nombre"> Pago por Hora: </label>              
            <input type="text" name="txt_pagoHora"/>
            <br/>  
                       
            <h2>Ingrese las horas por día</h2>
            <label for="txt_nombre"> Día 1: </label>              
            <input type="text" name="txt_d1"/>
              <br/>  
            <label for="txt_nombre"> Día 2: </label>              
            <input type="text" name="txt_d2"/>
              <br/>  
            <label for="txt_nombre"> Día 3: </label>              
            <input type="text" name="txt_d3"/>
              <br/>  
            <label for="txt_nombre"> Día 4: </label>              
            <input type="text" name="txt_d4"/>
              <br/>  
            <label for="txt_nombre"> Día 5: </label>              
            <input type="text" name="txt_d5"/>
              <br/>  
            <label for="txt_nombre"> Día 6: </label>              
            <input type="text" name="txt_d6"/>
              <br/>  
            <label for="txt_nombre"> Día 7: </label>              
            <input type="text" name="txt_d7"/>
              <br/>  
                       
            <button type="submit">Enviar</button>
            
        </form>
        
         <%-- variables de datos --%>
         <%! 
         String d_pagoHora,d1,d2,d3,d4,d5,d6,d7; 
         %>
         
         <%-- almacenar en los datos --%>
         <%
            d_pagoHora = request.getParameter("txt_pagoHora");
            d1 = request.getParameter("txt_d1");
             d2 = request.getParameter("txt_d2");
              d3 = request.getParameter("txt_d3");
               d4 = request.getParameter("txt_d4");
                d5 = request.getParameter("txt_d5");
                 d6 = request.getParameter("txt_d6");
                  d7 = request.getParameter("txt_d7");
         %>
        
        
    </body>
</html>

<%-- web service invocar --%>
         <%
            try {
                    uddi.ServicioHoras_Service service = new ServicioHoras_Service();
                    uddi.ServicioHoras port = service.getServicioHorasPort();
                    
                    double pagoHora = Double.parseDouble(d_pagoHora);
                    double S_d1 = Double.parseDouble(d1);
                    double S_d2 = Double.parseDouble(d2);
                    double S_d3 = Double.parseDouble(d3);
                    double S_d4 = Double.parseDouble(d4);
                    double S_d5 = Double.parseDouble(d5);
                    double S_d6 = Double.parseDouble(d6);
                    double S_d7 = Double.parseDouble(d7);
                    
                    double result = port.pago(pagoHora);
                    out.println("Pago por horas es de = " + result);
                    
                    double result1 = port.horas(S_d1, S_d2, S_d3, S_d4, S_d5, S_d6, S_d7);
                    out.println("Horas a la semana es de = " + result1);
                    
                    out.println("Pago al mes es de = " + result*result1);               
                        
                        
                } catch (Exception e) {
                    
                }
         %>
