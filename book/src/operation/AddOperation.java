package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("请输入你要增加的书名：");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();
        System.out.println("请输入作者：");
        String author = scan.nextLine();

        System.out.println("请输入类型");
        String type = scan.nextLine();
        //防止nextInt读取回车
        System.out.println("请输入价格：");
        int price = scan.nextInt();

        Book book = new Book(bookName,author,price,type);
        bookList.setBook(book,bookList.getUsedSize());

        bookList.setUsedSize(bookList.getUsedSize() + 1);
    }
}
