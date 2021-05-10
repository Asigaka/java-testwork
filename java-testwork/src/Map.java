public class Map implements RouteFinder{
    private final char startChar = '@';
    private final char endChar = 'X';

    @Override
    public char[][] findRoute(char[][] map) {
        int iStart = 0, jStart = 0;
        int iEnd = 0, jEnd = 0;
        for (int i = 0; i < 5; i++) {  //идём по строкам
            for (int j = 0; j < 5; j++) {//идём по столбцам
                if (map[i][j] == startChar) {
                    //System.out.println(i + " " + j);
                    iStart = i;
                    jStart = j;
                }
                if (map[i][j] == endChar) {
                    //System.out.println(i + " " + j);
                    iEnd = i;
                    jEnd = j;
                }
            }
        }
        //(iStep & jStep) != (iEnd & jEnd)
        int iStep = iStart, jStep = jStart;
        while (true) {
            //System.out.println(iStep + " " + jStep);
            if (iStep == iEnd && jStep == jEnd) {
                System.out.println("Дошли!");
                map[iStep][jStep] = 'X';
                break;
            } else if (jStep == jEnd && iStep > iEnd) {
                System.out.println("Над входом");
                iStep--;
            } else if (jStart == jEnd && iStep < iEnd) {
                System.out.println("Под входом");
                iStep++;
            } else if (iStep < iEnd) {
                System.out.println("Выход снизу");
                if (jStep < jEnd) {
                    System.out.println("справа");
                    jStep++;
                } else if (jStep > jEnd){
                    System.out.println("слева");
                    jStep--;
                } else {
                    iStep++;
                }
            }else if (iStep > iEnd) {
                System.out.println("Выход сверху");
                if (jStep < jEnd) {
                    System.out.println("справа");
                    jStep++;
                } else if (jStep > jEnd) {
                    System.out.println("слева");
                    jStep--;
                } else {
                    iStep--;
                }
            }
            map[iStep][jStep] = '+';

        }
        for (char[] row : map) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        /*
try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         */
        //int step = (jStart - jEnd);

        return map;
    }
}
