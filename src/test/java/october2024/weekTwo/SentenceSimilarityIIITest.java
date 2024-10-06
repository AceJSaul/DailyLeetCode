package october2024.weekTwo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceSimilarityIIITest {

    @Test
    @DisplayName("s1: \"My name is Haley\", s2: \"My Haley\"")
    void testOne(){
        SentenceSimilarityIII similarity = new SentenceSimilarityIII();
        assertTrue(similarity.areSentencesSimilar("My name is Haley", "My Haley"));
    }

    @Test
    @DisplayName("s1: Eating right now, s2: Eating")
    void testTwo(){
        SentenceSimilarityIII similarity = new SentenceSimilarityIII();
        assertTrue(similarity.areSentencesSimilar("Eating right now", "Eating"));
    }

    @Test
    @DisplayName("s1: \"of\", s2: \"A lot of words\"")
    void testThree(){
        SentenceSimilarityIII similarity = new SentenceSimilarityIII();
        assertFalse(similarity.areSentencesSimilar("of", "A lot of words"));
    }

    @Test
    @DisplayName("s1: \"Hello Jane\", s2: \"Hello my name is Jane\"")
    void testFour(){
        SentenceSimilarityIII similarity = new SentenceSimilarityIII();
        assertTrue(similarity.areSentencesSimilar("Hello Jane", "Hello my name is Jane"));
    }

    @Test
    @DisplayName("s1 = \"Frog cool\", s2 = \"Frogs are cool\"")
    void testFive(){
        SentenceSimilarityIII similarity = new SentenceSimilarityIII();
        assertFalse(similarity.areSentencesSimilar("Frog cool", "Frogs are cool"));
    }
}