package com.github.cln89.meme_plugin.ui.toolwindow;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.util.Objects;

public class MemePluginToolWindow {
    private JPanel MemePanel;
    private JLabel MemeLabel;

    public MemePluginToolWindow(ToolWindow toolWindow) {
        toolWindow.setTitle("Code Analyzer");
        MemeLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/toolWindow/meme.jpg"))));
    }

    public JPanel getContent() {
        return MemePanel;
    }
}
