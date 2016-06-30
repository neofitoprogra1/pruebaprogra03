
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guardar Autor</title>
    </head>
    <body>
        <h1>GUARDAR AUTOR</h1>
        <form method="POST" action="../ServletAutor">
            <table border="3">
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
                    <td><input type="date" name="fecha_nacimiento" ></td>
                </tr>
                
            </table>
            <br>
            <button type="submit" class="btn btn-default" name="guardar">Guardar</button>
        </form>
    </body>
</html>
