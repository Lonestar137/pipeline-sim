import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.{Try, Failure, Success}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame

import org.utils.content.Reader
import org.utils.content.CSVDataFrame
import org.utils.constants.UniversalConstants._

class ReaderSpec extends AnyFlatSpec with Matchers {
  val spark = SparkSession
    .builder()
    .appName("IngestionJob") // fmt job name here
    .master("local[*]")
    .getOrCreate()
  import spark.implicits._

  "Reader.getCSV" should "return a non-empty CSVDataFrame" in {
    val csvDF: CSVDataFrame = Reader.getCSV(spark, "superstore.csv")

    // println("DF size ", csvDF.df.collect.size)
    csvDF.df.collect.size > 10 shouldBe true

  }
}
