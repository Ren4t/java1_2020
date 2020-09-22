package homework2_2;

public class MainClass {
    public static void main(String[] args) {
        try {
            fourByFourArray(new String[][]{  {"1", "2", "JAVA", "4"},
                                             {"5", "6", "7", "8"},
                                             {"9", "10", "11", "12"},
                                             {"13", "14", "15", "16"}});
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.getMessage();
            e.printStackTrace();
        }

        try {
            fourByFourArray(new String[][]{ {"1", "2", "4"},
                                            {"5", "6", "7", "8"},
                                            {"9", "10", "11", "12"},
                                            {"13", "14", "15", "16"}});
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    public static void fourByFourArray(String[][] strings) throws MyArraySizeException,MyArrayDataException {
        if (!(strings.length == 4)) {
            throw new MyArraySizeException();
        } else {
            for (String[] string : strings) {
                if (!(string.length == 4)) {
                    throw new MyArraySizeException();
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {

                try {
                    int x = Integer.parseInt(strings[i][j]);
                    sum += x;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        System.out.println(sum);
    }
}
