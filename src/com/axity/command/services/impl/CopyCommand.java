package com.axity.command.services.impl;

import com.axity.command.Editor;
import com.axity.command.services.ICommand;

public class CopyCommand extends ICommand {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}