package first_question.srp.manager

import first_question.srp.istudent.IStudent
import first_question.srp.model.Student

class AllInformationManager : IStudent {

    fun printAllInformation(student : Student){
        print(student.name)
        print(student.marks)
        print(student.age)
    }

}