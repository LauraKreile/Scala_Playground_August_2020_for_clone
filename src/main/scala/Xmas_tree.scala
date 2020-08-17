object Xmas_tree extends App {

  for (i <- 0 until 5) {
    for (e <- 0 until 5 - i) {
      print(" ")
    }
    for (a <- 0 until (2 * i + 1)) {
      print("*")
    }
    println()
  }
}