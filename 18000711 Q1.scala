/*3. Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount. 
Shipping costs Rs. 3 for the first 50 copy and 75 cents for each additional copy. 
What is the total wholesale cost for 60 copies?
}*/



object Q3 extends App { 
  def tot(copies : Int) : Double =
  {
  if (copies  > 50 ) ((copies * 24.95 )*60/100)+(50*3)+ ((copies-50)*0.75)
  else ((copies * 24.95 )*60/100)+(50*3)
  
  }
  print("Total wholesale cost for 60 copies = Rs." + tot(60))
}
