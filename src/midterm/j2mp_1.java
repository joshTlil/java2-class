import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class j2mp_1 {
    public static void main(String[] args) {
        String file = "E:\\javaCoding\\Java2(reloaded)\\midterm\\pbnumbers.txt";
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Map<Integer, Integer> powerBall = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
             while ((line = reader.readLine()) != null){
                 String[] numbers = line.split("\t");
                 int lastIndex = numbers.length - 1;
                 for (String str : numbers){
                     int num = Integer.parseInt(str);
                     frequencyMap.put(num,frequencyMap.getOrDefault(num,0) +1);
                 }

                 int lastNumber = Integer.parseInt(numbers[lastIndex]);
                 powerBall.put(lastNumber, powerBall.getOrDefault(lastNumber, 0) + 1);

//                 for(String str2 : numbers){
//                     int num2 = Integer.parseInt(numbers[lastIndex]);
//                     powerBall.put(num2, powerBall.getOrDefault(num2, 0) + 1);
//                 }
             }
        }catch (IOException e){
            System.out.println("There was an error!");
        }
        System.out.println("All numbers 1-69 frequencies");
        System.out.println("============================");
        for(Map.Entry<Integer, Integer>entry :frequencyMap.entrySet()){
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }


        System.out.println("All PowerBall numbers 1-35 frequencies");
        System.out.println("============================");
        for(Map.Entry<Integer, Integer>entry2 :powerBall.entrySet()){
            System.out.println("Number: " + entry2.getKey() + ", Frequency: " + entry2.getValue());
        }


        System.out.println("Top 10 most common numbers");
        System.out.println("");
        mostCommon(frequencyMap);
        System.out.println("Top 10 least common numbers");
        System.out.println("");
        leastCommon(frequencyMap);
        System.out.println("Top 10 most overdue numbers");
        System.out.println("");
        overDue(frequencyMap);
//        System.out.println("Top 10 most common numbers");
//        System.out.println("");
//        powerBall(frequencyMap);
    }

//    int targetKey = 5; // Example target key
//        if (frequencyMap.containsKey(targetKey)) {
//        int targetValue = frequencyMap.get(targetKey);
//        System.out.println("Frequency of key " + targetKey + ": " + targetValue);
//    } else {
//        System.out.println("Key " + targetKey + " not found in the map.");
//    }

    public static void mostCommon(Map<Integer, Integer> j){
        Integer[] arr = new Integer[70];
        int n = arr.length;
        for(int g = 1; g < 70; g++){
            arr[g] = j.getOrDefault(g, 0);
//            System.out.println("Key: " + g + ", " + arr[g]);
        }
        for(int i = 1; i < n ; i++){
            int maxIndex = i;
            for(int k = i + 1; k < n; k++){
             if(arr[k] > arr[maxIndex]){
                 maxIndex = k;
             }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        //now match the values with the keys
        Set<Integer> processedKeys = new HashSet<>();
        int count = 0;
        for(int b = 1; b < 70; b++){
//            System.out.println(arr[b]);
//            System.out.println(j.get(b));
            int valueToFind = arr[b];
            for(Map.Entry<Integer, Integer> tuf: j.entrySet()){
                if (count >= 10) break;
                if(tuf.getValue() == valueToFind && !processedKeys.contains(tuf.getKey())){
                        System.out.println("Key: " + tuf.getKey() + ", value: " + tuf.getValue());
                        processedKeys.add(tuf.getKey());
                        count++;
                }
            }

        }
    }

    public static void leastCommon(Map<Integer, Integer> j){
        Integer[] arr = new Integer[70];
        int n = arr.length;
        for(int g = 1; g < 70; g++){
            arr[g] = j.getOrDefault(g, 0);
        }

        for(int i = 1; i < n ; i++){
            int minIndex = i;
            for(int k = i + 1; k < n; k++){
                if(arr[k] < arr[minIndex]){
                    minIndex = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        Set<Integer> processedKeys = new HashSet<>();
        int count = 0;
        for(int b = 1; b < 70; b++){
//            System.out.println(arr[b]);
//            System.out.println(j.get(b));
            int valueToFind = arr[b];
            for(Map.Entry<Integer, Integer> tuf: j.entrySet()){
                if(count>=10)break;
                if(tuf.getValue() == valueToFind && !processedKeys.contains(tuf.getKey())){
                    System.out.println("Key: " + tuf.getKey() + ", value: " + tuf.getValue());
                    processedKeys.add(tuf.getKey());
                    count++;
                }
            }
        }
    }

    public static void overDue(Map<Integer, Integer> j){
        Integer[] arr = new Integer[70];
        int n = arr.length;
        for(int g = 1; g < 70; g++){
            arr[g] = j.getOrDefault(g, 0);
        }

        for(int i = 1; i < n ; i++){
            int minIndex = i;
            for(int k = i + 1; k < n; k++){
                if(arr[k] < arr[minIndex]){
                    minIndex = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        Set<Integer> processedKeys = new HashSet<>();
        int count = 0;
        for(int b = 1; b < 70; b++){
            int valueToFind = arr[b];
            for(Map.Entry<Integer, Integer> tuf: j.entrySet()){
                if(count>=10)break;
                if(tuf.getValue() == valueToFind && !processedKeys.contains(tuf.getKey())){
                    System.out.println("Key: " + tuf.getKey() + ", value: " + tuf.getValue());
                    processedKeys.add(tuf.getKey());
                    count++;
                }
            }
        }
    }
}


