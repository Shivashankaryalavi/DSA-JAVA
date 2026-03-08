package arrays.basics;
public class LargestSecond {
    public static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        for(int num : arr){
            if(num >  largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num!= largest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,60,70};
        System.out.print("Second Larrgest element is : ");
        System.out.println(findSecondLargest(arr));
    }
}