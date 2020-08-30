package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static char[][] map;
    private static final int SIZE = 5;
    // private static final int DOTS_TO_WIN = 3;

    private static final char DOT_EMPTY = '*';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {
        System.out.println("Начало игры!");
        prepareGame();
        playGame();
        System.out.println("Игра закончена!");
    }

    private static void playGame() {
        do {
            try {
                humanTurn();
            } catch (Exception e) {
                humanTurn();
            }
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил ИИ");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

        } while (true);

    }

    private static void prepareGame() {
        initMap();
        printMap();
    }

    private static boolean isMapFull() {
        for (char[] row : map) {
            for (char cell : row) {
                if (cell == DOT_EMPTY) {
                    return false;
                }
            }

        }
        return true;
    }

    private static boolean checkWin(char symbol) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
//                if (map[i][j] == symbol) {
//                    if ((i + 1 < SIZE && map[i + 1][j] == symbol) ||
//                            (i + 1 < SIZE && j + 1 < SIZE && map[i + 1][j + 1] == symbol) ||
//                            // (i + 2 < SIZE && j + 2 < SIZE && map[i + 2][j + 2] == symbol) ||
//                            (j + 1 < SIZE && map[i][j + 1] == symbol)) {
//                        if ((i + 2 < SIZE && map[i + 2][j] == symbol) ||
//                                (i + 2 < SIZE && j + 2 < SIZE && map[i + 2][j + 2] == symbol) ||
//                                (j + 2 < SIZE && map[i][j + 2] == symbol)) {
//                            //return true;
//                            if (((i + 3 < SIZE && map[i + 3][j] == symbol) ||
//                                    (i + 3 < SIZE && j + 3 < SIZE && map[i + 3][j + 3] == symbol) ||
//                                    (j + 3 < SIZE && map[i][j + 3] == symbol)))
//                                return true;
//                        }
//                    }
//                }
                if (j + 3 < SIZE && map[i][j] == symbol && map[i][j + 1] == symbol && map[i][j + 2] == symbol && map[i][j + 3] == symbol) {
                    return true;
                }
                if (i + 3 < SIZE && map[i][j] == symbol && map[i + 1][j] == symbol && map[i + 2][j] == symbol && map[i + 3][j] == symbol) {
                    return true;
                }
                if (i + 3 < SIZE && j + 3 < SIZE && map[i][j] == symbol && map[i + 1][j + 1] == symbol && map[i + 2][j + 2] == symbol && map[i + 3][j + 3] == symbol) {
                    return true;
                }
                if (i + 3 < SIZE && j - 3 >= 0 && map[i][j] == symbol && map[i + 1][j - 1] == symbol && map[i + 2][j - 2] == symbol && map[i + 3][j - 3] == symbol) {
                    return true;
                }
            }

        }
        return false;
    }

    private static void aiTurn() {
//        int rowIndex, colIndex;
//        do {
//            rowIndex = random.nextInt(SIZE);
//            colIndex = random.nextInt(SIZE);
//
//        } while (isCellValid(rowIndex, colIndex));
//
//        map[rowIndex][colIndex] = DOT_O;
        boolean flag = false;

        do {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {

                    if (j + 3 < SIZE && map[i][j] == DOT_O && map[i][j + 1] == DOT_O && map[i][j + 2] == DOT_O) {

                        if (map[i][j + 3] == DOT_EMPTY) {
                            map[i][j + 3] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (j - 1 > 0 && map[i][j - 1] == DOT_EMPTY) {
                                map[i][j - 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 3 < SIZE && map[i][j] == DOT_O && map[i + 1][j] == DOT_O && map[i + 2][j] == DOT_O) {
                        if (map[i + 3][j] == DOT_EMPTY) {
                            map[i + 3][j] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && map[i - 1][j] == DOT_EMPTY) {
                                map[i - 1][j] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 3 < SIZE && j + 3 < SIZE && map[i][j] == DOT_O && map[i + 1][j + 1] == DOT_O && map[i + 2][j + 2] == DOT_O) {
                        if (map[i + 3][j + 3] == DOT_EMPTY) {
                            map[i + 3][j + 3] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && j - 1 > 0 && map[i - 1][j - 1] == DOT_EMPTY) {
                                map[i - 1][j - 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 3 < SIZE && j - 3 >= 0 && map[i][j] == DOT_O && map[i + 1][j - 1] == DOT_O && map[i + 2][j - 2] == DOT_O) {
                        if (map[i + 3][j - 3] == DOT_EMPTY) {
                            map[i + 3][j - 3] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && j + 1 < SIZE && map[i - 1][j + 1] == DOT_EMPTY) {
                                map[i - 1][j + 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }

                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {

                    //-----------------------------------------------------------
                    if (j + 3 < SIZE && map[i][j] == DOT_X && map[i][j + 1] == DOT_X && map[i][j + 2] == DOT_X) {

                        if (map[i][j + 3] == DOT_EMPTY) {
                            map[i][j + 3] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (j - 1 > 0 && map[i][j - 1] == DOT_EMPTY) {
                                map[i][j - 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 3 < SIZE && map[i][j] == DOT_X && map[i + 1][j] == DOT_X && map[i + 2][j] == DOT_X) {
                        if (map[i + 3][j] == DOT_EMPTY) {
                            map[i + 3][j] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && map[i - 1][j] == DOT_EMPTY) {
                                map[i - 1][j] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 3 < SIZE && j + 3 < SIZE && map[i][j] == DOT_X && map[i + 1][j + 1] == DOT_X && map[i + 2][j + 2] == DOT_X) {
                        if (map[i + 3][j + 3] == DOT_EMPTY) {
                            map[i + 3][j + 3] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && j - 1 > 0 && map[i - 1][j - 1] == DOT_EMPTY) {
                                map[i - 1][j - 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 3 < SIZE && j - 3 >= 0 && map[i][j] == DOT_X && map[i + 1][j - 1] == DOT_X && map[i + 2][j - 2] == DOT_X) {
                        if (map[i + 3][j - 3] == DOT_EMPTY) {
                            map[i + 3][j - 3] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && j + 1 < SIZE && map[i - 1][j + 1] == DOT_EMPTY) {
                                map[i - 1][j + 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {

                    //-------------------------------------------------------------------------------------
                    if (j + 2 < SIZE && map[i][j] == DOT_X && map[i][j + 1] == DOT_X) {

                        if (map[i][j + 2] == DOT_EMPTY) {
                            map[i][j + 2] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (j - 1 > 0 && map[i][j - 1] == DOT_EMPTY) {
                                map[i][j - 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 2 < SIZE && map[i][j] == DOT_X && map[i + 1][j] == DOT_X) {
                        if (map[i + 2][j] == DOT_EMPTY) {
                            map[i + 2][j] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && map[i - 1][j] == DOT_EMPTY) {
                                map[i - 1][j] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 2 < SIZE && j + 2 < SIZE && map[i][j] == DOT_X && map[i + 1][j + 1] == DOT_X) {
                        if (map[i + 2][j + 2] == DOT_EMPTY) {
                            map[i + 2][j + 2] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && j - 1 > 0 && map[i - 1][j - 1] == DOT_EMPTY) {
                                map[i - 1][j - 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (i + 2 < SIZE && j - 2 >= 0 && map[i][j] == DOT_X && map[i + 1][j - 1] == DOT_X) {
                        if (map[i + 2][j - 2] == DOT_EMPTY) {
                            map[i + 2][j - 2] = DOT_O;
                            flag = true;
                            break;
                        } else {
                            if (i - 1 > 0 && j + 1 < SIZE && map[i - 1][j + 1] == DOT_EMPTY) {
                                map[i - 1][j + 1] = DOT_O;
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            }
            if (flag) {
                break;
            }


            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {


                    //-----------------------------------------------------------------------------------
                    if (map[i][j] == DOT_X) {
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                int x = i - 1 + k;
                                int y = j - 1 + l;
                                if (x >= 0 && y >= 0 && x < SIZE && y < SIZE && map[x][y] == DOT_EMPTY) {
                                    map[x][y] = DOT_O;
                                    flag = true;
                                    break;
                                }
                            }
                            if (flag) {
                                break;
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        } while (true);
    }

    private static void humanTurn() {
        int rowIndex = -1, colIndex = -1;
        do {
            System.out.println("Введите координаты в формате <номер строки> <номер колонки>");
            String[] stringData = scanner.nextLine().split(" ");
            if (stringData.length != 2) {
                continue;
            }
            try {
                rowIndex = Integer.parseInt(stringData[0]) - 1;
                colIndex = Integer.parseInt(stringData[1]) - 1;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                System.out.println("Введены некорректные данные");
                continue;
            }

        } while (isCellValid(rowIndex, colIndex));

        map[rowIndex][colIndex] = DOT_X;
    }

    private static boolean isCellValid(int rowIndex, int colIndex) {
        if (rowIndex < 0 || rowIndex >= SIZE || colIndex < 0 || colIndex >= SIZE) {
            return false;
        }
        if (map[rowIndex][colIndex] == DOT_O && map[rowIndex][colIndex] == DOT_X) {
            return false;
        }
        return map[rowIndex][colIndex] != DOT_EMPTY;
    }

    private static void printMap() {
        printColumnNumbers();
        printRows();
        System.out.println();
    }

    private static void printRows() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printColumnNumbers() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (char[] row : map) {
            Arrays.fill(row, DOT_EMPTY);
        }
    }

    void f() {


    }
}


