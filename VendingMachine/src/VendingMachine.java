public class VendingMachine {
    int price=80;
    int balance;
    int total;
    VendingMachine() {
        total=0;
    }
    VendingMachine(int price) {
        this.price = price;
    }
    void showPrompt(){
        System.out.println("Welcome! ");
    }

    void insertMoney(int amount){
        balance = balance + amount;
    }

    void showBalance(){
        System.out.println("Balance: " + balance);
    }

    void getFood(){
        if(balance>=price){
            System.out.println("Here is your food!");
            balance = balance - price;
            total = total+price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
    }
}
