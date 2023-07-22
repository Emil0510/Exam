package second_question

import second_question.ocp.manager.CreditCardManager
import second_question.ocp.manager.PayPalManager
import second_question.ocp.service.PaymentService

fun main(){
    val paymentService = PaymentService()
    paymentService.pay(CreditCardManager())
    paymentService.pay(PayPalManager())
}