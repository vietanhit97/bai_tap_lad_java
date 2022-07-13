import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi : ");
        String chuoi = scanner.nextLine();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Chuyen chuoi thanh chu hoa ");
            System.out.println("2. Chuyen chuoi thanh chu thuong ");
            System.out.println("3. In ra so tu trong chuoi ");
            System.out.println("4. Chuyen tat ca khong trang thanh ky tu '-' ");
            System.out.println("5. viet hoa moi chu dau tien trong chuoi ");
            System.out.println("6. Thoat ");
            System.out.print("Chon chuc nang :");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    System.out.println(chuoi.toUpperCase());
                    break;
                case 2:
                    System.out.println(chuoi.toLowerCase());
                    break;
                case 3:
                    System.out.println("So tu trong chuoi " + chuoi.length());
                    break;
                case 4:
                    System.out.println(chuoi.replace(" ", "-"));
                    break;
                case 5:
                    String[] arr = chuoi.split(" ");
                    StringBuffer sb = new StringBuffer();

                    for (int i = 0; i < arr.length; i++) {
                        sb.append(Character.toUpperCase(arr[i].charAt(0)))
                                .append(arr[i].substring(1)).append(" ");
                    }
                    System.out.println(sb.toString().trim());
                    break;
            }
        }
    }
}
