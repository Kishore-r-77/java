package practice;

class Practice {
    public static void main(String[] args) {

        // leetcode 1854

        // Input: logs = [[1993,1999],[2000,2010]]
        // Output: 1993
        // Explanation: The maximum population is 1, and 1993 is the earliest year with
        // this population.

        int[][] logs = {
                { 1993, 1999 },
                { 2000, 2010 },
        };

        System.out.println(maximumPopulation(logs));

    }

    static public int maximumPopulation(int[][] logs) {
        int[] populationChanges = new int[101];

        for (int log[] : logs) {
            int birth = log[0] - 1950;
            int death = log[1] - 1950;
            populationChanges[birth]++;
            populationChanges[death]--;
        }

        int maxPopulation = 0;
        int currentPopulation = 0;
        int year = 1950;

        for (int i = 0; i < populationChanges.length; i++) {
            currentPopulation += populationChanges[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                year = 1950 + i;
            }
        }

        return year;
    }

}
