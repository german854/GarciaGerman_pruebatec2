package german.test2.gestionturnos.servlets;

import german.test2.gestionturnos.logica.Ciudadano;
import german.test2.gestionturnos.logica.Controladora;
import static java.awt.SystemColor.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CiudadanosSV")
public class CiudadanosSV extends HttpServlet {
    
    private ArrayList<Ciudadano> listaCiudadanos = new ArrayList<>();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //int numero = Integer.parseInt(request.getParameter("numero"));
        //String fecha = request.getParameter("fecha");
        //String descripcion = request.getParameter("descripcion");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int dni = Integer.parseInt(request.getParameter("dni"));
        
        Ciudadano ciudadano = new Ciudadano();
        
        ciudadano.setNombre(nombre);
        ciudadano.setApellidos(apellido);
        ciudadano.setDni(dni);
        
        control.crearCiudadano(ciudadano);
        
        response.sendRedirect("index.jsp");

    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String consultaApellido = request.getParameter("consultaApellido");
        
        listaCiudadanos = control.traerCiudadano();
        
        ArrayList<Ciudadano> ciudadanosCoincidentes = new ArrayList<>();

        for (Ciudadano ciudadano : listaCiudadanos) {
            if (ciudadano.getApellidos().equalsIgnoreCase(consultaApellido)) {
                ciudadanosCoincidentes.add(ciudadano);
            }
        }

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", ciudadanosCoincidentes);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }


    


}
