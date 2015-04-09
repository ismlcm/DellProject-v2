/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interface.ViewInterface;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ismail Cam
 */
@WebServlet( name = "FormControl", urlPatterns =
     {
         "/FormControl"
} )
public class FormControl extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException
    {
        response.setContentType( "text/html;charset=UTF-8" );
        try (PrintWriter out = response.getWriter())
        {
            
            ViewInterface view = new ViewControl();
            String origin = request.getParameter( "origin" );
            switch ( origin )
            {
                case "loginform":

                    String id = request.getParameter( "loginid" );
                    String name = request.getParameter( "loginpassword" );
                    //boolean succes = auth.addUser( id, name, pwd, gender );
                    if ( !id.equals( "faruk" ) && !name.equals( "1234" ) )
                    {
                        request.getSession().setAttribute( "message", view.printMessage( "danger", "Something went wrong. You are not registered") );
                    }
                    else
                    {
                        request.getSession().setAttribute( "message", view.printMessage( "success", "You have logged in succesfully"));
                    }
                    response.sendRedirect( "feedback.jsp" );
                    return;
//                case "createaccountform":
//                    id = request.getParameter( "id" );
//                    pwd = request.getParameter( "pwd" );
//                    if ( auth.authCheck( id, pwd ) )
//                    {
//                        request.getSession().setAttribute( "message", "You are now logged in" );
//                    }
//                    else
//                    {
//                        request.getSession().setAttribute( "message", "No luck - you will never get in here!" );
//                    }
//                    response.sendRedirect( "feedback.jsp" );
//                    return;
//                case "resetpasswordform": //using the request object to forward the list of users
//                    //request.getSession().setAttribute("list", auth.getAllUsers());
//                    RequestDispatcher dispatcher = request.getRequestDispatcher( "showusers.jsp" );
//                    request.setAttribute( "users", auth.getAllUsers() );
//                    dispatcher.forward( request, response );
//                    return;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException
    {
        processRequest( request, response );
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException
    {
        processRequest( request, response );
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
