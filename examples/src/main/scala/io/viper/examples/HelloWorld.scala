package io.viper.examples


import _root_.io.viper.core.server.router._
import io.viper.common.{NestServer, RestServer}
import java.util.Map


object Main {
  def main(args: Array[String]) {
    NestServer.run(8080, new RestServer {
      def addRoutes {
        get("/hello", new RouteHandler {
          def exec(args: Map[String, String]): RouteResponse = new Utf8Response("world")
        })
      }
    })
  }
}