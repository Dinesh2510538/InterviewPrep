package june20;

class Book {
//[{title:'b1',booktagnumber:123,price:400},
// {title:'b2',booktagnumber:123,price:1400},
// {title:'b3',booktagnumber:1213,price:1400}]
// 10,print prime numbers
//I have a library.
// I have 3 books with each book having a title, booktagnumber and price stored into the library
//management system
//when user provides a title, find the booktagnumber matching the title
//b1-123

//int, float,double,char,boolean,long,short
//WrapperClass- Integer,Double,Float,String,Boolean,Long,Short

    private String title;
    private int bookTagNumber;
    public int price;

    public int getAdd() {
     return this.price+this.bookTagNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookTagNumber() {
        return bookTagNumber;
    }

    public void setBookTagNumber(int bookTagNumber) {
        this.bookTagNumber = bookTagNumber;
    }

    public String toString() {
        return "june20.Book{" +
                "title='" + title + '\'' +
                ", bookTagNumber=" + bookTagNumber +
                ", price=" + price +
                '}';
    }
}
