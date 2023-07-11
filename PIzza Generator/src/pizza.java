public class pizza {

    private int price;
    private Boolean veg;
private int extraCheesePrice=100;
private int extraToppingsPrice=150;
private int backPackPrice=20;
private int basePizzaPrice;
private boolean isExtraCheeseadded=false ;
    private boolean isExtraToppingsadded=false;
    private boolean istakeawaychosen=false;


    public pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        } else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
 public void addExtraCheese(){
        isExtraCheeseadded=true;

   this.price +=extraCheesePrice;
 }
public void addExtraToppings(){
        isExtraToppingsadded=true;

    this.price +=extraToppingsPrice;
}

public void takeaway(){
        istakeawaychosen=true;

    this.price +=backPackPrice;
}
public void getBill(){
        String bill="";
    System.out.println("Pizza-"+basePizzaPrice);
if(isExtraCheeseadded){
    bill +="Extra cheese added:"+extraCheesePrice+ "\n";
}
if(isExtraToppingsadded){
    bill +="Extra toppings added:"+extraToppingsPrice+"\n";
}
if(istakeawaychosen){
    bill +="take away chosen:"+backPackPrice+"\n";
}
   bill +="Bill: "+this.price +"\n";
    System.out.println(bill);
}
}

