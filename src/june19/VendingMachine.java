package june19;

public class VendingMachine {
    public static void main(String[] args) {
        String[] coffee={"Espresso Coffee",
                        "Cappuccino Coffee",
                           "Latte Coffee"};

        String[] tea={
                "Plain Tea",
                "Tea Assam",
                "Ginger Tea",
                "Cardamom Tea",
                "Masala Tea",
                "Lemon Tea",
                "Green Tea",
                "Organic Darjeeling Tea"
        };

        String[] soup={"Hot and Sour Soup",
                       "Veg Corn Soup",
                       "Tomato Soup",
                       "Spicy Tomato Soup"};

        String[] beverages={"Hot Chocolate Drink",
                            "Badam Drink",
                            "Badam-Pista Drink"};

        char mainMenu='c';
        int subMenu=1;


        if(mainMenu =='c'){
            if(subMenu< coffee.length){
                System.out.println("Welcome to CCD ");
                System.out.println("enjoy your "+coffee[subMenu]);
            }
            else {
                System.out.println("INVALID INPUT");
            }
        }

        if(mainMenu =='t'){
            if(subMenu< tea.length){
                System.out.println("Welcome to CCD ");
                System.out.println("enjoy your "+tea[subMenu]);
            }
            else {
                System.out.println("INVALID INPUT");
            }
        }

        if(mainMenu =='s'){
            if(subMenu< soup.length){
                System.out.println("Welcome to CCD ");
                System.out.println("enjoy your "+soup[subMenu]);
            }
            else {
                System.out.println("INVALID INPUT");
            }
        }

        if(mainMenu =='b'){
            if(subMenu< beverages.length){
                System.out.println("Welcome to CCD ");

                System.out.println("enjoy your "+beverages[subMenu]);
            }
            else {
                System.out.println("INVALID INPUT");
            }
        }


    }
}
