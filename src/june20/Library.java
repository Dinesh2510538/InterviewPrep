package june20;

public class Library {


    public static void main(String[] args) {
        TextBook tb=new TextBook("DINESH");
        tb.setTitle("text book");
        tb.setBookTagNumber(123123);
        tb.price=12323;
        System.out.println(tb.toString(tb.getTitle(),tb.getBookTagNumber()));

        Book[] bookList=new Book[3];
        for(int i=0;i<3;i++){
            Book bi=new Book();
            bi.setTitle("b"+i);
            bi.setBookTagNumber(i+4000);
            bi.price=400;
            bookList[i]=bi;
        }


//        do not modify any code above
        String userTitle="b0";
        for(int i=0;i< bookList.length;i++){
            System.out.println(bookList[i].toString());
        }
        for (int i = 0; i < bookList.length ; i++) {
            if(bookList[i].getTitle().equals(userTitle)){
                bookList[i].setBookTagNumber(bookList[i].getBookTagNumber()*2);
            }
        }

        for(int i=0;i< bookList.length;i++){
            System.out.println(bookList[i].toString());
        }
    }
}
