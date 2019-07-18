package leet_code.easy

object IPDefanging {
  def defangIp(ip: String): String = {
    ip.replace(".", "[.]")
  }
}
