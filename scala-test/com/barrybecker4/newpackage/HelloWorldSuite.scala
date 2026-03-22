package com.barrybecker4.newpackage

import org.scalatest.funsuite.AnyFunSuite

class HelloWorldSuite extends AnyFunSuite {

  test("greeting is the expected hello-world string") {
    assertResult("Hello world!")(HelloWorld.greeting)
  }
}