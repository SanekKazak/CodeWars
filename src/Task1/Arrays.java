package Task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Arrays {

    /*
    Нахождение дублей в массиве через set :
    //        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
//            return set.stream().mapToInt(Integer::intValue).toArray();

Нахождение дублей в листе через map :
                List<String> duplicates = allUsers.stream()
                //группируем в map (пользователь -> количество вхождений)
                .collect(Collectors.groupingBy(Function.identity()))
                //проходим по группам
                .entrySet().stream()
                //отбираем пользователей, встречающихся более одного раза
                .filter(e -> e.getValue().size() > 1)
                //вытаскиваем ключи
                .map(Map.Entry::getKey)
                //собираем в список
                .collect(Collectors.toList());
     */


    public static void main(String[] args) {
//        System.out.println(deleteElements(new int[]{1, 2, 2, 2, 3, 4, 6, 7, 8, 8,8}));
//        System.out.println(maxProfit(new int[]{1, 2, 3, 6, 4, 1, 7}));
//        reverse(new int[]{1, 2, 3, 6, 4, 7, 9}, 6);
//        System.out.println(isDuplicated(new Integer[]{1, 2, 3, 4, 5, 6, 6}));
//        System.out.println(singleNumb(new int[]{1,1,2, 2, 3, 4, 4,4}));
//        modeZeroes(new Integer[]{1,2,0,4,0,7,0,10});
    }

    public static int deleteElements(int[] nums) {
        int[] newArray = java.util.Arrays.stream(nums).distinct().toArray();
        return nums.length - newArray.length;
//        Set<Integer> setElements = new HashSet<>();
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (!setElements.add(nums[i])) k++;
//        }
//        setElements.forEach(System.out::println);
//        return k;
    }


    public static int deleteElementsSecondVariant(int[] intArray) {
        int index = 1;

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] < intArray[i + 1]) {
                intArray[index] = intArray[i + 1];
                index++;
            }
            System.out.println(intArray[i]);
        }
        return index;
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

    public static int[] reverse(int[] array, int k) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < k; i++) {
            newArray[i] = array[array.length - k + i];
        }

        for (int i = 0; i < newArray.length - k; i++) {
            newArray[i + k] = array[i];
        }

        System.out.println(java.util.Arrays.toString(newArray));
        return newArray;
    }

    public static boolean isDuplicated(Integer[] intArray){
        Set<Integer> setValues = new HashSet<>();
        for (int value:
             intArray) {
            if(!setValues.add(value)) return true;
        }
        setValues.forEach(System.out::println);
        return false;
    }

    public static int singleNumb(int[] intArray){
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            newMap.put(intArray[i], newMap.getOrDefault(intArray[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> copyMap : newMap.entrySet()){
            if(copyMap.getValue() == 1) return copyMap.getKey();
        }
        return 0;
    }

    public static void modeZeroes(Integer[] intArray){
        List<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, intArray);
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i) == 0){
                intList.remove(i);
                intList.add(0);
            }
        }
        intList.forEach(System.out::println);
    }
}


