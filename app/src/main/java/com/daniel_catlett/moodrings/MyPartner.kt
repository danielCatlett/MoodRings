package com.daniel_catlett.moodrings

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyPartner : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater!!.inflate(R.layout.fragment_my_partner, container, false)

    companion object
    {
        @JvmStatic
        fun newInstance(): MyPartner = MyPartner()
    }
}
