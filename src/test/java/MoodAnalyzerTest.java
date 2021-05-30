import com.bridgelabz.MoodAnalyzerMain;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyzerTest {
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertSame("SAD", mood);
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }
}
