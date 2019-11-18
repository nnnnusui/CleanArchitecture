package com.github.nnnnusui.cleanarchitecture.example.usecase

import com.github.nnnnusui.cleanarchitecture.example.adapter.SamplePresenter
import com.github.nnnnusui.cleanarchitecture.example.entity.Sample

object SampleInteractor {
  private val presenter = SamplePresenter
  def input(inputData: SampleInputData): Unit ={
    val sample = new Sample
    val outputData = SampleOutputData()
    presenter.output(outputData)
  }
}
