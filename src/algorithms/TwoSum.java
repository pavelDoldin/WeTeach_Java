package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(numsIndex()) );




    }
    //Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел таким образом, чтобы они в сумме равнялись target.
    //Вы можете предположить, что каждый ввод будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
    //Вы можете вернуть ответ в любом порядке.
    //Пример 1:
    //Входные данные: числа = [2,7,11,15], target = 9
    //Выходные данные: [0,1]
    //Объяснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
    //Пример 2:
    //Входные данные: числа = [3,2,4], цель = 6
    //Выходные данные: [1,2]
    //Пример 3:
    //Входные данные: числа = [3,3], цель = 6
    //Выходные данные: [0,1]

    static int[] numsIndex() {
        int target = 6;
        int[] nums = new int[]{3,2,4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i );
        }
        throw new IllegalArgumentException("Нет таких элементов");
    }
}
















