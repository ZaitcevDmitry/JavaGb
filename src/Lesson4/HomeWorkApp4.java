package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);

            humanTurn(field);
            printField(field);

            aiTurn(field);
            printField(field);
        }

        public static String[][] initField (int size){
            String[][] field = new String[size][size];
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    field[i][j] = "*";
                }
            }
            return field;
        }

        public static void printField(String[][] field) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }

        public static void humanTurn (String[][]field){
            Scanner scanner = new Scanner(System.in);
            while (true) {
                int x = scanner.nextInt() - 1;
                int y = scanner.nextInt() - 1;
                int size = field.length;
                if (x < size && y < size && x >= 0 && y >= 0) {
                    if (field[x][y].equals("*")) {
                        field[x][y] = "X";
                        break;
                    } else {
                        System.out.println("Shodili ne tuda");
                    }
                } else {
                    System.out.println("Vi tiknule ne igrovoe pole");
                }

            }
        }

        public static void aiTurn (String[][]field){
            Scanner scanner = new Scanner(System.in);
            while (true) {
                Random random = new Random();
                int x = random.nextInt(field.length);
                int y = random.nextInt(field.length);
                int size = field.length;

                if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                }
                break;
            }
        }

    }

