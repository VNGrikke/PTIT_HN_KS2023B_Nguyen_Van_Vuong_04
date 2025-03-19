package ra.validate;

import java.util.Scanner;

public class CustomerValidator {
    public static String IdValidator(Scanner sc, String message, String regex) {
        System.out.println(message);
        do {
            String id = sc.nextLine();
            if (id.matches(regex)) {
                return id;
            }
            System.err.println("ID không hợp lệ vui lòng nhập lại!");
        }while (true);
    }

    public static String StringValidator(Scanner sc, String message, int maxLength) {
        System.out.println(message);
        do {
            String inputString = sc.nextLine();

            if (inputString.length() < 0 || inputString == null) {
                System.err.println("Không được để trống!");
            }else if (inputString.length() > maxLength) {
                System.err.println("Vượt quá đọo dài cho phép vui lòng nhập lại!");
            } else {
                return inputString;
            }
        }while (true);
    }

    public static String DOBValidator(Scanner sc, String message, String regex) {
        System.out.println(message);
        do {
            String dob = sc.nextLine();
            if (dob.matches(regex)) {
                return dob;
            }
            System.err.println("Ngày sinh nhập không hợp lệ vui lòng nhập lại!");
        }while (true);
    }

    public static String phoneValidator(Scanner sc, String message, String regex) {
        System.out.println(message);
        do {
            String phone = sc.nextLine();
            if (phone.length() < 0 || phone == null) {
                System.err.println("Số điện thoại không được để trống");
            }
            if (phone.matches(regex)) {
                return phone;
            }
            System.err.println("Số điện thoại nhập không hợp lệ vui lòng nhập lại!");
        }while (true);
    }

    public static String emailValidator(Scanner sc, String message, String regex) {
        System.out.println(message);
        do {
            String email = sc.nextLine();
            if (email.length() < 0 || email == null) {
                System.err.println("Email không được để trống");
            }else if (email.matches(regex)) {
                return email;
            }
            System.err.println("Email nhập không hợp lệ vui lòng nhập lại!");
        }while (true);
    }

    public static boolean genderValidator(Scanner sc, String message) {
        System.out.println(message);
        do {
            String gender =  sc.nextLine();
            if (gender.length() < 0 || gender == null) {
                System.err.println("Giới tính không được để trống");
            }else if (gender.toLowerCase().equals("nam")) {
                return true;
            }else if (gender.toLowerCase().equals("nữ")) {
                return false;
            }else {
                System.err.println("giới tính không hợp lệ vui lòng nhập lại!");
            }
        }while (true);
    }

    public static String customerTypeValidator(Scanner sc, String message) {
        System.out.println(message);
        do {
            String customerType = sc.nextLine();
            if (customerType.length() == 0 || customerType == null) {
                System.err.println("Vai trò không được để trống");
            }else{
                return customerType;
            }
        }while (true);

    }
}
