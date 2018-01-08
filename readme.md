## Spark boilerplate project.



Require spark to be installed ( if using brew its easy)

    brew install spark
    
To run a job locally, run the following

		spark-submit \
      --class com.hbc.spark.playground.WordCount \
      --master local[8] \
       target/scala-2.11/spark.playground-0.0.1.jar \
  

If not using brew you will have to find spark-submit where you install spark