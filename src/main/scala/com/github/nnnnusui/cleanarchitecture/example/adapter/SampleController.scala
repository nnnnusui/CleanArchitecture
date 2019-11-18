package com.github.nnnnusui.cleanarchitecture.example.adapter

import com.github.nnnnusui.cleanarchitecture.example.usecase.SampleInteractor

object SampleController {
  private val interactor = SampleInteractor
  def control(): Unit ={
    interactor.input()
  }
}