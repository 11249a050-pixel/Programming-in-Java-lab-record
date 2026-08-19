public class LargestArray {
    public static void main(String[] args){
        int[] numbers={15,8,25,20,30};
        int largest = numbers[0];
        for (int i=1; i<numbers.length; i++){
            if(numbers[i]>largest){
            largest = numbers[i];
        }
    }
    System.out.println("largest element in the array:" + largest);
}
}
