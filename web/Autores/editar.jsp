


<%@page import="AccesoDato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Autor</title>
    </head>
    <body>
        <h1>EDITAR AUTOR</h1>
        <% //String autor_id=request.getParameter("autor_id"); %> 
        <form method="POST" action="../ServletAutor">
            <table border="3">
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="autor_id" placeholder="Id Autor"></td>
                </tr>
                <tr>
                    <td>NOMBRE</td>
                    <td><input type="text" name="nombre" placeholder="Nombre"></td>
                </tr>
                <tr>
                    <td>APEPAT</td>
                    <td><input type="text" name="apepat" placeholder="Apellido Paterno"></td>
                </tr>
                <tr>
                    <td>APEMAT</td>
                    <td><input type="text" name="apemat" placeholder="Apellido Materno"></td>
                </tr>
                <tr>
                    <td>FECHA NACIMIENTO</td>
                    <td><input type="date" name="fecha_nacimiento"></td>
                </tr>
                
            </table>
            <br>
            <button type="submit" class="btn btn-default" name="editar">Actualizar</button>
        </form>
    </body>
</html>
