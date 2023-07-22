package first_question.srp.factory

import first_question.srp.manager.AllInformationManager
import first_question.srp.manager.CalculateGradeManager
import first_question.srp.model.Student

class StudentFacade {

    private var allInformationManager = AllInformationManager()
    private var calculateGradeManager  = CalculateGradeManager()

    fun printAllInformation(student: Student){
        allInformationManager.printAllInformation(student)
    }
    fun calculateGrade(student: Student) : String{
        return calculateGradeManager.calculateGrades(student)
    }
}