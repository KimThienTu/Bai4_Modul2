import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = new Date().getTime();
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void start(){
        startTime = new Date().getTime();
    }

    public void stop(){
        endTime = new Date().getTime();
    }

    public long getElapsedTime(){
        if (endTime == 0){
            return -1;
        } else {
            return endTime - startTime;
        }
    }
}

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        // Khởi tạo mảng với các số ngẫu nhiên.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(arr);
        stopWatch.stop();

        System.out.println("Thời gian thực thi của thuật toán: " + stopWatch.getElapsedTime() + "milliseconds");
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
