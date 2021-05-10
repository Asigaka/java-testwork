public interface RouteFinder {
    /*
     Поиск кратчайшего пути между двумя точками
     @param map карта
     @return карта с построенным маршрутом
     */
    char[][] findRoute(char[][] map);
}
