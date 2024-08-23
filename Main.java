import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public int startVal;
    public int size;
    public int[] numbers;

    public void setUp(int StartVal){
        this.startVal = StartVal;
        this.size = StartVal;
        numbers = new int[startVal];
        if (startVal > 0){
            for (int i = 0; i < startVal; i++) {
                numbers[i] = i + 1;
            }
            stringGen("",numbers);
        } else System.out.println("0");
    }

    public int[] removeNum(int[] startList, int index){
        if(startList.length == 0 || index > startList.length){
            return null;
        } else {
            int[] newArray = new int[startList.length - 1];
            for (int i = 0; i < startList.length; i++) {
                if (i < index) {
                    newArray[i] = startList[i];
                } else if (i == index) {
                    continue;
                } else if (i > index) {
                    newArray[i - 1] = startList[i];
                } else return startList;
            }
            return newArray;
        }
    }

    public void stringGen(String stringSoFar, int[] numbers){
        if(numbers.length == 0){
            System.out.println("0");
        } else if (numbers.length == 1){
            stringSoFar += String.valueOf(numbers[0]);
            System.out.println(stringSoFar);
        } else {
            for (int i = 0; i < numbers.length; i++) {
                stringGen(stringSoFar += numbers[i], removeNum(numbers, i));
            }
        }
    }

    public void main() {
        System.out.println("Yippee");
        System.out.println("Zero Case:");
        setUp(0);
        System.out.println("One Case:");
        setUp(1);
        System.out.println("Two Case:");
        setUp(2);
        System.out.println("Three Case:");
        setUp(3);
    }
}
