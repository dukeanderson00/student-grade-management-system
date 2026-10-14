import java.util.Arrays;

public class GradeSystem {
    public static void main(String[] args) {
        String[] names = {"Ama", "Kofi", "Esi", "Yaw"};
        double[] scores = {78.5, 62.0, 91.0, 55.5};

        double sum = 0, max = scores[0], min = scores[0];
        int topIndex = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) { max = scores[i]; topIndex = i; }
            if (scores[i] < min) min = scores[i];
        }

        System.out.println("Average: " + sum / scores.length);
        System.out.println("Highest: " + names[topIndex] + " (" + max + ")");
        System.out.println("Lowest: " + min);

        // Update a mark by position, O(1)
        scores[1] = 68.0;

        // Ranking: sort a copy so the original order stays matched to names
        double[] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted);
        System.out.println("Sorted marks (low to high): " + Arrays.toString(sorted));
    }
}
