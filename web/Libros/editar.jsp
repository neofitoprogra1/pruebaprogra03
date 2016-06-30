
<%@page import="AccesoDato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Libro</title>
    </head>
    <body>
        <h1>EDITAR LIBRO</h1>
            <% //String album_id=request.getParameter("album_id"); %> 
            <form method="POST" action="../ServletLibro">
            <table border="3">
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="libro_id" placeholder="Id Libro"></td>
                </tr>
                <tr>
                    <td>NOMBRE</td>
                    <td><input type="text" name="nombre" placeholder="Nombre"></td>
                </tr>
                <tr>
                    <td>ID AUTOR</td>
                    <td><input type="text" name="autor_id" placeholder="Id autor"></td>
                </tr>
                <tr>
                    <td>CANTIDAD DE PAGINAS</td>
                    <td><input type="text" name="cantidad_paginas" placeholder="Cantidad Paginas"></td>
                </tr>
                                       
            </table>
            <br>
            <button type="submit" class="btn btn-default" name="editar">Actualizar</button>
        </form>
    </body>
</html>
