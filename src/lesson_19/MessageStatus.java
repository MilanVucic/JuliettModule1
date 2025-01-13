package lesson_19;

public enum MessageStatus {
    NOT_SENT,
    SENT,
    DELIVERED,
    READ;

    public void printMe() {
        System.out.println(this.toString());
    }
}
