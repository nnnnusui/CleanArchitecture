package com.github.nnnnusui.cleanarchitecture.example.adapter

import com.github.nnnnusui.cleanarchitecture.example.external.SampleView

object SamplePresenter {
  private val view = SampleView
  def output(): Unit ={
    view.show()
  }
}
