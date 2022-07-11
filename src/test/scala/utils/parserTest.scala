import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.{Try, Failure, Success}
import org.utils.parser.ArgsParser

object ArgsParserSpec extends AnyFlatSpec with Matchers {
  "The ArgsParser.prepare function" should "return a string map kv." {
    val args = Array("--arg1 test", "--arg2 test2", "--arg3 test3")

    val result = ArgsParser.prepare(args)
    println(result)

    // val args2 = Array("--arg1=test", "--arg2=test2", "--arg3=test3")
    result.getClass shouldBe Map[String, String]

  }

}
