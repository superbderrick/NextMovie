package superbderrick.github.io.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class MainPageAdapter(fragmentManager:FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(postion: Int): Fragment {
        return when (postion) {
            0 -> BaseFragment()

            else -> {
                return BaseFragment()
            }
        }
    }
}