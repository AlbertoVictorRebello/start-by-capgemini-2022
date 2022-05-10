/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author albertovictorrebello
 */
public class ScaleImage {
    public final static void scaleImage(JLabel label, String imgPath) {
        ImageIcon icon = new ImageIcon(imgPath);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance(label.getHeight() - 5, label.getHeight() - 5,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScaled);
        label.setIcon(scaledIcon);
    }
    
    public final static void scaleImage(JLabel label, String imgPath, int width, int heigth) {
        ImageIcon icon = new ImageIcon(imgPath);
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance(width, heigth,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScaled);
        label.setIcon(scaledIcon);
    }
}
