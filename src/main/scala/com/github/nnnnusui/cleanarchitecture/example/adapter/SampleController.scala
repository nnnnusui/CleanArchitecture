package com.github.nnnnusui.cleanarchitecture.example.adapter

import com.github.nnnnusui.cleanarchitecture.example.usecase.{SampleInputBoundary, SampleInputData, SampleInteractor}

object SampleController {
  private val interactor: SampleInputBoundary = SampleInteractor
  def control(): Unit ={
    val inputData = SampleInputData()
    interactor.input(inputData)
  }
}