package com.example.mywhatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.new_whatsapp.CallFragment
import com.example.new_whatsapp.ChatFragment
import com.example.new_whatsapp.StatusFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
    return 3
    }

    override fun createFragment(position: Int): Fragment {
        return  when (position) {
            0 -> {
                ChatFragment()
            }
            1 -> {
                StatusFragment()
            }
            2 -> {
                CallFragment()
            }
            else -> {
            Fragment()
            }
        }
    }
}
