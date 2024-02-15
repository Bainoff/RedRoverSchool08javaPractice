package homework;

public class Work {

        public static String areYouPlayingBanjo(String name) {
            if (name.toUpperCase().charAt(0) == 'R') return name + " plays banjo";
            else return name + " does not play banjo";
        }
        public static void main(String[] args) {
            System.out.println(areYouPlayingBanjo("zobert"));
        }
    }

