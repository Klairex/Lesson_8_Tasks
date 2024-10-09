package Task2;

 class Invoice {
     private String model;
     private String description;
     private int quantity;
     private double price;

     double getAmount(){
         return quantity*price;
     }
     void setModel(String model){
         this.model = model;
     }
     String getModel(){
         return model;
     }
     void setDescription(String description){
         this.description = description;
     }
     String getDescription(){
         return description;
     }
     void setQuantity(int quantity){
         if(quantity<0){this.quantity = 0;}
         else{this.quantity = quantity;}
     }
     int getQuantity(){
         return quantity;
     }
     void setPrice(double price){
         if(price<0){this.price = 0;}
         else{this.price = price;}
     }
     double getPrice(){
         return price;
     }
     Invoice(String model,String description,int quantity,double price){
         setModel(model);
         setDescription(description);
         setQuantity(quantity);
         setPrice(price);
     }


}
