// El Anderson 
public class Main {

    // creates variables to store time and calls set up function passing start value
    public static void timer(int startVal){
        long startTime = System.currentTimeMillis();
        setUp(startVal);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed:" + String.valueOf(endTime - startTime) + " miliseconds");
    }
    // creates an array with all values from 1 to start value, takes care of n=0 and n=1 case
    public static String setUp(int StartVal){
            int[] numbers = new int[StartVal];
            if (StartVal > 1){
                for (int i = 0; i < StartVal; i++) {
                    numbers[i] = i + 1;
                }
                for (int i = 0; i < StartVal; i++) {
                    stringGen(String.valueOf(numbers[i]),removeNum(numbers,i));
                }
            } else if (StartVal == 1){
                System.out.println("1");
            } else System.out.println("0");;
            return "setup complete"; //this line does nothing but is structurally important and good for debugging
    }

    // takes an array and an index of a number you want to remove and returns an array of size one smaller
    // to make code faster remove this and replace an array with nodes
    // this function creates an entirely new list everytime and is the main time sink
    public static int[] removeNum(int[] startList, int index){
        if(startList.length == 0 || index > startList.length){ //makes sure the array is not empty and the index is in bounds
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

    //Sting generator is the recursing function and adds the values into a string
    public static String stringGen(String stringSoFar, int[] numbers){
            if(numbers.length == 0){
                System.out.println("0");
            } else if (numbers.length == 1){
                stringSoFar += String.valueOf(numbers[0]);
                System.out.println(stringSoFar);
            } else {
                for (int i = 0; i < numbers.length; i++) {
                    stringGen(stringSoFar + numbers[i], removeNum(numbers, i));
                }
            }
            return stringSoFar;
    }

    public static void main(Strings[] args) {
        System.out.println("Zero Case:");
        timer(0);
        System.out.println("One Case:");
        timer(1);
        System.out.println("Two Case:");
        timer(2);
        System.out.println("Three Case:");
        timer(3);
        System.out.println("Four Case:");
        timer(4);
        //timer(5);
        //timer(6);
        //timer(7);
    }
}
