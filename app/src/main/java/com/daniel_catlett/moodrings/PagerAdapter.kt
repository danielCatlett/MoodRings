package com.daniel_catlett.moodrings

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm)
{
    override fun getItem(position: Int): Fragment? = when (position)
    {
        0 -> MyDay.newInstance()
        1 -> MyPartner.newInstance()
        2 -> Stats.newInstance()
        else -> null
    }

    override fun getPageTitle(position: Int): CharSequence = when (position)
    {
        0 -> "My Day"
        1 -> "My Partner"
        2 -> "Stats"
        else -> ""
    }

    override fun getCount(): Int = 3
}