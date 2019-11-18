package com.github.nnnnusui.cleanarchitecture.example.adapter

import com.github.nnnnusui.cleanarchitecture.example.external.SampleView
import com.github.nnnnusui.cleanarchitecture.example.usecase.SampleOutputData

object SamplePresenter {
  private val view = SampleView
  def output(outputData: SampleOutputData): Unit ={
    val viewModel = SampleViewModel()
    view.show(viewModel)
  }
}
