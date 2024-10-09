package Task2;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Samsung 24ABC","Monitor Samsunt 24inch",5,12000);
        System.out.println("     Invoice\nModel : "+invoice.getModel()+"\nDescriere produs : "+invoice.getDescription()+"\nPret total : "+invoice.getAmount());
    }
}
