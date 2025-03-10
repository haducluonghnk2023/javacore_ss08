import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        int n;
        int choice;
        do {
            System.out.println("\n********** MENU **********");
            System.out.println("1. Nhập n phần tử của mảng (n nhập từ bàn phím)");
            System.out.println("2. In giá trị của các phần tử trong mảng");
            System.out.println("3. Tính giá trị trung bình của các phần tử dương (>0) trong mảng\n");
            System.out.println("4. In ra vị trí (chỉ số) của các phần tử có giá trị 'k' trong mảng (k được nhập từ bàn phím)");
            System.out.println("5. Tính số phần tử nguyên tố trong mảng");
            System.out.println("6. Thoát chương trình");
            System.out.println("**************************");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập kích thước của mảng (n): ");
                    n = sc.nextInt();
                    arr = new int[n];
                    System.out.println("Nhap gia tri vao mang:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Phan tu thu [" + i + "]: ");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    if (arr != null) {
                        System.out.print("Phần tu trong mang: ");
                        for (int element : arr) {
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Mảng chưa được khởi tạo. Vui lòng chọn tùy chọn 1 trước.");
                    }
                    break;
                case 3:
                    if (arr != null) {
                        double sum = 0;
                        int count = 0;
                        for (int element : arr) {
                            if (element > 0) {
                                sum += element;
                                count++;
                            }
                        }
                        if (count > 0) {
                            System.out.println("Trung bình của các số dương: " + (sum / count));
                        } else {
                            System.out.println("Không có số dương nào trong mảng.");
                        }
                    } else {
                        System.out.println("Mảng chưa được khởi tạo. Vui lòng chọn tùy chọn 1 trước");
                    }
                    break;
                case 4:
                    if (arr != null) {
                        System.out.print("Nhập k: ");
                        int k = sc.nextInt();
                        System.out.print("Chỉ số của các phần tử có giá trị " + k + ": ");
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == k) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("Mảng chưa được khởi tạo. Vui lòng chọn tùy chọn 1 trước");
                    }
                    break;
                case 5:
                    if (arr != null) {
                        int primeCount = 0;
                        for (int element : arr) {
                            if (element > 1) {
                                boolean isPrime = true;
                                for (int i = 2; i <= Math.sqrt(element); i++) {
                                    if (element % i == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                                if (isPrime) {
                                    primeCount++;
                                }
                            }
                        }
                        System.out.println("Số lượng các số nguyên tố: " + primeCount);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo. Vui lòng chọn tùy chọn 1 trước");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.Vui lòng chọn lại.");
            }
        }while (true);
    }
}
