<%-- 
    Document   : marketing
    Created on : 10-04-2015, 09:16:59
    Author     : Ismail Cam
--%>

<%@page import="Control.Main_Control"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <% out.print( Main_Control.viewControl.getHead( "Dell" ) ); %>
    </head>

    <% out.print( Main_Control.viewControl.getNav() );%>

    <body>
        <div class="container">
            <%= session.getAttribute( "message" )%>


            <div class="row">
                <div class="col-md-4">
                    <h3>New Partners</h3>
                    <div style="border-radius: 10px; border: 1px solid #DDDDDD; height: 270px; padding: 10px;">

                        <button type="button" class="btn btn-default" style="bottom:10px; right:25px; position: absolute;">Show</button>
                    </div>
                </div>

                <div class="col-md-4">
                    <h3>New Projects</h3>
                    <div style="border-radius: 10px; border: 1px solid #DDDDDD; height: 270px; padding: 10px;">

                        <h1 align="center" style="font-size: 100px; margin-top: 60px;">5</h1>

                        <a id="nproject" onclick="hidetext('nproject')" data-toggle="collapse" href="#collapsenp" aria-expanded="false" aria-controls="collapsenp" class="btn btn-default" style="color:#158DB8; bottom:10px; right:25px; position: absolute;">Show</a>
                    </div>
                </div>

                <div class="col-md-4">
                    <h3>Pending Projects</h3>
                    <div style="border-radius: 10px; border: 1px solid #DDDDDD; height: 270px; padding: 10px;">

                        <a id="pproject" onclick="hidetext('pproject')" data-toggle="collapse" href="#collapsepp" aria-expanded="false" aria-controls="collapsepp" class="btn btn-default" style="color:#158DB8; bottom:10px; right:25px; position: absolute;">Show</a>
                    </div>
                </div>
            </div>

            <hr>
        </div> <!-- /container -->

        <div class="container">

            <div class="collapse" id="collapsenp">
                <div class="well">

                    <h1>New Projects</h1>

                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <td>Project id</td>
                                <td>Partner id</td>
                                <td>Title</td>
                                <td>Startdato</td>
                                <td>Cost</td>
                                <td>Status</td>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>1000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>135.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>2</td>
                                <td>2000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>125.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>   
                        </tbody>
                    </table>

                </div>
            </div>
            
            <!-- :::::::::::::::::: -->
            
            <div class="collapse" id="collapsepp">
                <div class="well">

                    <h1>Pending Projects</h1>

                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <td>Project id</td>
                                <td>Partner id</td>
                                <td>Title</td>
                                <td>Startdato</td>
                                <td>Cost</td>
                                <td>Status</td>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>1000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>135.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>2</td>
                                <td>2000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>125.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>3000</td>
                                <td>New Campaign</td>
                                <td>12-12-2015</td>
                                <td>935.000 $</td>
                                <td>New</td>
                                <td><button class="btn btn-primary btn-xs">&rarr;</button></td>
                            </tr>   
                        </tbody>
                    </table>

                </div>
            </div>

        </div> <!-- /container -->

        <% out.print( Main_Control.viewControl.getFooter() );%>
        
        <script>
            function hidetext(id)
            {
                var e = document.getElementById(id);
                
                if(e.innerHTML == "Show")
                {
                    e.innerHTML = "Close";
                    
                }
                else if(e.innerHTML == "Close")
                {
                    
                    e.innerHTML = "Show";
                }

            }
        </script>
    </body>
</html>
