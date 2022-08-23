package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;

    IOperation[] iOperations;
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public void doOpeation(int choose, BookList bookList) {
        iOperations[choose].work(bookList);
    }
}
