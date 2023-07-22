package second_question.ocp.service

import second_question.ocp.ipayment.IPayment

class PaymentService {
    fun pay(iPayment: IPayment){
        iPayment.pay()
    }
}