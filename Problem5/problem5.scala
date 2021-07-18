object problem5 extends App{
  def isEven(n:Int):Boolean=n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean= !(isEven(n))

  def evenSum(n:Int,i:Int=0,sum:Int=0):Int={
    if(i>=n){
      return sum
    }
    return evenSum(n,i+2,sum+i)
}
   println(evenSum(10))
}
