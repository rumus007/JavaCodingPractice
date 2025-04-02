package src.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,9,11,15,17,18,22,25,26,30};
        int target = 11;
        int high = arr.length - 1;

        int index = binarySearchFunc(arr, 0, high, target);

        if (index == -1){
            System.out.println("The target is not in the given array");
        }else {
            System.out.format("The index of target: {%d}, is at {%d} : %d", target, index, arr[index]);
        }
    }

    public static int binarySearchFunc(int[] arr, int low, int high, int target){
        if(low > high) {
            return -1;
        }

        int mid = (low + high)/2;

        if (arr[mid] == target){
            return mid;
        }

        if (arr[mid] > target){
            // Target is lower than out middle index so hence the target is on the left side. high = mid - 1.
            return binarySearchFunc(arr, low, mid - 1, target);
        }else {
            // Target is higher than out middle index so hence the target is on the right side. low = mid + 1.
            return binarySearchFunc(arr, mid + 1, high, target);
        }
    }
}

