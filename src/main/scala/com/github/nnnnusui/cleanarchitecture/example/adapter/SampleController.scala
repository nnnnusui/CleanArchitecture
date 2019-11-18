package com.github.nnnnusui.cleanarchitecture.example.adapter

import com.github.nnnnusui.cleanarchitecture.example.usecase.{SampleInputData, SampleInteractor}
import com.github.nnnnusui.cleanarchitecture.usecase.InputBoundary

object SampleController {
  private val interactor: InputBoundary[SampleInputData] = new SampleInteractor with HasSamplePresenter
  def control(): Unit ={
    val inputData = SampleInputData()
    interactor.input(inputData)
  }
}