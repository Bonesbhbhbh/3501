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
        return "setup complete";
}

public static int[] removeNum(int[] startList, int index){
    int[] testSuccess = new int[]{88,88,88};
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

public static void main() {
    // System.out.println("Yippee"); //theres no joy here :(
    System.out.println("Zero Case:");
    setUp(0);
    System.out.println("One Case:");
    setUp(1);
    System.out.println("Two Case:");
    setUp(2);
    System.out.println("Three Case:");
    setUp(3);
    System.out.println("Four Case:");
    setUp(4);
}
