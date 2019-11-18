package com.github.nnnnusui.cleanarchitecture.usecase

trait OutputBoundary[Output] {
  def output(outputData: Output): Unit
}
