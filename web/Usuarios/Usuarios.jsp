<%@page import="AccesoDato.Conexion"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Tabla Usuarios</title>

    <!-- Bootstrap core CSS -->
    <link href="../Templates/css/Bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="navbar.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            <a class="navbar-brand" href="../index2.jsp">Bienvenido Usuario</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="Usuarios.jsp">Tabla Usuarios</a></li>
              <li><a href="../Libros/Libros.jsp">Libros</a></li>
              <li><a href="../Autores/Autores.jsp">Autores</a></li>
            </ul>
              <ul class="nav navbar-nav navbar-right">
            <li><a href="../Sesion.jsp">Cerrar Sesion</a></li>
          </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>

      <!-- Main component for a primary marketing message or call to action -->
      <div>
          <br>
        <a href="guardar.jsp" class="btn btn-primary">AGREGAR USUARIO</a>
          <br>
          <% Conexion con=new Conexion(); %>
          <br>
          <form method="post" action="Usuarios.jsp">
            Buscar por Nombre:<input type="text" name="buscar" ><input type="submit" value="Buscar">
        </form>
          <br>
            <table class="table table-striped">
                <thead>
                <th>ID</th>
                <th>NOMBRE</th>
                <th>APELLIDO PATERNO</th>
                <th>APELLIDO MATERNO</th>
                <th>LIBRO ID</th>
                <th>USERNAME</th>
                <th>PASSWORD</th>
                <th>ESTADO</th>
                </thead>
                <tbody>
                    <%
                if (request.getParameter("buscar") != null) {
                    if (request.getParameter("buscar").isEmpty()) {
                        con.setConsulta("select * from usuarios where estado='activo'");
                    } else {
                        String nombre = request.getParameter("buscar");
                        con.setConsulta("select * from usuarios where nombre like '%"+nombre+"%' and estado='activo'");
                    }
                }else{
                    con.setConsulta("select * from usuarios where estado='activo'");
                }
            %>
                    <%

                       con.setConsulta("select * from usuarios where estado='activo'");
                       while(con.getResultado().next()){
                        out.println("<tr>");
                           out.println("<td>"+con.getResultado().getString("usuario_id")+"</td>");
                           out.println("<td>"+con.getResultado().getString("nombre")+"</td>");
                           out.println("<td>"+con.getResultado().getString("apepat")+"</td>");
                           out.println("<td>"+con.getResultado().getString("apemat")+"</td>");
                           out.println("<td>"+con.getResultado().getString("libro_id")+"</td>");
                           out.println("<td>"+con.getResultado().getString("username")+"</td>");
                           out.println("<td>"+con.getResultado().getString("password")+"</td>");
                           out.println("<td>"+con.getResultado().getString("estado")+"</td>");
                           out.println("<td>"+"<a href='editar.jsp?editar="+con.getResultado().getString("usuario_id")+"' class='btn btn-success'>EDITAR</a>"+"</td>");
                           out.println("<td>"+"<a href='../ServletUsuario?eliminar="+con.getResultado().getString("usuario_id")+"' class='btn btn-danger'>ELIMINAR</a>"+"</td>");
                        out.println("</tr>");
                       }
                    %>
                </tbody>
            </table>
          
      </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../Templates/js/Bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
