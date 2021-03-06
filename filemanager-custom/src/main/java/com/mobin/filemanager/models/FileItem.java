package com.mobin.filemanager.models;

import com.mobin.filemanager.interfaces.ITrackSelection;
import com.mobin.filemanager.utils.AssortedUtils;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by Mobin on 20/05/2020
 */
public class FileItem implements ITrackSelection {

    private File file;
    private boolean isSelected;
    private String fileSize;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public FileItem(File file) {
        this.file = file;
        try {
            if (file.isDirectory()) {
                setFileSize(FileUtils.byteCountToDisplaySize(AssortedUtils.GetMinimumDirSize(file)) +  " | ");
            } else {
                setFileSize(FileUtils.byteCountToDisplaySize(FileUtils.sizeOf(file)) +  " | ");
            }
        } catch (Exception e) {
            setFileSize("Unknown | ");
        }
    }
}
