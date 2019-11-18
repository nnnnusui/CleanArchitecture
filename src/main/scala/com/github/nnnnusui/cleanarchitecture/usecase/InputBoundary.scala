package com.github.nnnnusui.cleanarchitecture.usecase

trait InputBoundary[Input] {
  def input(inputData: Input): Unit
}
