package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    boolean ExtraCheese;
    boolean ExtraToppings;
    boolean isBill;
    boolean isPaperBag;

    int Cheese;
    int Toppings;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
      if(isVeg)
      {
          price=300;
          Toppings=70;

      }
      else {
          price=400;
          Toppings=120;
      }

        // your code goes here
        Cheese=80;
        bill+="Base Price Of The Pizza: "+getPrice()+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       if(ExtraCheese==false)
       {
           ExtraCheese=true;
           price+=Cheese;
       }


    }

    public void addExtraToppings(){
        // your code goes here
       if(ExtraToppings==false)
       {
           ExtraToppings=true;
           price+=Toppings;
       }

    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBag==false)
        {
            isPaperBag=true;
            price+=20;
        }

    }

    public String getBill(){
        // your code goes here
       if(isBill==false)
       {
           isBill=true;

           if(ExtraCheese)
           {
               bill+="Extra Cheese Added: "+Cheese+"\n";
           }

           if(ExtraToppings)
           {
               bill+="Extra Toppings Added: "+Toppings+"\n";
           }

           if(isPaperBag)
           {
               bill+="Paperbag Added: 20\n";
           }

           bill+="Total Price: "+price+"\n";
       }
        return this.bill;
    }
}
