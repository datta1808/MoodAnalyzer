import com.bridgelabz.MoodAnalysisException;
import com.bridgelabz.MoodAnalyzerMain;
import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyzerTest {
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Sad Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertSame(MoodAnalysisException.Exception_Type.NULL, e.type);
        }
    }

    @Test
    public void given_EmptyMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertSame(MoodAnalysisException.Exception_Type.EMPTY, e.type);
        }
    }
}