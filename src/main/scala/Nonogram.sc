def mynonogram(ints: Array[Int]): Array[Int] = {
  ints
    .mkString("")
    .split("0")
    .map(_.size)
    .filter(_ > 0)
}
mynonogram(Array(1,1,1,0,0,1,1,1,1,0,0,1,1))