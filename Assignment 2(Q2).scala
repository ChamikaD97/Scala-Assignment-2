/*2.  Imagine the owner of a movie theater who has complete freedom in setting ticket prices.
The more he charges, the fewer the people who can afford tickets. 
In a recent experiment the owner determined a precise relationship between the price of a ticket and average attendance.  
At a price of Rs 15.00 per ticket, 120 people attend a performance. 
Decreasing the price by  5 Rupees increases attendance by 20 and increasing the price by  5 Rupees decreases attendance by 20. 
Unfortunately, the increased attendance also comes at an increased cost. Every performance costs the owner Rs.500. Each attendee costs another 3 Rupees. 
The owner would like to know the exact relationship between profit and ticket price so that he can determine the price at which he can make the highest profit. 
Implement a functional program to find out the best ticket price.
}*/

object Assignment2 extends App {

  def attendees(ticketPrice :Double):Double = 120-(ticketPrice-15)*4
  
  def cost(ticketPrice :Double): Double = 500+3*attendees(ticketPrice)
  
  def income(ticketPrice :Double): Double = attendees(ticketPrice)*ticketPrice
  
  def profit(ticketPrice :Double): Double =income(ticketPrice)-cost(ticketPrice)

  print(profit(5)," ",profit(10)," ",profit(15)," ",profit(20)," ",profit(25)," ",profit(30)," ",profit(35)," ",profit(40)," ",profit(45))
}
