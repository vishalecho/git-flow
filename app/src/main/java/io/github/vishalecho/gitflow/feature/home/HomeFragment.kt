package io.github.vishalecho.gitflow.feature.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import io.github.vishalecho.gitflow.R
import io.github.vishalecho.gitflow.feature.feed.FeedFragment

class HomeFragment : Fragment() {

    lateinit var button: Button

    private val feedFragment = FeedFragment.newInstance()

    companion object {

        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_home, container, false)
        button = view.findViewById(R.id.button)
        button.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, feedFragment)
                ?.commitAllowingStateLoss()
        }
        return view
    }

}