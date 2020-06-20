/*
 * Ecan Robertson
 * June 19th 2020
 * loadWebPage.java
 * This class aims to load the web page after taking input from the server
 */
package wikiwindows;

/**
 *
 * @author Evan-
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
public class loadWebPage extends JFrame {

public loadWebPage(String input)
{
//Set default size
setSize(620,440);
//New scroll window
JScrollPane sp=new JScrollPane();
//Make panel for website
JEditorPane editorPane = new JEditorPane();
//Button for searching
JButton button = new JButton("Search");
//Add action listener for button
button.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
        //Open new window with search
        String input = JOptionPane.showInputDialog("Enter something to research");
        input.toLowerCase();
        new loadWebPage(input).setVisible(true);
        //Remove old window
        setVisible(false);
    }  
});  
//Button size
button.setBounds(0,0,95,30);
//Add to panel
add(button);
editorPane.setEditable(false);
sp.setViewportView(editorPane);
//Add to panel
add(sp);
//Make it always appear above all programs
setAlwaysOnTop(true);
//Try for link
try {
    editorPane.setPage(new URL("https://terraria.gamepedia.com/" + input));
    } catch (Exception ex) {ex.printStackTrace();}
}
}
