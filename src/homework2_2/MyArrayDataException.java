package homework2_2;

public class MyArrayDataException extends Exception {
    private int i,j;
    public MyArrayDataException(int i,int j){
        this.i = i;
        this.j = j;
    }
    @Override
    public String getMessage() {
        return "в ячейке [" + i + "][" + j + "] лежит не числовое значение";
    }
}
