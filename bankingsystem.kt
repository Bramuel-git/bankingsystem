package abstraction

interface Account{
    fun checkbalance()
    fun deposit(depo:Double)
    fun withdraw(withdrw:Double)
}
class Acc:Account{
    var balance=0.0

    override fun checkbalance(){
        println("Your balance is $balance. Thank you!")
    }

    override fun withdraw(withdrw: Double) { if (balance<withdrw){
       println("You have insufficient balance")}
        else{
        balance-=withdrw
    }
    }
    override fun deposit(depo: Double) {
        balance+=depo
    }

    override fun toString(): String {
        return "Acc(balance=$balance)"
    }
}

fun main(args:Array<String>) {
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    val user1=Acc()
    user1.deposit(70000.0)
    user1.withdraw(113004.0)
    println("User1 balance is "+user1.toString()+"Thank you!")
println("==========-==========-============-=============-===========-==========")
    val user2=Acc()
    user2.deposit(47000.0)
    user2.withdraw(7000.0)
    println("User2 balance is "+user2.toString()+"Thank you!")
    println("==========-==========-============-==========-==========-==========")
    val user3=Acc()
    user3.deposit(94000.22)
    user3.withdraw(41000.0)
    println("User3 balance is "+user3.toString()+"Thank you!")
    println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲")
