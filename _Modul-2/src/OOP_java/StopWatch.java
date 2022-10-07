package OOP_java;

import javafx.scene.paint.Stop;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    long startTime, endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch SW = new StopWatch(0, 0);
        System.out.println("StopWatch");
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1.Start Time");
            System.out.println("2.End Time");
            System.out.println("3.Elapsed Time ");
            System.out.println("4.Reset Time ");
            System.out.println("0.Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    SW.startTime = System.currentTimeMillis();
                    break;
                case 2:
                    SW.endTime = System.currentTimeMillis();
                    break;
                case 3:
                    if (SW.endTime < SW.startTime) {
                        System.out.println("Bạn chưa đặt lại thời gian kết thúc");
                        break;
                    } else {
                        System.out.println("Thời gian đã trôi qua: " + SW.getElapsedTime()+" milisecond giây");
                        break;
                    }
                case 4:
                    SW.endTime=0;
                    SW.startTime=0;
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}


