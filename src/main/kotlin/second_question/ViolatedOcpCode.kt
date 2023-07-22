package second_question
enum class Payment{
    CREDIT_CARD,PAYPAL
}
class ViolatedOcpCode {
    fun processPayment(payment: Payment){
        when(payment){
            Payment.PAYPAL -> paypal()
            Payment.CREDIT_CARD -> creditCard()
        }
    }
    fun paypal(){

    }
    fun creditCard(){

    }
}