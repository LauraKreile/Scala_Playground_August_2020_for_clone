import scala.io.Source

object homeWork_Cookbook extends App {

  val fileName = "c:/poem/cookbook.txt"
  //var myText = Seq[String]()

  val myLines = Source.fromFile(fileName).getLines

  //myLines.foreach(println)
  var myText = myLines.toSeq
  //myText = myLines.toSeq
 //myText.foreach(println)

  myText.filter(_.startsWith("MRS. RORER'S CHOCOLATE CAKE")).foreach(println)
 // myText.filter(_.startsWith("MRS. RORER'S CHOCOLATE CAKE",1,1) == "_").foreach(println)
  //myText.filter(_.contains("MRS.")).foreach(println)
  //myText.filter(_.slice(0,10) ==  "MRS. RORER'S CHOCOLATE CAKE").foreach(println)
  //myText.filter(_.startsWith("MRS. ").==(0)).foreach(println)
 //myText.filter(_.split(" ").size).reverse(0)
  //myText.filter(_.matches("^[MRS. RORER'S CHOCOLATE CAKE ].*")).foreach(println)
//  myText.filter(_.slice(0,4) == "MRS").foreach(println)
  //(_.slice(0,4) == "And ")

}
