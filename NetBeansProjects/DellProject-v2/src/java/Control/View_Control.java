/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Interface.View_Interface;

/**
 * 
 * @author Ismail Cam
 */
public class View_Control implements View_Interface{
    
    @Override
    public void createForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createContent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createHeader() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String printMessage(String type, String message)
    {
        String m = "<div class='alert alert-" + type + " alert-dismissible' role='alert' id='success-alert'>"
                                + "<button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button>"
                                + message
                                + "</div>";
        
        return m;
    }
    
    @Override
    public String getHead(String title)
    {
        String head = 
                "<title>" + title + "</title>" + "\n" +
                "<meta charset='UTF-8'>" + "\n" +
                "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" + "\n\n" +

                "<!-- BOOTSRAP -->" + "\n" +
                "<!-- Latest compiled and minified CSS -->" + "\n" +
                "<link rel='stylesheet' href='http://localhost:8080/DellProject-v2/bootstrap/css/bootstrap.min.css'>" + "\n\n" +

                "<!-- Optional theme -->" + "\n" +
                "<link rel='stylesheet' href='http://localhost:8080/DellProject-v2/bootstrap/css/bootstrap-theme.min.css'>" + "\n\n" +
                        
                "<!-- Custom styles for this template -->" + "\n" +
                "<link href='http://localhost:8080/DellProject-v2/bootstrap/css/sticky-footer.css' rel='stylesheet'>" + "\n" +                
                "<!-- /BOOTSRAP -->";
        
        return head;
    }
    
    @Override
    public String getFooter()
    {
        String footer = 
                "<footer class='footer'>" + "\n" +
                "<div class='container'>" + "\n" + 
                "<p style='font-size: 10px;'>&copy; 2015 Dell</p>" + "\n" +
                "</div>" + "\n" +
                "</footer>" + "\n\n" +
        
                "<!-- BOOTSRAP -->" + "\n" +
                "<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->" + "\n" +
                "<script src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js'></script>" + "\n" +
                "<!-- Include all compiled plugins (below), or include individual files as needed -->" + "\n" +
                "<script src='http://localhost:8080/DellProject-v2/bootstrap/js/bootstrap.min.js'></script>" + "\n" +
                "<!-- /BOOTSRAP -->";
        
        return footer; 
    }
    
    public String getNav()
    {
        String nav = 
                "<nav class='navbar' style='background: #1486C1; border-radius: 0px; padding: 10px;'>" + "\n" +
                "<div class='container'>" + "\n" +
                "<div class='navbar-header'>" + "\n" +
                "<a href='http://localhost:8080/DellProject-v2/'><img src='http://localhost:8080/DellProject-v2/img/logo_white.png' width='40'></a>" + "\n" +
                "</div>" + "\n" +
                "</div>" + "\n" +
                "</nav>";
        
        return nav;
    }

}
