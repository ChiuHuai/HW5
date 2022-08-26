import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW5Answer {
    public static void main(String[] args) {
        //程式練習
        //1.
        //以List<Map<String, String>>物件初始化一個animalList，
        //以habitat為key，將animalList重新包裝為Map<String, List<String>>物件
        //印出結果為 -> ocean: shark, jelly fish....

        //初始化animalList
        List<Map<String, String>> animalList = new ArrayList<>();
        animalList.add(Map.of("name", "shark", "habitat", "ocean"));
        animalList.add(Map.of("name", "bear", "habitat", "land"));
        animalList.add(Map.of("name", "moose", "habitat", "land"));
        animalList.add(Map.of("name", "frog", "habitat", "swamp"));
        animalList.add(Map.of("name", "jelly fish", "habitat", "ocean"));
        animalList.add(Map.of("name", "heron", "habitat", "swamp"));
        animalList.add(Map.of("name", "whale", "habitat", "ocean"));

        //建立結果物件 animalMap
        Map<String, List<String>> animalMap = new HashMap<>();

        for (Map<String, String> animal : animalList) {
            //取出 key 為 habitat 的 value，作為 animalMap 的 key
            String habitat = animal.get("habitat");

            if (!animalMap.containsKey(habitat)) {
                animalMap.put(habitat, new ArrayList<String>());
            }

           //根據 animalMap 的 key(habitat) 加入 value 中 的 List<String>)
            animalMap.get(habitat).add(animal.get("name"));
        }

        //整理輸出格式
        animalMap.forEach((key, value) -> System.out.println(key + ": " + (String.join(", ", value))));

        //ocean: shark, jelly fish, whale
        //land: bear, moose
        //swamp: frog, heron

        //=====================================================================
        System.out.println("========================================");

        //2.
        //以Map<String, String>物件初始化一個capitalMap
        //以for或foreach迴圈語法，將capitalMap的內容依下列格式打印在Console
        //印出結果為 -> USA: Washington....

        //初始化capitalMap
        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Thailand", "Bangkok");
        capitalMap.put("UK", "London");
        capitalMap.put("Australia", "Canberra");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("Egypt", "Cairo");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Italy", "Rome");
        capitalMap.put("Brazil", "Brazilia");

        //foreach 輸出結果
        capitalMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
