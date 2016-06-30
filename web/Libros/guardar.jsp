
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guardar Libro</title>
    </head>
    <body>
        <h1>GUARDAR LIBRO</h1>
        <form method="POST" action="../ServletLibro">
            <table border="3">
                <tr>
                    <td>NOMBRE</td>
                    <td><input type="text" name="nombre" placeholder="Nombre"></td>
                </tr>
                <tr>
                    <td>CANTIDAD PAGINAS</td>
                    <td><input type="text" name="cantidad_paginas"></td>
                </tr>
                <tr>
                    <td>ID AUTOR</td>
                    <td><input type="text" name="autor_id" placeholder="Id Autor"></td>
                </tr>
                </table>
            <br>
            <button type="submit" class="btn btn-default" name="guardar">Guardar</button>
        </form>
    </body>
</html>
