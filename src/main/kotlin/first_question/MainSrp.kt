package first_question

import first_question.srp.factory.StudentFacade
import first_question.srp.model.Student

fun main(){
    val student = Student("Emil", 18, 100)
    val studentFacade = StudentFacade()
    studentFacade.printAllInformation(student)
    studentFacade.calculateGrade(student)
}