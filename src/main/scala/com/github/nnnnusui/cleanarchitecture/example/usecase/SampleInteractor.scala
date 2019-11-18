package com.github.nnnnusui.cleanarchitecture.example.usecase

import com.github.nnnnusui.cleanarchitecture.example.adapter.SamplePresenter
import com.github.nnnnusui.cleanarchitecture.example.entity.Sample
import com.github.nnnnusui.cleanarchitecture.usecase.{InputBoundary, OutputBoundary}

object SampleInteractor extends InputBoundary[SampleInputData] {
  private val presenter: OutputBoundary[SampleOutputData] = SamplePresenter
  def input(inputData: SampleInputData): Unit ={
    val sample = new Sample
    val outputData = SampleOutputData()
    presenter.output(outputData)
  }
}
