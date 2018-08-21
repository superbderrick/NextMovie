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
            0 -> MovieFragment()
            1 -> LocalFragment()

            else -> {
                return BaseFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Movie"
            1 -> "History"
            else -> {
                return "Like"
            }
        }
    }
}