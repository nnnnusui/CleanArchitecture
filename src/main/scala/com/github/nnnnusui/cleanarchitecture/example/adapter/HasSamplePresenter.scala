package com.github.nnnnusui.cleanarchitecture.example.adapter

import com.github.nnnnusui.cleanarchitecture.example.usecase.SampleOutputData
import com.github.nnnnusui.cleanarchitecture.usecase.{OutputBoundary, UsesPresenter}

trait HasSamplePresenter extends UsesPresenter[SampleOutputData]{
  override protected val presenter: OutputBoundary[SampleOutputData] = SamplePresenter
}
