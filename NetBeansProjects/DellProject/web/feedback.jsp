<%-- 
    Document   : feedback
    Created on : 
    Author     : Ismail Cam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Dell</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- BOOTSRAP -->
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://localhost:8080/DellProject/bootstrap/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="http://localhost:8080/DellProject/bootstrap/css/bootstrap-theme.min.css">
        <!-- /BOOTSRAP -->



    </head> 

    <nav class="navbar" style="background: #1486C1; border-radius: 0px; padding: 10px;">
        <div class="container">
            <div class="navbar-header">
                <a href="http://localhost:8080/DellProject/"><img src="http://localhost:8080/DellProject/img/logo_white.png" width="40"></a>
            </div>
        </div>
    </nav>

    <div class="container">
        <%= session.getAttribute( "message" )%>
    </div> <!-- /container -->

    <footer style="background: #1486C1; padding: 10px; color: #ffffff; text-align: center; position: absolute; bottom: 0px; width: 100%;">
        <div class="container">    
            <p style="font-size: 10px;">&copy; 2015 Dell</p>
        </div>
    </footer>





    <!-- BOOTSRAP -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://localhost:8080/DellProject/bootstrap/js/bootstrap.min.js"></script>
    <!-- /BOOTSRAP -->
</body>
</html>
