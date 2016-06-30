
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Negocio.Libro;

/**
 *
 * @author Administrador
 */
public class ServletLibro extends HttpServlet {

    

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
               Libro alb=new Libro();
               //ASIGNO LA ID
               alb.setLibro_id(id);
               //ELIMINO USAURIO
               alb.delete();
               //REDIRECCIONO A INDEX DESPUES DE ELIMINAR
               response.sendRedirect("Libros/Libros.jsp");
               
           }else if(request.getParameter("guardar")!=null){
               String nombre=request.getParameter("nombre");
               int cantidad_paginas=Integer.parseInt(request.getParameter("cantidad_paginas"));
               int autor_id=Integer.parseInt(request.getParameter("autor_id"));
               Libro alb=new Libro();
               alb.setNombre(nombre);
               alb.setCantidad_paginas(cantidad_paginas);
               alb.setAutor_id(autor_id);
               alb.save();
               response.sendRedirect("Libros/Libros.jsp");
               
           }else if(request.getParameter("editar")!=null){
               int libro_id=Integer.parseInt(request.getParameter("libro_id"));
               String nombre=request.getParameter("nombre");
               int cantidad_paginas=Integer.parseInt(request.getParameter("cantidad_paginas"));
               int autor_id=Integer.parseInt(request.getParameter("autor_id"));
               Libro alb=new Libro();
               alb.setLibro_id(libro_id);
               alb.setNombre(nombre);
               alb.setCantidad_paginas(cantidad_paginas);
               alb.setAutor_id(autor_id);
               alb.update();
               response.sendRedirect("Libros/Libros.jsp");
               
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
