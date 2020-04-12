package bowling.domain;

public class NormalFrame {
    private Scores scores;

    public NormalFrame() {
        this.scores = new Scores();
    }

    public boolean isNextFrame() {
        return this.scores.nextFrame();
    }

    public void add(Score score) {
        this.scores.add(score);
    }

    public void add(int numberOfPin) {
        this.scores.checkBeforeAddNormal(numberOfPin);
        this.scores.add(new Score(numberOfPin));
    }

    @Override
    public String toString() {
        return "NormalFrame{" +
                "scores=" + scores +
                '}';
    }
}
