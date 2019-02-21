package libs;
public class WorkWithArray {
    /**
     *
     * @param array
     */
    public static void backwardsArraydisplay(int array[]) {
//    int array[] = {2, 3, 4, 5};
        for(int i = array.length - 1; i >=0; i--) {
            System.out.println("Array [" + i + "] Element = " + array[i]);
        }
    }
    /**
     *
     * @param array
     */
    public static void search(String array[]) {
//        String array[] = {"tes", "test", "test123"};
        for(int i = 0; i < array.length; i++ ) {
            if( array[i].equals("test")/* == "test"*/) {
                System.out.println("[YIPPEE] " + i +" Element =" + array[i]);
            } else if (!array[i].equals("test") /*!= "test"*/) {
                System.out.println(i + " Element <> test");
            }
        }
    }

    /**
     * int - 2х мерную матрицу
     * Создать метод, который будет возвращать заполненную матрицу
     * в переменных размер и данные
     * @param x
     * @param y
     * @param value
     * @return
     */

    public int[][] createMatrix(int x, int y, int value) {

        int [][] massiveMassive2 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                massiveMassive2[i][j] = value;
                System.out.print(massiveMassive2[i][j] + " ");
            }
            System.out.println(" ");
        }
        return massiveMassive2;
    }

    /**
     * создать 2 метода, который будет заполнять диагонали в матрице
     * если матрица не квадратная - возвращаем ошибку
     * ?
     */
    /**
     * коллекция, лист, сет
     */

    /**
     *
     * @param massive
     * @param value
     * @return
     */
    public int [][] left(int[][] massive, int value) {
        if(massive[1].length == massive.length){
            for (int i = 0; i < massive.length; i++) {
                for (int j = 0; j < massive[i].length; j++) {
                    if (i==j){
                        massive[i][j] = value;
                        System.out.print(massive[i][j] + " ");
                    } else {
                        System.out.print(massive[i][j] + " ");
                    }
                }
                System.out.println(" ");

            }
        }else {
            System.out.println("ERROR");
        }
        return massive;
    }

    /**
     *
     * @param massive
     * @param value
     * @return
     */
    public int [][] right(int[][] massive, int value) {
        if(massive[1].length == massive.length){
            for (int i = 0; i < massive.length; i++) {
                for (int j = 0; j < massive[i].length; j++) {
                    if (i+j==massive.length-1){
                        massive[i][j] = value;
                        System.out.print(massive[i][j] + " ");
                    } else {
                        System.out.print(massive[i][j] + " ");
                    }
                }
                System.out.println(" ");

            }
        }else {
            System.out.println("ERROR");
        }
        return massive;
    }

    /**
     * Создать класс, который будет работать с листами.
     * Методы:
     * Создать пустой
     * Добавлять строку
     * Добавлять значения в строку
     */
}
