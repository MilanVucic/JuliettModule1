package lesson_19;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();
    }

    private static void monthsExample() {
        Month month = Month.AUGUST;
        System.out.println(month.getShortName());
        System.out.println(month.getSerbianName());
        System.out.println(month);

        MessageStatus status = MessageStatus.READ;

        switch (status) {
            case READ :
            case DELIVERED:
        }
    }

    private static void switchExample2() {
        // 0 1 2 3
        MessageStatus status = MessageStatus.values()[2];

        //
        String message = switch (status) {
            case NOT_SENT -> "Not sent...";
            case SENT -> "Sent...";
            case DELIVERED -> "Delivered...";
            case READ -> "Read...";
        };
    }

    private static void switchExample() {
        int status = 55;
        switch (status) {
            case 0:
                System.out.println("I am zero.");
                break;
            case 1:
                System.out.println("I am one.");
                System.out.println("I am one.");
                System.out.println("I am one.");
                System.out.println("I am one.");
                break;
            case 2:
                System.out.println("I am two.");
                break;
            case 3:
                System.out.println("I am three.");
                break;
            default:
                System.out.println("Invalid status...");
        }
    }

    private static void introToEnums() {
        MessageStatus[] allStatuses = MessageStatus.values();
        System.out.println(allStatuses[2]);
        for (MessageStatus ms : allStatuses) {
            ms.printMe();
        }
        MessageStatus messageStatus = MessageStatus.READ;

        System.out.println(messageStatus.ordinal());
        System.out.println(MessageStatus.DELIVERED.ordinal());

        MessageStatus newMS = MessageStatus.valueOf("READ");
        System.out.println(newMS);
    }
}
