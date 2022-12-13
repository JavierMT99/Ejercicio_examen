package org.iesch.ad.ej1;


import java.util.Random;
import java.util.Scanner;


public class Game {
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {
        printGameRules();

        ScoreBoard scoreBoard = new ScoreBoard();
        String choice = input.nextLine().toUpperCase();

        while (!choice.equals("SALIR"))
        {
            GameOption choicenum = getChoiceNum(choice);
            while(choicenum == null)
            {
                System.out.println("Lo siento, Parece que has escrito una opción incorrecta, prueba otra vez.");
                System.out.print("> ");
                choice = input.nextLine().toUpperCase();
                choicenum = getChoiceNum(choice);
            }

            GameOption compnum = getComputerChoice();
            completeGamePlay(scoreBoard, choicenum, compnum);
            printResults(scoreBoard);

            choice = input.nextLine().toUpperCase();
        }
    }

    private void printResults(ScoreBoard scoreBoard) {
        System.out.println("Has ganado: " + scoreBoard.getWins() + "\nHas perdido: " + scoreBoard.getLosses() + "\nEmpates: " + scoreBoard.getTie()); //muestra el numero de veces que has ganado, empatado o perdido
        System.out.println("Jugamos de nuevo! \n \n"); //Comenzamos a jugar
        System.out.println("Escribe \"Piedra\", \"Papel\", o \"Tijera\" indicando tu jugada. De lo contrario escribe \"Salir\" para acabar.");
        System.out.print("> ");
    }

    private void completeGamePlay(ScoreBoard scoreBoard, GameOption choicenum, GameOption compnum) {
        if(choicenum == compnum) {
            tie(scoreBoard);
        }
        else if (choicenum == GameOption.PIEDRA && compnum == GameOption.TIJERA
                || choicenum == GameOption.TIJERA && compnum == GameOption.PAPEL
                || (choicenum == GameOption.PAPEL && compnum == GameOption.PIEDRA)) {
            wins(scoreBoard);
        }
        lose(scoreBoard);
    }

    private void lose(ScoreBoard scoreBoard) {
        System.out.println("Tu pierdes.");
        scoreBoard.incrementLosses();
    }

    private void tie(ScoreBoard scoreBoard) {
        System.out.println("Es un empate");
        scoreBoard.incrementTie();
    }

    private void wins(ScoreBoard scoreBoard) {
        System.out.println("Tu ganas!");
        scoreBoard.incrementWins();
    }

    private GameOption getChoiceNum(String choice) {
        GameOption selectedOption = null;

        if (choice.equals("SALIR"))
            System.exit(0);

        try {
            selectedOption = GameOption.valueOf(choice);
        } catch (Exception e) {
            return null;
        }
        return selectedOption;
    }

    private GameOption getComputerChoice() {
        GameOption option = GameOption.values()[random.nextInt(3)];
        System.out.println("La maquina eligió " + option.toString().toLowerCase());
        return option;
    }

    private void printGameRules() {
        System.out.println("Jugamos a Piedra, Papel, tijera!");
        System.out.println("Say \"Piedra\", \"Papel\", o \"Tijera\" indicando tu jugada. De lo contrario escribe \"Salir\" para acabar.");
        System.out.print("> ");
    }
}

