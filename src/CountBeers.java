import java.util.Scanner;

public class CountBeers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] input = reader.nextLine().split(" ");

        Integer stacks = 0;
        Integer beers = 0;

        while (!input[0].equals("End")) {
            Integer count = Integer.parseInt(input[0]);
            String measure = input[1];

            if (measure.equals("beers")) {
                beers += count;
            } else{
                stacks += count;
            }

            while (beers >= 20) {
                beers -= 20;
                stacks++;
            }

            input = reader.nextLine().split(" ");
        }
        System.out.printf("%d stacks + %d beers",stacks,beers);
    }
}
