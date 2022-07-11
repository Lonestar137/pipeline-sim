package org.utils.content

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import com.typesafe.config.Config

import org.utils.constants.UniversalConstants._

case class CSVDataFrame(df: DataFrame)

object Reader {

  def getCSV(spark: SparkSession, filename: String): CSVDataFrame = {
    val csvDF: CSVDataFrame = CSVDataFrame(
      spark.read.csv(DATADIR + filename)
    )

    csvDF
  }

}
