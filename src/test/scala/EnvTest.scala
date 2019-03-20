import org.apache.spark.sql.SparkSession

object EnvTest{
  def main(args: Array[String]): Unit = {
    println("hello world")
    val spark = SparkSession.builder()
      .appName("env test")
      .master("local[*]")
      .getOrCreate()
    println("spark version is " + spark.version)
  }
}