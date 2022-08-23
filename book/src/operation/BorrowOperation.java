package operation;

import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入你要借阅的图书");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(name.equals(bookList.getPos(i).getName())) {
                if(bookList.getPos(i).getBorrow()) {
                    System.out.println("抱歉你要借阅的图书以借出");
                    return;
                } else {
                    bookList.getPos(i).setBorrow(true);
                    System.out.println("借阅成功");
                    return;
                }
            }
        }
        System.out.println("抱歉，没有你要借阅的图书");
    }
}
