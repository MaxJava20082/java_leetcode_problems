package by.max.problems.arrays_hashing.two_sums;


import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1. Two Sum
 * <p>
 * Задача: Дан массив целых чисел nums и целое число target.
 * Вернуть индексы двух чисел, сумма которых равна target.
 * Гарантируется, что существует ровно одно решение.
 */
public class Solution_Java {
    /**
     * Оптимальное решение с использованием HashMap для O(1) доступа к индексам.
     * Сложность: O(n) по времени, O(n) по памяти.
     *
     * @param nums   массив целых чисел
     * @param target целевая сумма
     * @return массив из двух индексов
     */
    public int[] twoSum(int[] nums, int target) {
        // HashMap для хранения пары: (число, его индекс)
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Однопроходный алгоритм
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Если комплемент уже встречался, задача решена
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            // Сохраняем текущее число и его индекс
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}