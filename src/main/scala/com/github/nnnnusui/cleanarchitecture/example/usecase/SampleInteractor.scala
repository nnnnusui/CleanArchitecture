package com.github.nnnnusui.cleanarchitecture.example.usecase

import com.github.nnnnusui.cleanarchitecture.example.entity.Sample
import com.github.nnnnusui.cleanarchitecture.usecase.{InputBoundary, UsesPresenter}

trait SampleInteractor extends InputBoundary[SampleInputData]
                          with UsesPresenter[SampleOutputData]{
  def input(inputData: SampleInputData): Unit ={
    val sample = new Sample
    val outputData = SampleOutputData()
    presenter.output(outputData)
  }
}
