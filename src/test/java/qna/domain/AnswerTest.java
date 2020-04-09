package qna.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qna.CannotDeleteException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AnswerTest {
    public static final Answer A1 = new Answer(UserTest.JAVAJIGI, QuestionTest.Q1, "Answers Contents1");
    public static final Answer A2 = new Answer(UserTest.SANJIGI, QuestionTest.Q1, "Answers Contents2");

    @Test
    @DisplayName("답변작성사람이 다를경우 테스트")
    public void name() {
        assertThatThrownBy(() -> {
            Answers answers = new Answers(QuestionTest.Q1);
            answers.add(A1);
            answers.checkUser(UserTest.SANJIGI);
        }).isInstanceOf(CannotDeleteException.class);
    }
}
