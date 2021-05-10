public class Main {
    public static void main(String[] args) {
        char[][] map =  {
                {'.', 'X', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '@'}};

        Map findRoute = new Map();
        findRoute.findRoute(map);
    }
}
