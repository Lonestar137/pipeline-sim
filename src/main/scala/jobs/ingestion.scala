import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame

import org.utils.content.Reader
import org.utils.content.CSVDataFrame
import org.utils.constants.UniversalConstants._

object IngestionJob {

  def main(args: Array[String]): Unit = {

    // var params: Config = ConfigFactory.parseArray(args)

    val spark = SparkSession
      .builder()
      .appName("IngestionJob") // fmt job name here
      .master("local[*]")
      .getOrCreate()
    import spark.implicits._

    // os -- implicit variable from os-lib dep.  os.pwd == project root dir

    val Superstore: CSVDataFrame = Reader.getCSV(spark, "superstore.csv")

    // Superstore.df.show(10)

  }

}
