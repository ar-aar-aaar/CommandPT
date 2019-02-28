package com.axity.command.services;

import com.axity.command.Editor;

public abstract class ICommand {
    protected Editor editor;
    private String backup;


    public ICommand(Editor editor) {
        this.editor = editor;
    }

    protected void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);

    }

    public abstract boolean execute();
}
