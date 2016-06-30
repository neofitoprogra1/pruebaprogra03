
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

    <title>Navbar Template for Bootstrap</title>

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
          
         

      <!-- Main component for a primary marketing message or call to action -->
      <div>
          <br>
          <a>Inicie Sesion por favor.</a>
          <br>
          <form method="post" action="ServletSesion">
            Username:<input type="text" name="sesion" >
            Password:<input type="password" name="clave" ><input type="submit" value="Login">
        </form>
          <br>
          <table class="table table-hover">
                <thead>
                <th>ID</th>
                <th>Sesion</th>
                <th>Clave</th>
                </thead>
                <tbody>
                    <%
                       Conexion con=new Conexion();
                //if (request.getParameter("sesion,clave") != null) {
                //    if (request.getParameter("sesion,clave").isEmpty()) {
                  //      con.setConsulta("select * from Sesiones");
                   // } else {
                     //   String sesion = request.getParameter("sesion,clave");
                       // con.setConsulta("select * from Sesiones where sesion like '%"+sesion+"%' and clave='clave'");
                        
                //    }
                //}else{
                    con.setConsulta("select * from Sesiones");
                //}
            //
                       con.setConsulta("select Sesiones.sesion_id, Sesiones.sesion, Sesion.clave from Sesiones");
                       while(con.getResultado().next()){
                        out.println("<tr>");
                        
                        
                           out.println("<td>"+con.getResultado().getString("sesion_id")+"</td>");
                           out.println("<td>"+con.getResultado().getString("sesion")+"</td>");
                           out.println("<td>"+con.getResultado().getString("clave")+"</td>");
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