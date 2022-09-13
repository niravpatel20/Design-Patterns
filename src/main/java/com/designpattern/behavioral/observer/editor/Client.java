package com.designpattern.behavioral.observer.editor;

public class Client {

    public static void main(String[] args) throws Exception {

        Editor editor = new Editor();

        editor.eventManager.subsribe("open", new LogUpdateListener());
        editor.eventManager.subsribe("save", new EmailNotificationListener());

        editor.openFile("test.txt");
        editor.saveFile();
    }
}
