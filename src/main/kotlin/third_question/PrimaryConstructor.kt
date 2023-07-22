package third_question




/*
Primary constructor is used to initialize the class.
It is declared at class header.
Primary constructor code is surrounded by parentheses with optional parameter.
 */
class PrimaryConstructor (var name : String, var surname : String) {
}
class PrimaryConstructor2(name: String, surname: String){
    var name : String
    var surname : String
    init {
        this.name = name
        this.surname=surname
    }
}
fun main(){
    val primaryConstructor = PrimaryConstructor("Emil", "Abdurahmanli")
    println(primaryConstructor.name)
    println(primaryConstructor.surname)

    val primaryConstructor2 = PrimaryConstructor2("Emil", "Abdurahmanli")
    println(primaryConstructor2.name)
    println(primaryConstructor2.surname)


            
}