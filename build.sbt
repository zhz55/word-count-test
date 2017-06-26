name := "word-count-test"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0",
  "org.apache.spark" % "spark-streaming_2.11" % "2.1.1",
  "org.apache.spark" % "spark-streaming-kafka-0-10_2.11" % "2.1.1"
)

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

// += "org.apache.kafka" % "kafka_2.11" % "0.10.2.0"

//libraryDependencies += "org.apache.hadoop" %% "hadoop-common" % "2.6.0"
libraryDependencies += "org.apache.kudu" % "kudu-client" % "1.2.0"