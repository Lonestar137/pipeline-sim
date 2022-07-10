import org.apache.spark.sql.SparkSession
import com.typesafe.config.ConfigFactory
import com.typesafe.config.Config

object IngestionJob {

  def main(args: Array[String]): Unit = {

    // var params: Config = ConfigFactory.parseArray(args)

    val spark = SparkSession
      .builder()
      .appName("IngestionJob") // fmt job name here
      .master("local[*]")
      .getOrCreate()
    import spark.implicits._

  }

}
