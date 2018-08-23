package com.daniel_catlett.moodrings

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_my_day.*

class MyDay : Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view: View = inflater!!.inflate(R.layout.fragment_my_day, container, false)
        val btn: Button  = view.find(R.id.submitButton)
        submitButton.setOnClickListener(this)
        return view
    }

    companion object
    {
        @JvmStatic
        fun newInstance(): MyDay = MyDay()
    }

    fun onClick(v: View?)
    {
        when (v?.id) {
            R.id.submitButton -> {
                submitButton.setText("Its working!")
            }

            else -> {
            }
        }
    }
}