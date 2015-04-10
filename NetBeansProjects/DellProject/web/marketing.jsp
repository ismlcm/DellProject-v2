<%-- 
    Document   : marketing
    Created on : 10-04-2015, 09:16:59
    Author     : Ismail Cam
--%>

<%@page import="Control.MainControl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <% out.print( MainControl.viewcontrol.getHead("Dell") ); %>
    </head>
    
        <% out.print( MainControl.viewcontrol.getNav() ); %>
        
    <body>
        <div class="container">
            <%= session.getAttribute( "message" )%>
        </div> <!-- /container -->
        
        <% out.print( MainControl.viewcontrol.getFooter() ); %>
    </body>
</html>
