package com.github.nnnnusui.cleanarchitecture.example.external

import com.github.nnnnusui.cleanarchitecture.example.adapter.SampleViewModel

object SampleView {
  def show(viewModel: SampleViewModel): Unit ={
    println(s"view: $viewModel")
  }
}
