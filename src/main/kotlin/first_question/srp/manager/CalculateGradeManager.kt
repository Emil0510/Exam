package first_question.srp.manager

import first_question.srp.istudent.IStudent
import first_question.srp.model.Student

class CalculateGradeManager : IStudent {

    fun calculateGrades(student: Student) : String{
        return student.marks.toString()
    }
}