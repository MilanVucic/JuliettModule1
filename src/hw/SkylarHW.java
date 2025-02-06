package hw;

import java.util.*;

public class SkylarHW {
//        1. Check whether an array is subset of another array.
    // arr1: 1 1 1 1 4
    // arr2: 1 1 1 1 5 4 1 6


//        3. Maximum distance between two occurrences of same element in array
//        Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
//        Output: 10
//        // maximum distance for 2 is 11-1 = 10
//        // maximum distance for 1 is 4-2 = 2
//        // maximum distance for 4 is 10-5 = 5
//        4. Check if the brackets are properly paired ([{}])
//        5. Find the n-th largest element in an array. Same numbers only count once (i.e. arr = [10, 10, 5], n = 2, output is 5, not 10)



    //1. Check whether an array(arr1) is subset of another array(arr2).
    public static boolean isSubset(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return false;
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int num: arr1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        } // N
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : arr2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        } // N
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (map2.get(num) == null || count > map2.get(num)) {
                return false;
            }
        } // N
        // 3N -> N
        // map1: 1 -> 4, 2 -> 3, 5 -> 1, 9 -> 4
        // map2: 1 -> 76,2 -> 4, 5 -> 1, 7 -> 888, 9 -> 4
        return true;
    }

    //        2. Check if a pair of elements exists with given sum in given array.
    //                Input: arr[] = {0, -1, 2, 7, 1}, x = 10
    // N + N-1 + N-2 ... + 1 = N(N-1)/2 -> O(N^2)
    //        Output: Yes
    //        Explanation:  If we calculate the sum of the output:1 + (-3) = -2
    // {1,2,4,5,6,7,8,10} -> target 12
    // SET: [1,2,4,5,6,7]
    public static boolean twoSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        List<Integer> a = new ArrayList<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    //        3. Maximum distance between two occurrences of same element in array
    //        Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
    //        Output: 10
    //        // maximum distance for 2 is 11-1 = 10
    //        // maximum distance for 1 is 4-2 = 2
    //        // maximum distance for 4 is 10-5 = 5
    public static int maxDistance(int[] arr) {
        //used as keeping track of the first occurrence of a number
        Map<Integer, Integer> map = new HashMap<>();
        int maxDis = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Integer index = map.get(arr[i]);
            if (index == null) {
                map.put(arr[i], i);
            } else {
                maxDis = Math.max(maxDis, i - index);
            }
        }
        return maxDis;
    }

    //4. Check if the brackets are properly paired ([{}])
    public boolean isValid(String s) {
        /**
         case1: stack is empty, can only place left parenthese
         if s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']':
         return false;
         else:
         push s.charAt(i) to stack

         case2: stack is not empty
         if if s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[':
         push s.charAt(i) to stack
         else:
         if top of stack matches with s.charAt(i):
         poll top element from stack
         else:
         return false
         post-processing:
         return stack.isEmpty()
         */
        Deque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                    return false;
                } else {
                    st.offerFirst(s.charAt(i));
                }
            } else {
                if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                    st.offerFirst(s.charAt(i));
                } else {
                    char top = st.peekFirst();
                    char cur = s.charAt(i);
                    if ((top == '{' &&  cur == '}') || (top == '[' &&  cur == ']') || (top == '(' &&  cur == ')')) {
                        st.pollFirst();
                    } else  {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    //5. Find the n-th largest element in an array. Same numbers only count once (i.e. arr = [10, 10, 5], n = 2, output is 5, not 10)
    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            if (minHeap.contains(num)) {
                 continue;
            }
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else {
                int min = minHeap.peek();
                if (num > min) {
                    minHeap.poll();
                    minHeap.offer(num);
                }
            }
        }
        return minHeap.poll();
    }

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[] {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}));
    }

}