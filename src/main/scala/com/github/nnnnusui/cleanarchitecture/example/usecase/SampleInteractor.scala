package com.github.nnnnusui.cleanarchitecture.example.usecase

import com.github.nnnnusui.cleanarchitecture.example.entity.Sample
import com.github.nnnnusui.cleanarchitecture.usecase.Interactor

trait SampleInteractor extends Interactor[SampleInputData, SampleOutputData] {
  protected def handle(input: SampleInputData): SampleOutputData = {
    val sample = new Sample
    val outputData = SampleOutputData()
    outputData
  }
}
