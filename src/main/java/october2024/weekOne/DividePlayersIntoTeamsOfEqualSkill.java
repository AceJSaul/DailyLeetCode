package october2024.weekOne;

import java.util.Arrays;
import java.util.HashMap;

public class DividePlayersIntoTeamsOfEqualSkill {

    public long dividePlayers(int[] skill){

        int leftPointer = 0;
        int rightPointer = skill.length-1;
        Arrays.sort(skill);

        long chemistry = 0;
        int teamSkill = skill[leftPointer] + skill[rightPointer];
        for (int i=0; i<skill.length/2; i++){
            if (skill[leftPointer] + skill[rightPointer] != teamSkill){
                return -1;
            }
            chemistry += (long) skill[leftPointer] * skill[rightPointer];
            leftPointer++;
            rightPointer--;
        }
        return chemistry;
    }

    public long dividePlayersMap(int[] skill){
        HashMap<Integer, Integer> frequencyOfNum = new HashMap<>();

        int sum = 0;
        for (int i=0; i< skill.length; i++){
            sum+=skill[i];
            frequencyOfNum.put(skill[i], frequencyOfNum.getOrDefault(skill[i], 0)+1);
        }

        int requiredSum = sum / (skill.length/2);
        long chemistry = 0;
        for (int i=0; i<skill.length; i++){
            int lookingFor = requiredSum - skill[i];
            if (!frequencyOfNum.containsKey(lookingFor) || frequencyOfNum.get(lookingFor) == 0){ // If non-existent
                return -1;
            }
            chemistry += (long) skill[i] * lookingFor;
            frequencyOfNum.put(lookingFor, frequencyOfNum.get(lookingFor)-1);
        }
        return chemistry/2; // In the process, numbers are actually countered twice e.g. (5,3) (3,5)
    }
}
