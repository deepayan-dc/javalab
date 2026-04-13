package assignment2;

public class WeeklyVitals {
    public static void main(String[] args) {
        int[] heartRates = {72, 75, 110, 68, 125, 49, 74};

        int total = 0;
        int abnormalCount = 0;
        int maxRate = 0;
        int minRate = Integer.MAX_VALUE;

        for (int i = 0; i < heartRates.length; i++) {
            int currentRate = heartRates[i];
            total += currentRate;
            if (currentRate > 100 || currentRate < 50) {
                System.out.println("Day " + (i + 1) + ": Abnormal reading detected (" + currentRate + ")");
                abnormalCount++;
            }
            if (currentRate > maxRate) maxRate = currentRate;
            if (currentRate < minRate) minRate = currentRate;
        }
        System.out.println("Total Abnormal Days: " + abnormalCount);

        double average = (double) total / heartRates.length;
        System.out.println("Weekly Average Heart Rate (bpm): " + average);

        System.out.println("Maximum Heart Rate (bpm): " + maxRate);
        System.out.println("Minimum Heart Rate (bpm): " + minRate);
    }
}
