import java.util.Scanner;

/**
 * Created by Obscur on 06.12.17.
 */
public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] aRRay = new Integer[20];
        //Инициализация массива

        for (int i = 0; i<20; i++ ) {
            aRRay[i] = -10 + (int) (Math.random() * 20);
            System.out.println("Array " + (i) + " is " + aRRay[i]);
            //Заполнение массива
        }
        int ma0 = -1;
        int miP = 10;
        int miPNUM = 0;
        int maONUM = 0;
        for (int i = 0; i<20; i++ ){ //Запускаем прогон по массиву
            if (aRRay[i] > 0){ // Если число +, ищем минимальное
                if (aRRay[i] < miP){
                    miP = aRRay[i];
                    miPNUM = i;} //запоминаем номер в массиве
                }
            if (aRRay[i] < 0){ // Если число -, ищем максимальное
                if (aRRay[i] < ma0){
                    ma0 = aRRay[i];
                    maONUM = i;} //запоминаем номер в массиве
            }
        }
        System.out.println("Min+="+miP+"  Max-="+ma0); //Вывод найденных значений
        aRRay[maONUM ] = miP;
        aRRay[miPNUM] = ma0;//переопределение элементов
        for (int i = 0; i<20; i++ ) {//Цикл вывода измененного массива
            if (i == miPNUM)
                System.out.println("Array " + (i) + " is " + aRRay[i]+" Changed Min+ -> Max-");
            else if (i == maONUM)
                System.out.println("Array " + (i) + " is " + aRRay[i]+" Changed Max- -> Min+");
            else System.out.println("Array " + (i) + " is " + aRRay[i]);
        }
    }
}
