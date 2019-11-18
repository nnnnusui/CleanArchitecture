package com.github.nnnnusui.cleanarchitecture.example.adapter

import com.github.nnnnusui.cleanarchitecture.example.usecase.{SampleInputData, SampleInteractor}

object SampleController {
  private val interactor = SampleInteractor
  def control(): Unit ={
    val inputData = SampleInputData()
    interactor.input(inputData)
  }
}