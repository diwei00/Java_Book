import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    private static User login() {

        System.out.println("请输入你的姓名：");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("请输入你的身份  1. 管理员  0. 普通用户");
        int choose = scan.nextInt();
        if(choose == 1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }

    }
    public static void main(String[] args) {
        BookList bookList = new BookList();


        User user = login();
        while(true) {
            int choose = user.menu();
            user.doOpeation(choose,bookList);
        }

    }
}
