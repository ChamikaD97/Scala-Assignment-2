/*1. Company XYZ & Co. pays all its employees Rs.150 per normal working hour and Rs. 75 per OT hour.
A typical employee works 40 (normal) and 20(OT) hours per week has to pay 10% tax.
 Develop a functional program that determines the take home salary of an employee from the number of working hours and OT hours given.
}*/


object Assignment2 extends App {

  def normalSalary(hours :Int) = hours*150

  def otSalary(hours :Int): Int = hours*75

  def tax(sal :Double): Double = sal*0.1

  def fullSalary(wH :Int,otH :Int): Double = normalSalary(wH)+otSalary(otH)

  def takehomeSal(wH :Int,otH :Int): Double = fullSalary(wH,otH)-tax(fullSalary(wH,otH))

  print("Salary = "+takehomeSal(40,20))

}
