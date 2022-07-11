package org.utils.context

// Object which parses an Array[String] object and returns transformed variable.
object ArgsParser {
  def prepare(args: Array[String]): Map[String, String] = {
    args
      .sliding(2, 2) // selects 2 elements at a time and steps 2 elements
      .zipWithIndex // adds an index to the elements
      .map({ case (arr, i) =>
        (i + 1).toString -> arr.map(a => "s3://" + a.toString).mkString(",")
      })
      .toMap
  }
}
