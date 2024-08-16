package dump;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class solutionXYZ {

    public static ArrayList<Map<String, String>> sortArray(ArrayList<Map<String, String>> inputArray, String order) {
        ArrayList<Map<String, String>> returnResult = new ArrayList<>();
        inputArray.stream().sorted((o1, o2) -> {
                    if (order == "ascending")
                        return OffsetDateTime.parse(o1.get("eventTime")).compareTo(OffsetDateTime.parse(o2.get("eventTime")));
                    else
                        return OffsetDateTime.parse(o2.get("eventTime")).compareTo(OffsetDateTime.parse(o1.get("eventTime")));
                }
        ).forEach(i -> returnResult.add(i));
        return returnResult;
    }

    public static void main(String[] args) {

        ArrayList<Map<String, String>> arrays = new ArrayList();

        Map<String, String> map = new HashMap<>();
        map.put("eventTime", "2012-08-24T14:15:22Z");
        map.put("eventTypeName", "string");
        arrays.add(map);

        Map<String, String> map2 = new HashMap<>();
        map2.put("eventTime", "2019-11-24T15:15:22Z");
        map2.put("eventTypeName", "string");
        arrays.add(map2);

        Map<String, String> map3 = new HashMap<>();
        map3.put("eventTime", "2022-08-24T14:16:22Z");
        map3.put("eventTypeName", "string");
        arrays.add(map3);
        System.out.println("input -> " + arrays);


        System.out.print("our result in ascending-> ");
        ArrayList<Map<String, String>> result = sortArray(arrays, "ascending");
        System.out.println(result);

        System.out.print("our result in desc-> ");
        ArrayList<Map<String, String>> resultDesc = sortArray(arrays, "descending");
        System.out.println(resultDesc);

    }
}


// or "descending"