/**
 1 Дан массив чисел. Отсортировать массив по возрастанию.
 2 Вывести название месяца по его номеру. Написать метод, который будет принимать на вход число и выводить стрингу. Пример: получили 7, вывели July.
 3 Дан массив букв. Вывести массив, где все большие буквы будут заменены на маленькие. Пример: получили {‘a’, ‘Z’, ‘E’, ‘d’}, вывели {‘a’, ‘z’, ‘e’, ‘d’}.
 4 Дано число. Вывести все простые числа в диапазоне от 2 до этого числа включительно.
 5 Дано две строки. Определить является ли вторая строка подстрокой в строке. Для написания метода НЕ ИСПОЛЬЗОВАТЬ стандартные методы по работе с подстрокой Java. Пример: “abcdef” и “bcd”, метод должен ввернуть true.
 6 Дана строка с набором операций. Написать метод, который будет рассчитывать результат выполнения всех операций, учитывая приоритет операций. Операции только +,-,*,/.  Например: получаем на вход «2+5+9*10+10/5-12», возвращаем 87.
 */
public class SortArrayByIncrease {
    public static void main(String[] args){
       // sortArrayByIncrease(array);
    }
    public static int[] sortArrayByIncrease(int[] array){
        //int[] array = {1090, 100, 84, 12, 22, 33, 1, 3, 64, 85, -3}; //creating array
        int b = 0; // переменная, которая сохраняет изначальное значение первого элемента, который нужно заменить
        for (int j = 0; j < array.length; j++) { //выполняем логику столько раз сколько элементов в массиве
            for (int i = 0; i < array.length - 1; i++) {//-1 используется чтоб избежать выхода за пределы массива
                if (array[i] > array[i + 1]) { // сравниваем два соседних элемента массива
                    b = array[i]; //переменной b присваивается значение элемента массива array[i]
                    array[i] = array[i + 1];// элементу массива array[i] присваивается значение элемента массива array[i + 1]
                    array[i + 1] = b; // элементу массива array[i+1] присваивается значение переменной b
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted array is: " +array[i]);
        }
        return array;
    }
}
