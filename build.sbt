import Dependencies._

ThisBuild / scalaVersion := "2.11.12"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.pipeline"
ThisBuild / organizationName := "pipeline"

lazy val spark = Seq(
  "org.apache.spark" %% "spark-core" % "2.4.8",
  "org.apache.spark" %% "spark-hive" % "2.4.8",
  "org.apache.spark" %% "spark-sql" % "2.4.8"
)

lazy val configLoader = Seq(
  "com.typesafe" % "config" % "1.4.2"
)

lazy val fs = Seq(
  "com.lihaoyi" %% "os-lib" % "0.8.1"
)

lazy val root = (project in file("."))
  .settings(
    name := "pipeline-sim",
    libraryDependencies += scalaTest % Test,
    libraryDependencies ++= spark,
    libraryDependencies ++= configLoader,
    libraryDependencies ++= fs
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
