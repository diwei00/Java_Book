package operation;

import book.BookList;

public class ShowOperation implements IOperation{
    public void work(BookList bookList) {
        for(int i = 0; i < bookList.getUsedSize(); i++){
            System.out.println(bookList.getPos(i));
        }
    }
}
