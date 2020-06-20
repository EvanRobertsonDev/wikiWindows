/*
 * Evan Robertson
 * June 19th 2020
 * WikiWindows.java
 * This program overlays a wiki on top of a game (Terraria), and allows you to
 * search the wiki without having to tab out of game
 */
package wikiwindows;

import javax.swing.JOptionPane;

/**
 *
 * @author Evan
 */
public class WikiWindows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get input
        String input = JOptionPane.showInputDialog("Enter something to research");
        //replace all spaces with underscores
        input = input.replaceAll(" ","_");
        //make all lower case to put into link
        input = input.toLowerCase();
        //Call method to capitalize the first letter
        System.out.println(input);
        //Call the loadWebPage class with the input from the user
        new loadWebPage(input).setVisible(true);
    }
  
    
}
