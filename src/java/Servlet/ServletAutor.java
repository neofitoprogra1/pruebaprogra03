package Servlet;

import Negocio.Autor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class ServletAutor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            if(request.getParameter("eliminar")!=null){
               //RECIBO PARAMETRO LO CONVIERTO EN ENTERO
               int id=Integer.parseInt(request.getParameter("eliminar"));
               out.println("Eliminar ID:"+id);
               //CREO UN OBJETO USARIO
               Autor aut=new Autor();
               //ASIGNO LA ID
               aut.setAutor_id(id);
               //ELIMINO USAURIO
               aut.delete();
               //REDIRECCIONO A INDEX DESPUES DE ELIMINAR
               response.sendRedirect("Autores/Autores.jsp");
               
           }else if(request.getParameter("guardar")!=null){
               String nombre=request.getParameter("nombre");
               String apepat=request.getParameter("apepat");
               String apemat=request.getParameter("apemat");
               String fecha_nacimiento=request.getParameter("fecha_nacimiento");
               int nacionalidad_id=Integer.parseInt(request.getParameter("nacionalidad_id"));               
               Autor aut=new Autor();
               aut.setNombre(nombre);
               aut.setApepat(apepat);
               aut.setApemat(apemat);
               aut.setFecha_nacimiento(fecha_nacimiento);
               aut.save();
               //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
               response.sendRedirect("Autores/Autores.jsp");
               
           }else if(request.getParameter("editar")!=null){
               int autor_id=Integer.parseInt(request.getParameter("autor_id"));
               String nombre=request.getParameter("nombre");
               String apepat=request.getParameter("apepat");
               String apemat=request.getParameter("apemat");
               String fecha_nacimiento=request.getParameter("fecha_nacimiento");
               Autor aut=new Autor();
               aut.setAutor_id(autor_id);
               aut.setNombre(nombre);
               aut.setApepat(apepat);
               aut.setApemat(apemat);
               aut.setFecha_nacimiento(fecha_nacimiento);
               aut.update();
               response.sendRedirect("Autores/Autores.jsp");
               
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
