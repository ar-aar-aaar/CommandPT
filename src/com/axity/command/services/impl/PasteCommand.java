package com.axity.command.services.impl;

import com.axity.command.Editor;
import com.axity.command.services.ICommand;

public class PasteCommand extends ICommand {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}