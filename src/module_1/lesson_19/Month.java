package module_1.lesson_19;

public enum Month {
    JANUARY("januar"),
    FEBRUARY("februar"),
    MARCH("mart"),
    APRIL("april"),
    MAY("maj"),
    JUNE("jun"),
    JULY("jul"),
    AUGUST("avgust"),
    SEPTEMBER("septembar"),
    OCTOBER("oktobar"),
    NOVEMBER("novembar"),
    DECEMBER("decembar");

    private String serbianName;

    Month(String serbianName) {
        this.serbianName = serbianName;
    }

    public int getNumOfDays(int year) {
        switch (this) {
            case JANUARY: case MARCH: case MAY:
            case JULY: case AUGUST: case OCTOBER: case DECEMBER: return 31;
            case FEBRUARY: return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
            case JUNE: case APRIL:
            case SEPTEMBER: case NOVEMBER: return 30;
            default: return 0;
        }
    }

    public String getSerbianName() {
        return serbianName;
    }

    public String getShortName() {
        return serbianName.substring(0, 3).toLowerCase();
    }

    @Override
    public String toString() {
        return super.toString() + " " + getSerbianName() + " " + getShortName();
    }
}
