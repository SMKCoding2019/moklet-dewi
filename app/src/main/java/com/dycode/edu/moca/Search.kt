package com.dycode.edu.moca

import android.os.Bundle
import android.support.annotation.NonNull
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.*
import android.widget.Toast


class Search : Fragment() {
    companion object {
        fun getInstance(): Search = Search();
    }

    @Nullable
    override fun onCreateView(
        @NonNull
        inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search, container, false)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu!!.clear();
        inflater.inflate(R.menu.toolbar_search, menu);
        super.onCreateOptionsMenu(menu, inflater)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.search -> {
                Toast.makeText(context,"Search Clicked",Toast.LENGTH_SHORT).show()}
        }
        return super.onOptionsItemSelected(item)
    }

}