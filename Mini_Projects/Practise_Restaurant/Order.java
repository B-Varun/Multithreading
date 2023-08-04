package com.hotel.order;

public class Order{
public String itemName;
public String custId;
/*
public boolean isCustomerOrder;
public boolean isOrderPlaced;
public boolean isFoodPrepared;
public boolean isOrderDelivered;
*/

/*
public Order(){
 this("","");
}
*/

public Order(String item, String cId){
 itemName = item;
 custId = cId;
/* isCustomerOrder = false;
 isOrderPlaced = false;
 isFoodPrepared = false;
 isOrderDelivered = false;
 */
}

/*
public void setIsCustomerOrder(boolean v){
 isCustomerOrder = v;
}

public boolean getIsCustomerOrder(boolean v){
 return isCustomerOrder;
}

public void isOrderPlaced(boolean v){
 isOrderPlaced = v;
}

public boolean getIsOrderPlaced(){
 return isOrderPlaced;
}

public void setIsFoodPrepared(boolean v){
 isFoodPrepared = v;
}

public boolean getIsFoodPrepared(){
 return isFoodPrepared;
}

public void setIsOrderDelivered(boolean v){
 isOrderDelivered = v;
}

public boolean getIsOrderDelivered(){
 return isOrderDelivered;
}
*/

public String getItemName(){
 return itemName;
}

public String getCustomerId(){
 return custId;
}

}