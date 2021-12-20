package com.example.fragmentpractice_jaewhi.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentpractice_jaewhi.R

class FirstFragment : Fragment() {

//  FirstFragment.kt 와 fragment_first.xml을 이어주는 코드
    override fun onCreateView(
//      listview에서는 Layinflater를 다른 변수로 선언헀다면 onCreateView 클래스에선 기본으로 변수를(inflater) 제공해준다.
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

}