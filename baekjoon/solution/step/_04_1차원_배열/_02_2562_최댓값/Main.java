package baekjoon.solution.step._04_1차원_배열._02_2562_최댓값;

import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2562
 */
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        FastReader br = new FastReader();

        int count = 9;
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = br.nextInt();
        }

        Solution solution = new Solution();
        solution.solution(numbers);

    }

    public static class Solution {
        public void solution(int[] numbers) {

            int index = 0;
            int maxTemp = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (maxTemp < numbers[i]) {
                    maxTemp = numbers[i];
                    index = (i + 1);
                }
            }
            System.out.println(maxTemp);
            System.out.println(index);
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void close() throws IOException {
            br.close();
        }
    }
}