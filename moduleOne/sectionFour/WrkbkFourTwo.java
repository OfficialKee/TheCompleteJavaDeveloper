public class WrkbkFourTwo {
    public static void main(String[] args){

        tipWaiter(23.21);

    }

    public static void tipWaiter(double amtPaid){

        double tip = .15;

        double finalTip = tip * amtPaid;

        System.out.println("$"+finalTip);

    }
    
}