import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang :");
        int n = Integer.parseInt(scanner.nextLine());
        int[] songuyen = new int[n];
        while (true) {
            System.out.println("menu");
            System.out.println("1. Nhap gia tri cac phan tu mang ");
            System.out.println("2. Hien mang vua nhap");
            System.out.println("3. In ra phan tu co gia tri lon nhat , nho nhat ");
            System.out.println("4. In ra phan tu co gia tri la so nguyen to");
            System.out.println("5. In ra phan tu co gia tri la so hoan hao");
            System.out.println("6. thoat");
            System.out.print("chon chuc nang tren menu : ");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhap gia tri cac phan tu mang : ");
                    for (int i = 0; i < songuyen.length; i++) {
                        System.out.print("Gia tri phan tu thu " + (i + 1) + " = ");
                        songuyen[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    for (int i = 0; i < songuyen.length; i++) {
                        System.out.println("Gia tri mang vua nhap thu " + (i + 1) + " : " + songuyen[i]);
                    }
                    break;
                case 3:
                    int min = songuyen[0], max = songuyen[0];
                    for (int i = 1; i < songuyen.length; i++) {
                        if (songuyen[i] < min) {
                            min = songuyen[i];
                        }
                        if (songuyen[i] > max) {
                            max = songuyen[i];
                        }
                    }
                    System.out.println("Gia tri nho nhat trong mang " + min);
                    System.out.println("Gia tri lon nhat trong mang " + max);
                    break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        int j;
                        for (j = 2; j <= songuyen[i]; j++) {
                            if (songuyen[i] % j == 0) {
                                break;
                            }
                        }
                        if (songuyen[i] == j) {
                            System.out.println("so nguyen to trong mang : " + songuyen[i]);
                        }
                    }
                    break;
                case 5:
                    
                    for (int i = 0; i < n; i++) {
                        int temp = 0;
                        for (int j = 1; j <= songuyen[i] / 2; j++) {
                            if (songuyen[i] % j == 0) {
                                temp += j;
                            }
                        }
                        if (temp==songuyen[i]) {
                            System.out.println("so hoan hao trong mang : " + songuyen[i]);
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.print("vui long chon lai menu !!!");
            }
        }
    }
}