package com.github.nnnnusui.cleanarchitecture.usecase

trait Interactor[Input, Output] extends InputBoundary[Input]
                                   with UsesPresenter[Output] {
  def input(data: Input): Unit = presenter.output(handle(data))
  protected def handle(input: Input): Output
}
