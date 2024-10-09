package mp2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import mp2.panels.ChristmasTreePanel;
import mp2.panels.CrossLineAndCurvePanel;
import mp2.panels.CrossPanel;
import mp2.panels.IntersectionPanel;
import mp2.panels.RelativeDiffCrossTreePanel;
import mp2.panels.RelativeDiffTreeCrossPanel;
import mp2.panels.SymmetricDiffPanel;
import mp2.panels.UnionPanel;

public class EntrataJOSHUA_MP2 extends Frame {
    public static void main(String[] args) {
        EntrataJOSHUA_MP2 mp2 = new EntrataJOSHUA_MP2();
        mp2.setTitle("Machine Problem 2: General Path and Areas");
        mp2.setBackground(Color.lightGray);
        mp2.setSize(1000, 1000);
        mp2.setForeground(Color.BLACK);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Cross - Lines and Curves", new CrossLineAndCurvePanel());
        tabbedPane.addTab("Cross - General Path", new CrossPanel());
        tabbedPane.addTab("Christmas Tree", new ChristmasTreePanel());
        tabbedPane.addTab("Union", new UnionPanel());
        tabbedPane.addTab("Intersection", new IntersectionPanel());
        tabbedPane.addTab("Symmetric Difference", new SymmetricDiffPanel());
        tabbedPane.addTab("Relative Diff (Tree-Cross)", new RelativeDiffTreeCrossPanel());
        tabbedPane.addTab("Relative Diff (Cross-Tree)", new RelativeDiffCrossTreePanel());

        mp2.add(tabbedPane);
        mp2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        mp2.setVisible(true);
    }
}
