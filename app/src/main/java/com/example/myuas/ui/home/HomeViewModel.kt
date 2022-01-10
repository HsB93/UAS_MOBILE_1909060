package com.example.myuas.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nama = Nirla Nahidatus Salam'\n' Nim = 19090060'\n' Semester = 5'\n' Politeknik Harapan Bersama"
    }
    val text: LiveData<String> = _text
}