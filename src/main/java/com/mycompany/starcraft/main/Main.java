package com.mycompany.starcraft.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mycompany.starcraft.game.player.Player;
import com.mycompany.starcraft.instantiator.Instantiate;

/**
 *
 * @author btume
 */
public class Main {

  private static List<Player> players;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Number of players?");
    startGame(scan.nextInt());
    scan.close();

  }

  private static void startGame(int numberOfPlayers) {
    Main.players = new ArrayList<>();
    for (byte i = 0; i < numberOfPlayers; i++) {
      players.add(Instantiate.player());
    }
  }

}
