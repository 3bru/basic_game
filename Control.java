package com.company;

import java.util.Scanner;

public class Control {

  Scanner keyboard = new Scanner(System.in);
  int logicPlayer1 = 0;
  int logicPlayer2 = 0;

  Game player1Model;
  Game player2Model;

  String player1 = "Player1";
  String player2 = "Player2";

  public Control() {

  }

  public void player1Control() {
    System.out.println("1-3 arasında değer giriniz");
    int getValue = keyboard.nextInt();
    if (getValue >= 1 && getValue <= 3) {
      player1Model = new Game(getValue, player1);
    } else {
      System.out.println("aralığın dısında bir değer girdiniz");
      player1Control();
    }
  }


  public void player2Control() {
    System.out.println("1-3 arasında değer giriniz");
    int getValue2 = keyboard.nextInt();
    if (getValue2 >= 1 && getValue2 <= 3) {
      player2Model = new Game();
      player2Model.setPlayer(player2);
      player2Model.setValue(getValue2);
    } else {
      System.out.println("aralığın dısında bir değer girdiniz");
      player2Control();
    }


  }

  public void compera() {

    if (player1Model.getValue() == player1Model.getValue()) {
      System.out.println("bu oyunun kazananı yok");
    } else {
      switch (player1Model.getValue()) {
        // 1 tas, 2 makas, 3 kagıt

        case 1:
          if (player2Model.getValue() == 2) {
            System.out.println("player1 kazandı");
          } else {
            System.out.println("player2 kazandı");
          }
          break;

        case 2:
          if (player2Model.getValue() == 1) {
            System.out.println("player2 kazandı");
          } else {
            System.out.println("player1 kazandı");
          }
          break;

        case 3:
          if (player2Model.getValue() == 1) {
            System.out.println("player1 kaazandı");
          } else {
            System.out.println("cont..");
          }
          break;

      }
    }
  }
  public void start(){

    player1Control();
    player2Control();
    compera();

  }
}
