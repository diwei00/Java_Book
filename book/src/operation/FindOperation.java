package operation;

import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入你要查找的书名");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();
        for(int i = 0; i < bookList.getUsedSize(); i++){
            if(bookName.equals(bookList.getPos(i).getName())){
                System.out.println("你要查找图书的信息");
                System.out.println(bookList.getPos(i));
                return;
            }
        }
        System.out.println("抱歉，没有你要查找的图书");
    }
}
