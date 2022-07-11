import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.{Try, Failure, Success}
import org.utils.context.ArgsParser

class ArgsParserSpec extends AnyFlatSpec with Matchers {
  "The ArgsParser.prepare function" should "return a string map kv." in {
    val args = Array("--arg1 test", "--arg2 test2", "--arg3 test3")

    val result = ArgsParser.prepare(args)
    println("RUnning ")
    val x: Map[String, String] = Map("" -> "")

    result.getClass() shouldBe x.getClass
  }

}
