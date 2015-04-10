/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Ismail Cam
 */
public interface ViewInterface
{
    
    void createForm();
    
    void createMenu();
    
    void createContent();
    
    void createHeader();
    
    void show();
    
    void hide();
    
    String printMessage(String type, String message);
    
    String getHead(String title);
    
    String getFooter();
    
    String getNav();
}
