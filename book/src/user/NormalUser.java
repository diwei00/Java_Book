package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    public int menu() {
        System.out.println("欢迎" + name + "来到图书小练习");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出系统");
        System.out.println("请选择你的操作：");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        return choose;
    }
}
