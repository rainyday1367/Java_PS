import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

//        Arrays.sort(arr, (a, b) -> b - a);

        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= k) {
                count += k / arr[i];
                k %= arr[i];
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
