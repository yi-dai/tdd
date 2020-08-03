import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MommifierTest {
    @Test
    void should_return_itself_when_vowels_less_30(){
        //given
        String string_with_less_30_vowels = "";
        //when
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert(string_with_less_30_vowels);
        //then
        assertEquals(string_with_less_30_vowels,result);
    }

    @Test
    void should_return_itself_when_vowels_is_not_continuous(){
        //given
        String string_with_not_continuous_vowels = "aibce";
        //when
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert(string_with_not_continuous_vowels);
        //then
        assertEquals(result,string_with_not_continuous_vowels.toString());
    }
    
}
