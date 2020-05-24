package traning.fundamentals.optionaltask;

public class Methods {

    public int findTheShortest (int [] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int findTheLongest (int [] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public double findTheAverage(int [] array){
        double sum = 0;
        double countElement = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.toString(array[i]).length();
            countElement++;
        }
        return sum / countElement;
    }

    public void findElementsThatShorterAverage(double averageValue, int [] array){
        for (int i = 0; i < array.length; i++) {
            int lengthOfElement = Integer.toString(array[i]).length();
            if (lengthOfElement < averageValue) {
                System.out.println(array[i] + " HAS LENGTH: " + lengthOfElement);
            }
        }
    }

    public void findElementsThatLongerAverage(double averageValue, int [] array){
        for (int i = 0; i < array.length; i++) {
            int lengthOfElement = Integer.toString(array[i]).length();
            if (lengthOfElement > averageValue) {
                System.out.println(array[i] + " HAS LENGTH: " + lengthOfElement);
            }
        }
    }

}
