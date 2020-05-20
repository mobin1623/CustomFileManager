package com.mobin.filemanager.listeners;

import android.support.v7.widget.SearchView;

import com.mobin.filemanager.adapters.CustomAdapter;

/**
 * Created by Mobin on 20/05/2020.
 */
public class SearchViewListener implements SearchView.OnQueryTextListener {

    CustomAdapter mAdapter;

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        mAdapter.getFilter().filter(newText);
        return false;
    }

    public SearchViewListener(CustomAdapter customAdapter) {
        this.mAdapter = customAdapter;
    }
}
