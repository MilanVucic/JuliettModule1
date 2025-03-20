package module_1.lesson_23;

public class HighScorer implements Comparable<HighScorer> {
    private String name;
    private int points;

    public HighScorer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return name + " - " + points;
    }

    @Override
    public int compareTo(HighScorer other) {
        return other.getPoints() - this.getPoints();
    }
}
