package com.mobin.filemanager.listeners;

import java.io.File;

/**
 * Created by Aditya on 4/18/2017.
 */
public interface OnFileChangedListener {
    void onFileChanged(File updatedFile);
}
