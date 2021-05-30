import com.bridgelabz.MoodAnalysisException;
import com.bridgelabz.MoodAnalyzerMain;
import org.junit.Test;


import org.junit.Assert;

public class MoodAnalyzerTest {
    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertSame(MoodAnalysisException.Exception_Type.NULL, e.type);
        }
    }
}