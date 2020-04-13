package bowling.domain;

public class Frame {
    private Scores scores;

    public Scores getScores() {
        return scores;
    }

    public String getSigns() {
        return getScores().getSigns();
    }

    public int getSignsSize() {
        return getScores().size();
    }

    public Frame() {
        this.scores = new Scores();
    }

    public boolean isNextFrame() {
        return this.scores.nextFrame();
    }

    public void add(Score score) {
        this.scores.add(score);
    }

    public void addNormalFrame(int numberOfPin) {
        this.scores.checkBeforeAddNormal(numberOfPin);
        this.scores.add(new Score(numberOfPin));
    }

    public void addFinalFrame(int numberOfPin) {
        this.scores.checkBeforeAddFinal(numberOfPin);
        this.scores.add(new Score(numberOfPin));
    }

    @Override
    public String toString() {
        return scores.toString();
    }
}
