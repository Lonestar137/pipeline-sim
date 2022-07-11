package org.utils.constants

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

object UniversalConstants {

  val CONFIG: Config = ConfigFactory.load()
  val DATADIR: String = f"${os.pwd}/${CONFIG.getString("DataDir")}"

}
