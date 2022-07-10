package basejob

import org.apache.spark.sql.SparkSession

object BaseJob {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("SparkJob") // fmt job name here
      .master("local[*]")
      .getOrCreate()
    import spark.implicits._
  }
}
