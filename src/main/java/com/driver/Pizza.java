package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    boolean cheese=false,toppings=false,takeAway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
      if(isVeg)
      {
          price=300;
      }
      else {
          price=400;
      }

        // your code goes here
        bill+="Base Price Of The Pizza: "+getPrice()+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheese==false)
        {
            cheese=true;
            bill+="Extra Cheese Added: 80\n";
            price+=80;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(toppings==false)
        {
            toppings=true;
            if(isVeg)
            {
                bill+="Extra Toppings Added: 70\n";
                price+=70;
            }
            else {
                bill+="Extra Toppings Added: 120\n";
                price+=120;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway==false)
        {
            takeAway=true;
            bill+="Paperbag Added: 20\n";
            price+=20;
        }

    }

    public String getBill(){
        // your code goes here
        bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
}
