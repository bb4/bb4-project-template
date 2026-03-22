// Copyright by Barry G. Becker, 2023-2026. Licensed under MIT License: http://www.opensource.org/licenses/MIT
package com.barrybecker4.newpackage

object HelloWorld:
  val greeting: String = "Hello world!"

@main def run(): Unit =
  println(HelloWorld.greeting)
