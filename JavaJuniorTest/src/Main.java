import java.util.Scanner;

public class Main implements RouteFinder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char[][] map =  {{' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}};

        RouteFinder finder = new Main();
        finder.findRoute(map);
    }

    @Override
    public char[][] findRoute(char[][] map) {
        for (char[] row : map) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        return new char[0][];
    }
}
