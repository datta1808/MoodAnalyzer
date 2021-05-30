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
}