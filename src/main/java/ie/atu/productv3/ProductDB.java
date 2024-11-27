package ie.atu.productv3;

import ie.atu.productv3.Book;
import ie.atu.productv3.Software;

public class ProductDB {

        public static Product getProduct(String productCode) {
            Product myItem= null;

            if (productCode.equalsIgnoreCase("java")) {
                Book myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("ATU Java Programming");
                myBook.setPrice(57.50);
                myBook.setAuthor("Joe Brown");
                myItem = myBook;
            } else if (productCode.equalsIgnoreCase("jsp")) {
                Book myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("Java Servlets and JSP");
                myBook.setPrice(57.50);
                myBook.setAuthor("Mike White");
                myItem = myBook;
            } else if (productCode.equalsIgnoreCase("mysql")) {
                Book myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("Lennon's MySQL");
                myBook.setPrice(54.50);
                myBook.setAuthor("Jim Lennon");
                myItem = myBook;
            }

            if (productCode.equalsIgnoreCase("studios")) {
                Software mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Visual Studios");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Microsoft 1.1");
                myItem = mySoftware;
            } else if (productCode.equalsIgnoreCase("eclipse")) {
               Software mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Build Java apps");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Eclipse Neon");
                myItem = mySoftware;
            } else if (productCode.equalsIgnoreCase("oracle")) {
                Software mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Latest MySQL");
                mySoftware.setPrice(54.50);
                mySoftware.setVersion("Oracle 3.0");
                myItem = mySoftware;
            }
            return myItem;
        }

}

