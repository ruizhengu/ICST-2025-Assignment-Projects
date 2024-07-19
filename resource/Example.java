public class Example {
    public static int findMaxValueReference(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMaxValueIncorrect1(int[] arr) {
        int max = arr[0];
        for (int i = 1; i <= arr.length; i++) { // incorrect array indexing
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMaxValueIncorrect2(int[] array) {
        int max = array[0];
        for (int i = 1; i <= array.length; i++) { // incorrect array indexing
            if (array[i] < max) { // incorrect comparison operator
                max = array[i];
            }
        }
        return max;
    }

    public static String findWinnerReference(Gamer[] gamers) {
        Gamer winner = gamers[0];
        for (int i = 1; i < gamers.length; i++) {
            if (gamers[i].getScore() > winner.getScore()) {
                winner = gamers[i];
            }
        }
        return winner.getName();
    }

    public static String findWinnerIncorrect1(Gamer[] gamers) {
        Gamer winner = gamers[0];
        for (int i = 1; i < gamers.length; i++) {
            if (gamers[i].getScore() > winner.getScore()) {
                winner = gamers[i];
            }
        }
        return winner.getName();
    }


    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 2, 7};
        int maxValue = findMaxValueReference(array);
        System.out.println(maxValue);

        Gamer gamer1 = new Gamer("Timon", 60);
        Gamer gamer2 = new Gamer("Pumbaa", 80);
        Gamer gamer3 = new Gamer("Simba", 50);
        Gamer gamer4 = new Gamer("Scar", 70);
        Gamer[] gamers = {gamer1, gamer2, gamer3, gamer4};
        String winner = findWinnerReference(gamers);
        System.out.println(winner);
    }

    public static class Gamer {
        String name;
        int score;

        public Gamer(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return this.name;
        }

        public int getScore() {
            return this.score;
        }
    }
}
