
class Account {
    
    BigDecimal balance = 0.0
    String type
    
    void deposit(BigDecimal addTobalance){
        balance += addTobalance
    }
    
    void withdraw(BigDecimal removeFromBalance){
        balance -= removeFromBalance
    }
    
    BigDecimal plus(Account otherAccount){
        otherAccount.balance + balance
    }
	
	void printingAccount(String format){
		println "Inside printingAccount"+this.toString()
	}
    

}



Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)
BigDecimal total = checking + savings
println total
savings.printingAccount "CSV format"



