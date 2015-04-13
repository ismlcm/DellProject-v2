<%-- 
    Document   : index
    Created on : 12-04-2015, 22:59:18
    Author     : Ismail Cam
--%>

<%@page import="Control.Main_Control"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <% out.print( Main_Control.viewControl.getHead( "Dell" ) ); %>
    </head> 

    <% out.print( Main_Control.viewControl.getNav() ); %>

    <div class="container">

        <div class="row" style="border:1px solid #DDDDDD; border-radius: 10px;">
            <div class="col-md-6" style="padding: 20px; height: 420px;">
                <h3>Dell account sign in</h3>
                <form name="loginform" id="loginform" action="FormControl" method="POST">
                    <div class="form-group" style="width: 50%">
                        <input type="text" class="form-control" id="loginvatnumber" name="loginvatnumber" placeholder="VAT number" style="background: #F5F6CE;">
                    </div>
                    <div class="form-group" style="width: 50%">
                        <input type="text" class="form-control" id="loginemail" name="loginemail" placeholder="Email address">
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
                            <button type="submit" class="btn btn-default">Reset password</button>
                        </form>

                    </div>
                </div>

            </div>
            <div class="col-md-6" style="background: #EEEEEE; height: 420px; border-bottom-right-radius: 10px; border-top-right-radius: 10px;">
                <div style="padding: 20px;">
                    <h3 style="margin-bottom: 20px;">Don't have an partner account?</h3>

                    <!-- Large modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Create account</button>

                    <p style="margin-top:20px;">
                        With an Partner account on Dell, you can:
                    <ul>
                        <li>Place projects.</li>
                        <li>Track and manage your projects.</li>
                        <li>Receive updates and maintenance information about your projects.</li>
                    </ul>
                    </p>

                    <br/>

                    <h4>Need to add more users to your existing account?</h4>
                    <a href="" data-toggle="modal" data-target=".bs-example-modal-sm">Create user &rarr;</a>

                    <div class="modal bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h3 class="modal-title" id="myLargeModalLabel">Create partner account</h3>
                                </div>
                                <div class="modal-body">

                                    <div class="row">

                                        <form name="createaccount" id="createaccount" method="POST" action="FormControl">

                                            <div class="col-md-6">

                                                    <h4>Company information</h4>

                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="cc_vatnumber" name="cc_vatnumber" placeholder="VAT number" style="background: #F5F6CE;">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="cc_companyname" name="cc_companyname" placeholder="Company Name">
                                                    </div>
                                                    <div class="form-group">
                                                        <select class="form-control" id="cc_country" name="cc_country">
                                                            <option value="">Country</option>
                                                            <option value="denmark">Denmark</option>
                                                            <option value="Germany">Germany</option>
                                                            <option value="England">England</option>
                                                            <option value="France">France</option>
                                                        </select>
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="cc_address" name="cc_address" placeholder="Address">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="cc_city" name="cc_city" placeholder="City">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="cc_postcode" name="cc_postcode" placeholder="Postcode">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="email" class="form-control" id="cc_email" name="cc_email" placeholder="E-mail">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="cc_phone" name="cc_phone" placeholder="Phone">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="password" class="form-control" id="cc_companypassword" name="cc_companypassword" placeholder="Password">
                                                    </div>

                                            </div>
                                            <div class="col-md-6">

                                                    <h4>User information <small>used to login</small></h4>

                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="ccu_firstname" name="ccu_firstname" placeholder="Firstname">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="ccu_lastname" name="ccu_lastname" placeholder="Lastname">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="ccu_email" name="ccu_email" placeholder="Email address">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" id="ccu_phone" name="ccu_phone" placeholder="Phone">
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="password" class="form-control" id="ccu_password" name="ccu_password" placeholder="Password">
                                                    </div>

                                                <input type="hidden" id="origin" name="origin" value="createcompany" />

                                            </div>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-success">Create account</button>
                                </div>

                                </form>

                            </div>
                        </div>
                    </div> <!-- /Create company modal -->

                    <div class="modal bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-sm">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h3 class="modal-title" id="mySmModalLabel">Create user</h3>
                                </div>
                                <div class="modal-body">

                                    <form data-toggle="validator" role="form" name="createuser" id="createuser" method="POST" action="FormControl">

                                        <div class="form-group">
                                            <input type="text" class="form-control" id="cu_vatnumber" name="cu_vatnumber" placeholder="VAT number" style="background: #F5F6CE;" required>
                                            <div class="help-block with-errors"></div>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id="cu_companypassword" name="cu_companypassword" placeholder="Company password" style="background: #F5F6CE;">
                                        </div>

                                        <hr>

                                        <h4>User information <small>used to login</small></h4>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="cu_firstname" name="cu_firstname" placeholder="Firstname">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="cu_lastname" name="cu_lastname" placeholder="Lastname">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="cu_email" name="cu_email" placeholder="Email address">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" id="cu_phone" name="cu_phone" placeholder="Phone">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id="cu_password" name="cu_password" placeholder="Password">
                                        </div>

                                        <input type="hidden" id="origin" name="origin" value="createuser" />
                                </div>

                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-success">Create user</button>
                                </div>

                                </form>

                            </div>
                        </div>
                    </div> <!-- /Create user modal -->
                </div> <!-- /divboks -->
            </div> <!-- /col-md-6  -->
        </div> <!-- /row first -->


    </div> <!-- /container -->

    <% out.print( Main_Control.viewControl.getFooter() );%>
    <script src="http://localhost:8080/DellProject-v2/bootstrap/js/validator.min.js"></script>
</body>
</html>

