import java.util.Scanner;

public class bai2 {
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
        int sum = 0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            System.out.println("Phần tử thu "+(i+1)+":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Tổng :");
        for(int i=0;i<n;i++){
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                flag = true;
            }
        }
        if(flag){
            System.out.println(sum);
        }else {
            System.out.println("Không có số chia hết cho 3");
        }
    }
}
