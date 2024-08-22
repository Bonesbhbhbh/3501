public class Main {
    public int startVal;
    public int count;
    public int[] numbers;

    public void stringGen(int startVal){
        this.startVal = startVal;
        this.count = startVal - 1;
        // numbers = int[startVal];
        if(startVal == 0){
            System.out.println("pick a diff num");
        } else if(startVal == 1){
            System.out.println("1");
        } else {
            String countUp = "1";
            String countDown = String.valueOf(startVal);
            while (count > 0){
                // start val = 3
                // count = 2
                // statVal - count = 1

                countUp += String.valueOf(count - startVal);
                countDown += String.valueOf(count);
                count--;
            }
            System.out.println(countUp);
            System.out.println(countDown);
        }
    }

    public void main() {
        System.out.println("Yippee");
        System.out.println("Zero Case:");
        stringGen(0);
        System.out.println("One Case:");
        stringGen(1);
        System.out.println("Two Case:");
        stringGen(2);
    }
}

