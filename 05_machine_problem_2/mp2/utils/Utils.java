package mp2.utils;

import java.awt.Graphics2D;
import java.awt.geom.*;
import static mp2.panels.CrossPanel.crossGeneralPath;

public class Utils {
    public static Area[] crossAndChristmasTreeArea(Graphics2D g2d) {
        GeneralPath cross = crossGeneralPath();
        GeneralPath christmasTree = new GeneralPath();
        christmasTree.append(starGeneralPath(), false);
        christmasTree.append(treeGeneralPath(), false);
        christmasTree.append(baseGeneralPath(), false);

        Area crossArea = new Area(cross);
        Area christmasTreeArea = new Area(christmasTree);

        return new Area[] { crossArea, christmasTreeArea };
    }

    public static GeneralPath starGeneralPath() {
        GeneralPath star = new GeneralPath();
        star.moveTo(300, 100);
        star.lineTo(320, 120);
        star.lineTo(300, 140);
        star.lineTo(280, 120);
        star.lineTo(300, 100);
        return star;
    }

    public static GeneralPath treeGeneralPath() {
        GeneralPath tree = new GeneralPath();
        tree.moveTo(300, 140);
        tree.lineTo(370, 290);  // right first level
        tree.lineTo(350, 290);
        tree.lineTo(410, 440);  // right second level
        tree.lineTo(390, 440);
        tree.lineTo(450, 590);  // right third level
        tree.lineTo(150, 590);  // left third level
        tree.lineTo(210, 440); 
        tree.lineTo(190, 440);  // left second level
        tree.lineTo(250, 290);
        tree.lineTo(230, 290);  // left first level
        tree.lineTo(300, 140);
        return tree;
    }

    public static GeneralPath baseGeneralPath() {
        GeneralPath base = new GeneralPath();
        base.moveTo(315, 590);
        base.lineTo(315, 620);
        base.lineTo(285, 620);
        base.lineTo(285, 590);
        base.lineTo(315, 590);
        return base;
    }
}
