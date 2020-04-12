package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Frames {
    private static final int NORMAL_FRAME_END = 9;
    private List<NormalFrame> normalFrames;
    private FinalFrame finalFrame = new FinalFrame();

    public Frames() {
        this.normalFrames = new ArrayList<>();
    }

    public int currentFrame() {
        return normalFrames.size();
    }

    public void addNormalFrame(NormalFrame normalFrame) {
        normalFrames.add(normalFrame);
    }

    public boolean isNextFrame() {
        return normalFrames.get(currentFrame()-1).isNextFrame();
    }

    public boolean isEndNormalFrame() {
        return currentFrame() == NORMAL_FRAME_END;
    }

    public boolean isEndFinalFrame() {
        return finalFrame.isEnd();
    }

    @Override
    public String toString() {
        return "Frames{" +
                "normalFrames=" + normalFrames +
                ", finalFrame=" + finalFrame +
                '}';
    }

    public void addFinalFrame(FinalFrame finalFrame) {
        this.finalFrame = finalFrame;
    }
}

