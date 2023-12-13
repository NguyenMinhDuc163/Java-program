// Cho lớp Account gồm các thuộc tính :

// ID : Mã account

// customerID : Mã khách hàng sở hữu Account

// Username : Tên tài khoản

// Password : Mật khẩu

// Cho một danh sách tài khoản sẵn có trong cơ sở dữ liệu, bạn hãy kiểm tra xem các đăng nhập của người dùng có hợp lệ hay không và thông báo ra màn hình.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Account[] accountList = new Account[n];
        for(int i = 0; i < n; i++){
            accountList[i] = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < q; i++){
            String username = sc.nextLine();
            String password = sc.nextLine();
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(accountList[j].checkLogin(username, password)){
                    check = true;
                    break;
                }
            }
            if(check){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Login Failed");
            }
        }
    }
}

class Account {
    private String id, customerId, username, password;

    public Account(String id, String customerId, String username, String password) {
        this.id = id;
        this.customerId = customerId;
        this.username = username;
        this.password = password;
    }
    
    public boolean checkLogin(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
// Input Format

// Dòng 1 là N : số lượng Account

// 4 * N dòng tiếp theo mô tả thông tin của từng Account, mỗi Account gồm 4 dòng lần lượt là ID, customerID, Username, Password

// Dòng tiếp theo là Q : số lượng lượt đăng nhập

// 2 * Q dòng tiếp theo mô tả tên đăng nhập và mật khẩu của từng người dùng

// Constraints

// 1 <= N,Q <= 10000

// ID, customerID, Username, Password là các xâu ký tự có không quá 50 ký tự.

// Output Format

// Đối với mỗi lượt truy cập in ra "Login Successful" nếu truy cập thành công và "Login Failed" nếu truy cập thất bại.
// Sample Input 0

// 2
// 346sds
// cus002
// 28tech
// 28tech123xyz
// 122clo
// cus009
// nguyenmy
// my123456
// 1
// 28tech
// 28tech123xyz
// Sample Output 0

// Login Successful