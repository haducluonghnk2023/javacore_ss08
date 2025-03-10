import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Nhập kích thước của mảng :");
            if(scanner.hasNextInt()){
                n = Integer.parseInt(scanner.nextLine());
                if(n > 0 ){
                    break;
                }else {
                    System.out.println("Kích thước không hợp lệ.");
                }
                int[] arr = new int[n];
            }else {
                System.out.println("Kích thước không hợp lệ. Vui lòng nhập một số nguyên.");
                scanner.next();
            }
        }
        int[] arr = new int[n];
        System.out.println("Nhâp các phần tử của mảng :");
        for(int i=0;i<n;i++){
            System.out.println("Nhập phần tử thu "+(i+1)+" :");
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        scanner.close();
    }
}
