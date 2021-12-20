package com.example.fragmentpractice_jaewhi.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentpractice_jaewhi.R
import kotlinx.android.synthetic.main.fragment_first.*

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
//  동작에 관한 코드는 onActivityCreated 에서 짜야함.
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//      fragment에서는 자동완성으로 선택해도 잘 동작된다.
        changeTextBtn.setOnClickListener {

            contentTxt.text = "안녕하세요."

        }
    
        toastBtn.setOnClickListener {

            Toast.makeText(context!!, "프래그먼트의 토스트", Toast.LENGTH_SHORT).show()
            
        }

    }

}