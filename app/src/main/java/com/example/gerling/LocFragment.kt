package com.example.gerling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class LocFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_loc, container, false)
    }

    companion object{
        fun newInstance(): LocFragment{
            val fragment = LocFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
