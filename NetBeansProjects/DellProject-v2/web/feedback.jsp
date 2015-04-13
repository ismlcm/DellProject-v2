<%-- 
    Document   : feedback
    Created on : 
    Author     : Ismail Cam
--%>

<%@page import="Control.Main_Control"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <% out.print( Main_Control.viewControl.getHead("Dell") ); %>
    </head> 

        <% out.print( Main_Control.viewControl.getNav() ); %>

    <div class="container">
        <%= session.getAttribute( "message" )%>
    </div> <!-- /container -->

        <% out.print( Main_Control.viewControl.getFooter() ); %>
</body>
</html>
