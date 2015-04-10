<%-- 
    Document   : index
    Created on : 09-04-2015, 11:04:35
    Author     : Ismail Cam
--%>

<%@page import="Control.FormControl"%>
<%@page import="Control.MainControl"%>
<%@page import="Interface.ViewInterface"%>
<%@page import="Control.ViewControl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% MainControl.usercontrol.createDummyUsers(); %>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <% out.print( MainControl.viewcontrol.getHead("Dell") ); %>
    </head> 

        <% out.print( MainControl.viewcontrol.getNav() ); %>

    <div class="container">
        
        <div class="row" style="border:1px solid #DDDDDD; border-radius: 10px;">
            <div class="col-md-6" style="padding: 20px; height: 370px;">
                <h3>Dell Account Sign In</h3>
                <form name="loginform" id="loginform" action="FormControl" method="POST">
                    <div class="form-group" style="width: 50%">
                        <input type="text" class="form-control" id="loginid" name="loginid" placeholder="Account id">
                    </div>
                    <div class="form-group" style="width: 50%">
                        <input type="password" class="form-control" id="loginpassword" name="loginpassword" placeholder="Password">
                    </div>
                    <input type="hidden" name="origin" value="loginform" />
                    <button type="submit" class="btn btn-primary">Sign in</button>
                </form>
              
                <p style="margin-top: 10px;">
                    <a data-toggle="collapse" href="#collapseExample" aria-expanded="false" aria-controls="collapseExample" style="color:#158DB8">Forgot your password?</a>
                </p>
                <div class="collapse" id="collapseExample">
                    <div class="well">

                        <p>Enter the email address associated with your account and click Reset password.</p>

                        <form class="form-inline" name="resetpasswordform" action="FormControl" method="POST">
                            <div class="form-group">
                                <input type="email" class="form-control" id=resetemail placeholder="Email address">
                            </div>
                            <input type="hidden" name="origin" value="resetpasswordform" />
                            <button type="submit" class="btn btn-default">Reset Password</button>
                        </form>

                    </div>
                </div>

            </div>
            <div class="col-md-6" style="background: #EEEEEE; height: 370px; border-bottom-right-radius: 10px; border-top-right-radius: 10px;">
                <div style="padding: 20px;">
                    <h3 style="margin-bottom: 20px;">Don't have an Partner Account?</h3>

                    <!-- Large modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Create Account</button>

                    <div class="modal bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h3 class="modal-title" id="myLargeModalLabel">Register for a Dell Partner Account</h3>
                                </div>
                                <div class="modal-body">

                                    <form name="createaccount" id="createaccount" method="POST" action="FormControl">
                                        <div class="form-group">

                                            <input type="text" class="form-control" id="companyid" placeholder="Company ID">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="companyname" placeholder="Company Name">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="address" placeholder="Address">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="city" placeholder="City">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="postcode" placeholder="Postcode">
                                        </div>
                                        <div class="form-group">
                                            <input type="email" class="form-control" id="email" placeholder="E-mail">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="phone" placeholder="Phone">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id="password" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <input type="hidden" class="form-control" id="status" value="">
                                            <input type="hidden" class="form-control" id="usertype" value="">
                                        </div>
                                        <input type="hidden" name="origin" value="createaccountform" />
                                        <button type="submit" class="btn btn-primary">Create Account</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <p style="margin-top:20px;">
                        With an Partner account on Dell, you can:
                    <ul>
                        <li>Place projects.</li>
                        <li>Track and manage your projects.</li>
                        <li>Receive updates and maintenance information about your projects.</li>
                    </ul>
                    </p>
                </div>
            </div>
        </div>


    </div> <!-- /container -->

    <% out.print( MainControl.viewcontrol.getFooter() ); %>
    
</body>
</html>
