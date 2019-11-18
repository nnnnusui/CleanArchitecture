package com.github.nnnnusui.cleanarchitecture.usecase

trait UsesPresenter[Output] {
  protected val presenter: OutputBoundary[Output]
}
