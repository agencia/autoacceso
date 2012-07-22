/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class imagen extends Panel {
  BufferedImage  image;
  public imagen() {
  try {
  System.out.println("Enter image name\n");
  BufferedReader bf=new BufferedReader(new 
InputStreamReader(System.in));
 String imageName=bf.readLine();
  File input = new File(imageName);
  image = ImageIO.read(input);
  } catch (IOException ie) {
  System.out.println("Error:"+ie.getMessage());
  }
  }

  public void paint(Graphics g) {
  g.drawImage( image, 0, 0, null);
  }

  static public void main(String args[]) throws
Exception {
  JFrame frame = new JFrame("Display image");
  Panel panel = new imagen();
  frame.getContentPane().add(panel);
  frame.setSize(500, 500);
  frame.setVisible(true);
  }
}
