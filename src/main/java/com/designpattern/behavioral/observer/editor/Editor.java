package com.designpattern.behavioral.observer.editor;

import java.io.File;

public class Editor {

    EventManager eventManager;
    private File file;

    public Editor(){
        eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        eventManager.notify("open", file.getName());
    }

    public void saveFile() throws Exception {
        if(this.file == null){
            throw new Exception("Please open a file first!");
        } else {
            eventManager.notify("save", file.getName());
        }
    }

}
