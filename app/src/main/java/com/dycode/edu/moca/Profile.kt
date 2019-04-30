package com.dycode.edu.moca


import android.os.Bundle
import android.support.annotation.NonNull
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.*

class Profile : Fragment() {
    companion object{
        fun getInstance():Profile = Profile();
    }
    @Nullable
    override fun onCreateView(@NonNull
        inflater: LayoutInflater, @Nullable container: ViewGroup?,@Nullable savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.profile, container, false)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu!!.clear();
        super.onCreateOptionsMenu(menu, inflater)
    }

}
