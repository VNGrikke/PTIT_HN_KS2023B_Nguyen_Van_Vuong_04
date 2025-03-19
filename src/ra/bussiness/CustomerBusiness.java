package ra.bussiness;

import ra.entity.Customer;

import java.util.Scanner;

public class CustomerBusiness {
    public static void main(String[] args) {

        Customer[] customers = new Customer[1000];
        int count = 0;


        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------------------------Customer Menu--------------------------");
            System.out.println("1. Hiển thị danh sách các khách hàng ");
            System.out.println("2. Thêm mới khách hàng");
            System.out.println("3. Chỉnh sửa thông tin khách hàng ");
            System.out.println("4. Xóa khách hàng ");
            System.out.println("5. Tìm kiếm khách hàng ");
            System.out.println("6. Sắp xếp  ");
            System.out.println("0. Thoát chương trình ");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("danh sach trong hay nhap them");
                        break;
                    }
                    for (Customer c : customers) {
                        c.displayData();
                    }


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    break;

            }
        }while (true);
    }
}
