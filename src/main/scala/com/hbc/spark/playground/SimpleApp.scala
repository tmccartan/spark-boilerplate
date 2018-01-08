package com.hbc.spark.playground

import org.apache.spark.sql.{Dataset, SparkSession}

object SimpleApp {

  def main(args : Array[String]): Unit ={

    val logFile = "/web/spark/README.md" // Should be some file on your system
    val spark: SparkSession = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData: Dataset[String] = spark.read.textFile(logFile).cache()
    val numAs: Long = logData.filter(line => line.contains("a")).count()
    val numBs: Long = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }


}
