import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

import javafx.scene.transform.Scale;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong = ");
        int n = scanner.nextInt();
        System.out.println("Nhap so cot = ");
        int m = scanner.nextInt();
        int[][] mang = new int[n][m];
        while (true) {
            System.out.println("menu");
            System.out.println("1. Nhap gia tri cac phan tu mang ");
            System.out.println("2. Hien thi gia tri cac phan tu mang ");
            System.out.println("3. In cac gia tri tren duong bien  ");
            System.out.println("4. In gia tri va tong cac phan tu tren duong treo phu va treo chinh ");
            System.out.println("5. Sap xep cac cot trong mang tang dan ");
            System.out.println("6. Thoat ");
            System.out.print("Chon chuc nang thuc hien :");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhap gia tri mang 2 chieu ");
                    for (int i = 0; i < mang.length; i++) {
                        for (int j = 0; j < mang[0].length; j++) {
                            System.out.println("Gia tri mang[" + i + "][" + j + "]" + " = ");
                            mang[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < mang.length; i++) {
                        for (int j = 0; j < mang[0].length; j++) {
                            System.out.print(mang[i][j] + "   ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Cac gia tri duong bien : ");
                    for (int i = 0; i < mang.length; i++) {
                        for (int j = 0; j < mang[0].length; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                                System.out.print(mang[i][j] + "   ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    int treochinh = 0, treophu = 0;
                    System.out.println("gia tri duong treo chinh :");
                    for (int i = 0; i < mang.length; i++) {
                        for (int j = 0; j < mang[0].length; j++) {
                            if (i == j) {
                                System.out.print(mang[i][j] + "\n");
                                treochinh += mang[i][j];
                            }
                        }
                    }
                    System.out.println("gia tri duong phu :");
                    for (int i = 0; i < mang.length; i++) {
                        for (int j = 0; j < mang[0].length; j++) {
                            if (i + j == n - 1) {
                                System.out.print(mang[i][j] + "\n");
                                treophu += mang[i][j];
                            }
                        }
                    }
                    System.out.println("tong gia tri duong treo chinh = " + treochinh);
                    System.out.println("tong gia tri duong treo phu = " + treophu);
                    break;
                case 5:
                    for (int k = 0; k < n; k++) {
                        for (int i = 0; i < m - 1; i++) {
                            for (int j = m - 1; j > i; j--) {
                                if (mang[k][j] < mang[k][j - 1]) {
                                    int temp = mang[k][j];
                                    mang[k][j] = mang[k][j - 1];
                                    mang[k][j - 1] = temp;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(mang[i][j]+ "  ");
                        }
                        System.out.println("");
                    }
                    break;
                    case 6 :
                    System.exit(0);
                    break;
                    default :
                    System.out.print("Vui long chon chuc nang 1 -> 6");
            }
        }
    }
}
