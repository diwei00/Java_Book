package operation;

import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入你要删除图书的名字：");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i = 0; i < bookList.getUsedSize(); i++) {
            if(name.equals(bookList.getPos(i).getName())){
                for(int j = i; j < bookList.getUsedSize() - 1; j++) {
                    bookList.setBook(bookList.getPos(j + 1), j);
                }
                //防止内存泄漏，删除后数组最后一位数据还引用着对象
                bookList.setBook(null,bookList.getUsedSize() - 1);
                bookList.setUsedSize(bookList.getUsedSize() - 1);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("抱歉，没有你要删除的图书");

    }

}
