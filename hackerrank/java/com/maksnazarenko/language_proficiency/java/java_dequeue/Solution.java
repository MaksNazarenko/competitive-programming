package com.maksnazarenko.language_proficiency.java.java_dequeue;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            set.add(num);
            if (deque.size() == m) {
                if (ans < set.size()) {
                    ans = set.size();
                }
                int deqFirst = deque.removeFirst();
                if (!deque.contains(deqFirst)) {
                    set.remove(deqFirst);
                }
            }
        }
        System.out.println(ans);
    }
}
