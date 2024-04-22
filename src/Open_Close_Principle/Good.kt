package Open_Close_Principle

// Open-Close Principle
// In this Principle Class should open for extension but close for modification

//example...this WithdrawServiceApp() class don't need to change or modify...
class WithdrawServiceApp{
    fun withdraw(account: BankAccount){
        account.withdraw()
    }
}
abstract class BankAccount(){
    fun Diposit(){
        println("Add Money to AC.")
    }
    abstract fun withdraw()
}
class SavingAccount: BankAccount(){
    override fun withdraw() {
        println("Withdraw From Saving Ac.")
    }
}
class CurrentAccount: BankAccount(){
    override fun withdraw() {
        println("Withdraw From Current Ac.")
    }
}

fun main(){
    val withdrawServiceApp = WithdrawServiceApp()
    withdrawServiceApp.withdraw(SavingAccount())
}
