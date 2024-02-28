package devmaster.edu.vn.main;

import java.math.BigDecimal;
import java.util.Scanner;

public class testDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã  cần xóa: ");
        BigDecimal EMP_ID = sc.nextBigDecimal();
        boolean flagtodelete = new EmployeeDAOIMPL().deleteProduct(EMP_ID);
        if (flagtodelete == true ) System.out.println("Đã xóa sản phẩm thành công! ");
        else System.out.println("Sảy ra lỗi xóa sản phẩm! ");
    }

}