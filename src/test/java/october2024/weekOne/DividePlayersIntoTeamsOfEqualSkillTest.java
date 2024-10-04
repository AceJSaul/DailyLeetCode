package october2024.weekOne;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividePlayersIntoTeamsOfEqualSkillTest {

    @Test
    @DisplayName("(SORT) skill = [3,2,5,1,3,4]")
    void testSortOne(){
        DividePlayersIntoTeamsOfEqualSkill skill = new DividePlayersIntoTeamsOfEqualSkill();
        assertEquals(22, skill.dividePlayers(new int[] {3,2,5,1,3,4}));
    }

    @Test
    @DisplayName("(SORT) skill = [3,4]")
    void testSortTwo(){
        DividePlayersIntoTeamsOfEqualSkill skill = new DividePlayersIntoTeamsOfEqualSkill();
        assertEquals(12, skill.dividePlayers(new int[]{3,4}));
    }

    @Test
    @DisplayName("(SORT) skill = [1,1,2,3]")
    void testSortThree(){
        DividePlayersIntoTeamsOfEqualSkill skill = new DividePlayersIntoTeamsOfEqualSkill();
        assertEquals(-1, skill.dividePlayers(new int[] {1,1,2,3}));
    }

    @Test
    @DisplayName("(MAP) skill = [3,2,5,1,3,4]")
    void testMapOne(){
        DividePlayersIntoTeamsOfEqualSkill skill = new DividePlayersIntoTeamsOfEqualSkill();
        assertEquals(22, skill.dividePlayersMap(new int[] {3,2,5,1,3,4}));
    }

    @Test
    @DisplayName("(MAP) skill = [3,4]")
    void testMapTwo(){
        DividePlayersIntoTeamsOfEqualSkill skill = new DividePlayersIntoTeamsOfEqualSkill();
        assertEquals(12, skill.dividePlayersMap(new int[]{3,4}));
    }

    @Test
    @DisplayName("(MAP) skill = [1,1,2,3]")
    void testMapThree(){
        DividePlayersIntoTeamsOfEqualSkill skill = new DividePlayersIntoTeamsOfEqualSkill();
        assertEquals(-1, skill.dividePlayersMap(new int[] {1,1,2,3}));
    }

    @Test
    @DisplayName("(MAP) skill = [5,1,3,6]")
    void testMapFour(){
        DividePlayersIntoTeamsOfEqualSkill skill = new DividePlayersIntoTeamsOfEqualSkill();
        assertEquals(-1, skill.dividePlayersMap(new int[]{5,1,3,6}));
    }
}