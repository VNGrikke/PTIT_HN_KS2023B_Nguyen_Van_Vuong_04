package ra.entity;

import ra.validate.CustomerValidator;

import java.util.Scanner;

public class Customer implements IApp {
    private String customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Boolean gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String customerType;

    public Customer() {}

    public Customer(String firstName, String lastName, String dateOfBirth, Boolean gender, String address, String phoneNumber, String email, String customerType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public void inputData(Scanner sc) {
        this.customerId = CustomerValidator.IdValidator(sc, "Nhập mã khách hàng: ", "[C]w/4");
        this.firstName = CustomerValidator.StringValidator(sc, "Nhập tên khách hàng(<50 kí tự): ", 50);
        this.lastName = CustomerValidator.StringValidator(sc, "Nhập họ khách hàng(<30 kí tự): ", 30);
        this.dateOfBirth = CustomerValidator.DOBValidator(sc, "Nhập ngày sinh: ", "\\d{2}\\d{2}/\\d{4}");
        this.address = CustomerValidator.StringValidator(sc, "Nhập địa chỉ(<255 kí tự)", 255);
        this.phoneNumber = CustomerValidator.phoneValidator(sc, "Nhập số điện thoại", "{0}/d{9}");
        this.email = CustomerValidator.emailValidator(sc, "Nhập vào email", "[a-z]||[A-Z]||[0-9]\\w+@\\w+\\.\\w+");
        this.customerType = CustomerValidator.customerTypeValidator(sc, "Nhập vai trò người dùng");
        this.gender = CustomerValidator.genderValidator(sc, "Nhập giới tính: ");
    }

    @Override
    public void displayData() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Ten: " + this.lastName + " " + this.firstName );
        System.out.println("Ngay sinh: " + this.dateOfBirth);
        System.out.println("dia chi: " + this.address);
        System.out.println("email: " + this.email);
        System.out.println("So dien thoai: " + this.phoneNumber);
        System.out.println("Gioi tinh: " + this.gender);
        System.out.println("Vai tro: " + customerGender(this.gender));
    }

    public String customerGender(boolean gender) {
        return gender ? "Nam" : "Nữ";
    }
}
