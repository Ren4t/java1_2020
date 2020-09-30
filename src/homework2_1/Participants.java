package homework2_1;

public interface Participants {
    void run();
    void jump();
    double getRunningDistance();
    double getJumpHeight();
    boolean isOut();
    void setOut(boolean out);
    String toString();
}
