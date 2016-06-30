package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Negocio.Usuario;

/**
 *
 * @author Administrador
 */
public class ServletUsuario extends HttpServlet {

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
               Usuario usu=new Usuario();
               //ASIGNO LA ID
               usu.setUsuario_id(id);
               //ELIMINO USAURIO
               usu.delete();
               //REDIRECCIONO A INDEX DESPUES DE ELIMINAR
               response.sendRedirect("index.jsp");
               
           }else if(request.getParameter("guardar")!=null){
               String usuario=request.getParameter("usuario");
               String fecha_nacimiento=request.getParameter("fecha_nacimiento");
               String clave=request.getParameter("clave");
               Usuario usu=new Usuario();
               usu.setUsuario("usuario");
               usu.setFecha_nacimiento("fecha_nacimiento");
               usu.setClave("clave");
               usu.save();
               //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
               response.sendRedirect("index.jsp");
               
           }else if(request.getParameter("editar")!=null){
               int usuario_id=Integer.parseInt(request.getParameter("usuario_id"));
               String fecha_nacimiento=request.getParameter("fecha_nacimiento");
               String clave=request.getParameter("clave");
               Usuario usu=new Usuario();
               usu.setUsuario_id(usuario_id);
               usu.setFecha_nacimiento("fecha_nacimiento");
               usu.setClave("clave");
               usu.update();
               response.sendRedirect("index.jsp");
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
