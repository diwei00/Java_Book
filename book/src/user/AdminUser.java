package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation(),
        };
    }
    public int menu() {
        System.out.println("欢迎" + this.name + "来到图书小练习");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("请选择你的操作：");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        return choose;
    }

}
