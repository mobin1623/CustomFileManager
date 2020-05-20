package com.mobin.filemanager.listeners;

import java.io.File;

/**
 * Created by Mobin on 20/05/2020.
 */
public interface OnFileChangedListener {
    void onFileChanged(File updatedFile);
}
