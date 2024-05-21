
package ECommerceApplication;

public class TestClass {
        public static void main(String[] args) {

                CreditCard creditCard_1 = new CreditCard(
                                "2345 5678 6789 0000",
                                "GULFEM SOLAK",
                                "145",
                                "09/27",
                                "creditCard1");

                CreditCard creditCard_2 = new CreditCard(
                                "7894 5234 6789 4566",
                                "HEVAL SOGUT",
                                "231",
                                "03/29",
                                "creditCard2");

                CreditCard creditCard_3 = new CreditCard(
                                "4219 3564 6764 4457",
                                "LUCY ANDERSON",
                                "219",
                                "03/28",
                                "creditCard3");
                CreditCard creditCard_4 = new CreditCard(
                                "1029 3948 4857 5867",
                                "YAĞMUR BAKIR",
                                "272",
                                "06/27",
                                "creditCard4");

                User user_1 = new User(
                                "gulfemsolak",
                                "Gülfem",
                                "Solak",
                                "20/07/2004",
                                "46695629gS",
                                "gulfemsolak@gmail.com",
                                "26 St. Manisa/Yunusemre",
                                "24 St. Manisa/Yunusemre",
                                creditCard_1);

                User user_2 = new User(
                                "hevalsogut",
                                "Heval",
                                "Söğüt",
                                "20/10/2003",
                                "29355400hG",
                                "hevalsogut@gmail.com",
                                "67 St. Manisa/Yunusemre",
                                "29 St. Manisa/Şehzadeler",
                                creditCard_2);

                User user_3 = new User(
                                "lucyanderson",
                                "Lucy",
                                "Anderson",
                                "15/05/1998",
                                "34985623aL",
                                "lucyanderson@outlook.com",
                                "45 St. Brooklyn, NY",
                                "57 St. Manhattan, NY",
                                creditCard_3);
                User user_4 = new User(
                                "yagmurbakir",
                                "Yağmur",
                                "Bakır",
                                "01/03/2004",
                                "6589626fdk",
                                "yagmurbakir04@hotmail.com",
                                "78 St. IZMIR/KONAK",
                                "95 St. IZMIR/KONAK",
                                creditCard_4);

                Product TV = new Product(
                                "LG TV",
                                "Dark",
                                "Technology",
                                400,
                                15,
                                "This TV has 2 years guarentee and it has internet connection and screan share property from other devices.");

                Product BluetoothHeadphone = new Product(
                                "JBL TUNE560BT",
                                "White",
                                "Technology",
                                100,
                                0.9,
                                "Provides a good music experience with bass quality.");

                Product Table = new Product(
                                "WOOD TABLE",
                                "Wood",
                                "Furniture",
                                2,
                                12,
                                "It is suitable for studying.");

                Product SweatShirt = new Product(
                                "LEVIS SWEATSHIRT",
                                "Blue",
                                "Clothes",
                                250,
                                1.2,
                                "This product is %90 Coton,%10 Polyester");
                Product SmartPhone = new Product(
                                "iPhone 13",
                                "Space Gray",
                                "Technology",
                                100,
                                5,
                                "Latest iPhone model with A15 Bionic chip and dual-camera system.");
                Product CoffeeMaker = new Product(
                                "Coffee Machine",
                                "Red",
                                "Home Appliances",
                                120,
                                20,
                                "It provides multiple cup sizes and strong brew option.");

                Order TVOrder = new Order(user_1, TV, creditCard_1, 1);
                Order BluetoothHeadphoneOrder = new Order(user_2, BluetoothHeadphone, creditCard_2, 2);
                Order SweatShirtOrder = new Order(user_2, SweatShirt, creditCard_2, 3);
                Order TableOrder = new Order(user_3, Table, creditCard_3, 4);
                Order CoffeeMakerOrder = new Order(user_4, CoffeeMaker, creditCard_4, 1);

                TVOrder.processOrder();
                BluetoothHeadphoneOrder.processOrder();
                SweatShirtOrder.processOrder();
                TableOrder.processOrder();
                CoffeeMakerOrder.processOrder();

                user_1.AddFavouriteProducts(TV);
                user_2.AddFavouriteProducts(SweatShirt);
                user_4.AddFavouriteProducts(SmartPhone);
                System.out.println("========================================");
                System.out.println("************ Order Summary ************");
                System.out.println("User: " + user_1.getUsername());
                System.out.println("Ordered Product: " + TV.getName());
                System.out.println("---------------------------------------");

                System.out.println("User: " + user_2.getUsername());
                System.out.println("Ordered Product: " + BluetoothHeadphone.getName());
                System.out.println("---------------------------------------");

                System.out.println("User: " + user_2.getUsername());
                System.out.println("Ordered Product: " + SweatShirt.getName());
                System.out.println("---------------------------------------");

                System.out.println("User: " + user_4.getUsername());
                System.out.println("Ordered Product: " + CoffeeMaker.getName());

                System.out.println("========================================");

                System.out.println("************ Favourites ************");
                System.out.println("User: " + user_1.getUsername());
                System.out.println("Favourite Product: " + TV.getName());
                System.out.println("---------------------------------------");

                System.out.println("User: " + user_2.getUsername());
                System.out.println("Favourite Product: " + SweatShirt.getName());
                System.out.println("---------------------------------------");

                System.out.println("User: " + user_4.getUsername());
                System.out.println("Favourite Product: " + SmartPhone.getName());
                System.out.println("---------------------------------------");
        }

}
