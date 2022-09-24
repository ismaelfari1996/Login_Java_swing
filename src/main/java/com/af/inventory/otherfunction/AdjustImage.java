/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.af.inventory.otherfunction;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ismael
 */
public class AdjustImage {
    public  void adjustSize(JLabel label, String path){
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(path));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(label.getWidth(),
                label.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        label.setIcon(iconoEscalado);
    }
}
