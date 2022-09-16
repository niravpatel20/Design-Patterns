package com.designpattern.creational.factory;

public class Client {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLog();
    }

    private static void runBusinessLog() {
        dialog.renderWindow();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }
}
