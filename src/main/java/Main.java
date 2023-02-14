//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        int[] arr_6 = new int[M];
//        int[] arr_1 = new int[M];
//
//        for (int i = 0; i < M; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            arr_6[i] = a;
//            arr_1[i] = b;
//        }
//
//        Arrays.sort(arr_6);
//        Arrays.sort(arr_1);
//
//        System.out.println(Math.min(
//                Math.min(
//                        arr_1[0]*N, arr_6[0]*Math.floorDiv(N,6) + arr_1[0]*(N%6)
//                ), arr_6[0]*(Math.floorDiv(N,6)+1))
//        );
//    }
//}