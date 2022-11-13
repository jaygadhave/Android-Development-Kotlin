package SalarySheet

fun main(args: Array<String>) {
    println("Enter your salary?")
    val a = readLine() ?: ""
    val salary = a.toInt()
    //salary = 25000

    val DA = salary * 0.10
    val MA = 300
    val HRA = salary * 0.075
    val PF = salary * 0.125

    val grossSalary = salary + DA + HRA + MA

    val netSalary = grossSalary - PF

    println("Salary : $salary")
    println("MA : $MA")
    println("DA : $DA")
    println("HRA : $HRA")
    println("PF : $PF")
    println("Gross salary : $grossSalary")
    println("net salary : $netSalary")

}