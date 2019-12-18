package com.mycompany.starcraft.app;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;

/**
 * @author darolt
 */
public class ShootingMissilesEx extends JFrame {

  public ShootingMissilesEx() {
    initUI();
  }

  private void initUI() {
    add(new Board());

    setSize(1000, 800);
    setResizable(false);

    setTitle("Shooting missiles");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      ShootingMissilesEx ex = new ShootingMissilesEx();
      ex.setVisible(true);
    });
  }
}