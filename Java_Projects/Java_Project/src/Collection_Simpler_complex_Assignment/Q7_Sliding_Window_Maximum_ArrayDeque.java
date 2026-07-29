package Collection_Simpler_complex_Assignment;

public class Q7_Sliding_Window_Maximum_ArrayDeque {
/* Q7. Sliding window maximum [Medium]
Given an array and a window size k, find the maximum element in every contiguous window of size k using ArrayDeque
to store indices.
Input arr = [1,3,-1,-3,5,3,6,7], k = 3
Output [3, 3, 5, 5, 6, 7]
Focus on: Maintain a deque of indices in decreasing order of value; pop from front when out of window, pop from back when smaller
than current.*/
}

static void main() {
    int[] array = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    ArrayDeque<Integer> ad = new ArrayDeque<>();

}