package operation;

import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入你要归还的书名：");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i = 0; i < bookList.getUsedSize(); i++) {
            if(name.equals(bookList.getPos(i).getName())) {
                if(bookList.getPos(i).getBorrow()) {
                    bookList.getPos(i).setBorrow(false);
                    System.out.println("归还成功");
                    return;
                }else {
                    System.out.println("你的书已经归还，无需再次归还");
                    return;
                }

            }
        }
        System.out.println("没有你要归还的图书");
    }
}
