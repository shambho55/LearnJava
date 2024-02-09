class RyanAndMonicaJob implements Runnable{

private final String name;

private final BankAccount account;

private final int amountToSpeed;

RyanAndMonicaJob(String name,BankAccount account,int amountToSpeed){

this.name = name;

this.account = account;

this.amountToSpeed = amountToSpeed;

}

public void run(){

goShopping(amountToSpeed);

}

private void goShopping(int amount){

//synchronized(account){

//if(account.getBalance() >= amount){

System.out.println(name + " is about to spend");

account.spend(name,amount);

System.out.println(name + " finishes spending");

/*}

else{

System.out.println("Sorry, not enough for " + name);

}
*/

//}

}

}
