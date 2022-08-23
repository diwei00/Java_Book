package book;

public class BookList {
    //引用数组
    private Book[] books = new Book[10];
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国演绎","罗贯中", 89,"小说");
        books[1] = new Book("红楼梦","曹雪芹",78,"小说");
        books[2] = new Book("西游记","吴承恩",99,"小说");
       this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getPos(int i){
        return books[i];
    }
    public void setBook(Book book, int pos) {
        books[pos] = book;
    }

}
