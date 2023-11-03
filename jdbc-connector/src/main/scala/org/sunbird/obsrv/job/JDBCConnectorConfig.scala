package org.sunbird.obsrv.job

import com.typesafe.config.Config

class JDBCConnectorConfig (config: Config, args: Array[String]){

  if (args.length == 0)
    throw new Exception("Please provide dataset id as argument..")

  val datasetId: String = args(0)
  val kafkaServerUrl: String = config.getString("kafka.broker-servers")
  val sparkMasterUrl: String = config.getString("spark.master.url")
  val jdbcConnectionRetry: Int = config.getInt("jdbc.connection.retry")
  val jdbcConnectionRetryDelay: Int = config.getInt("jdbc.connection.retryDelay")

}