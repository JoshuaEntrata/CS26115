import java.awt.*;
import java.awt.geom.*;

public class EntrataJK_ProjectPrelims extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        GeneralPath rightArm = new GeneralPath();
        rightArm.moveTo(165, 1000); 
        rightArm.lineTo(158, 968);
        rightArm.lineTo(154, 924);
        rightArm.lineTo(157, 886);
        rightArm.lineTo(160, 864);
        rightArm.lineTo(161, 830);
        rightArm.lineTo(166, 816);
        rightArm.lineTo(197, 839);
        rightArm.lineTo(227, 843);
        rightArm.lineTo(250, 827);
        rightArm.lineTo(265, 823);
        rightArm.lineTo(271, 813);
        rightArm.lineTo(261, 836);
        rightArm.lineTo(257, 854);
        rightArm.lineTo(256, 875);
        rightArm.lineTo(254, 906);
        rightArm.lineTo(254, 945);
        rightArm.lineTo(252, 973);
        rightArm.lineTo(250, 1000);
        rightArm.closePath(); 

        GeneralPath poloShirt = new GeneralPath();
        poloShirt.moveTo(164, 813); 
        poloShirt.lineTo(158, 787);
        poloShirt.lineTo(161, 759);
        poloShirt.lineTo(170, 740);
        poloShirt.lineTo(173, 713);
        poloShirt.lineTo(174, 691);
        poloShirt.lineTo(181, 666);
        poloShirt.lineTo(186, 645);
        poloShirt.lineTo(197, 609);
        poloShirt.lineTo(221, 574);
        poloShirt.lineTo(234, 562);
        poloShirt.lineTo(270, 544);
        poloShirt.lineTo(310, 522);
        poloShirt.lineTo(367, 499);
        poloShirt.lineTo(391, 479);
        poloShirt.lineTo(406, 461);
        poloShirt.lineTo(427, 446);
        poloShirt.lineTo(422, 477);
        poloShirt.lineTo(435, 533);
        poloShirt.lineTo(454, 569);
        poloShirt.lineTo(486, 603);
        poloShirt.lineTo(509, 635);
        poloShirt.lineTo(535, 601);
        poloShirt.lineTo(554, 569);
        poloShirt.lineTo(562, 543);
        poloShirt.lineTo(571, 494);
        poloShirt.lineTo(574, 469);
        poloShirt.lineTo(568, 430);
        poloShirt.lineTo(577, 440);
        poloShirt.lineTo(589, 460);
        poloShirt.lineTo(614, 480);
        poloShirt.lineTo(644, 504);
        poloShirt.lineTo(682, 522);
        poloShirt.lineTo(719, 540);
        poloShirt.lineTo(725, 547);
        poloShirt.lineTo(745, 567);
        poloShirt.lineTo(770, 600);
        poloShirt.lineTo(791, 710);
        poloShirt.lineTo(803, 755);
        poloShirt.lineTo(805, 799);
        poloShirt.lineTo(783, 827); 
        poloShirt.lineTo(740, 836);
        poloShirt.lineTo(705, 835);
        poloShirt.lineTo(705, 884);
        poloShirt.lineTo(704, 919);
        poloShirt.lineTo(704, 968);
        poloShirt.lineTo(705, 1000);
        poloShirt.lineTo(260, 1000);
        poloShirt.lineTo(262, 973);
        poloShirt.lineTo(264, 945);
        poloShirt.lineTo(266, 906);
        poloShirt.lineTo(267, 875);
        poloShirt.lineTo(266, 854);
        poloShirt.lineTo(268, 836);
        poloShirt.lineTo(265, 823);
        poloShirt.lineTo(250, 827);
        poloShirt.lineTo(250, 827);
        poloShirt.lineTo(227, 843);
        poloShirt.lineTo(197, 839);
        poloShirt.lineTo(164, 813);
        poloShirt.closePath(); 

        GeneralPath leftArm = new GeneralPath();
        leftArm.moveTo(783, 827); 
        leftArm.lineTo(740, 836);
        leftArm.lineTo(705, 835);
        leftArm.lineTo(705, 884);
        leftArm.lineTo(704, 919);
        leftArm.lineTo(704, 968);
        leftArm.lineTo(705, 1000);
        leftArm.lineTo(801, 1000);
        leftArm.lineTo(798, 957);
        leftArm.lineTo(790, 906);
        leftArm.lineTo(783, 863);
        leftArm.closePath(); 

        GeneralPath face = new GeneralPath();
        face.moveTo(427, 446);
        face.lineTo(422, 477);
        face.lineTo(435, 533);
        face.lineTo(454, 569);
        face.lineTo(486, 603);
        face.lineTo(509, 635);
        face.lineTo(535, 601);
        face.lineTo(554, 569);
        face.lineTo(562, 543);
        face.lineTo(571, 494);
        face.lineTo(574, 469);
        face.lineTo(568, 430);
        face.lineTo(570, 445);
        face.lineTo(570, 421);
        face.lineTo(583, 399);
        face.lineTo(586, 380);
        face.lineTo(598, 380);
        face.lineTo(610, 368);
        face.lineTo(615, 344);
        face.lineTo(618, 327);
        face.lineTo(611, 316);
        face.lineTo(599, 316);
        face.lineTo(591, 329);
        face.lineTo(579, 250);
        face.lineTo(562, 229);
        face.lineTo(533, 223);
        face.lineTo(517, 221);
        face.lineTo(468, 223);
        face.lineTo(445, 234);
        face.lineTo(430, 254);
        face.lineTo(427, 275);
        face.lineTo(421, 295);
        face.lineTo(417, 326);
        face.lineTo(409, 313);

        face.lineTo(398, 321);
        face.lineTo(390, 332);
        face.lineTo(395, 360);
        face.lineTo(402, 379);
        face.lineTo(410, 382);
        face.lineTo(414, 377);
        face.lineTo(419, 375);
        face.lineTo(422, 400);
        face.lineTo(425, 408);
        face.lineTo(431, 420);
        face.lineTo(431, 440);
        face.closePath();

        GeneralPath chin = new GeneralPath();
        chin.moveTo(431, 420);
        chin.quadTo(501, 490, 570, 421);

        GeneralPath hair = new GeneralPath();
        hair.moveTo(591, 327);
        hair.lineTo(600, 318);
        hair.lineTo(602, 270);
        hair.lineTo(595, 234);
        hair.lineTo(595, 206);
        hair.lineTo(559, 180);
        hair.lineTo(503, 160);
        hair.lineTo(503, 160);
        hair.lineTo(461, 172);
        hair.lineTo(421, 193);
        hair.lineTo(403, 222);
        hair.lineTo(406, 247);
        hair.lineTo(408, 274);
        hair.lineTo(409, 313);
        hair.lineTo(417, 326);
        hair.lineTo(421, 295);
        hair.lineTo(427, 275);
        hair.lineTo(430, 254);
        hair.lineTo(445, 234);
        hair.lineTo(468, 223);
        hair.lineTo(517, 221);
        hair.lineTo(533, 223);
        hair.lineTo(562, 229);
        hair.lineTo(579, 250);
        hair.closePath();

        GeneralPath upperLip = new GeneralPath();
        upperLip.moveTo(469, 389);
        upperLip.lineTo(475, 385);
        upperLip.lineTo(483, 384);
        upperLip.lineTo(501, 382);
        upperLip.lineTo(514, 381);
        upperLip.lineTo(529, 383);
        upperLip.lineTo(540, 389);
        upperLip.lineTo(469, 391);
        upperLip.closePath();

        // Lower Lip
        GeneralPath lowerLip = new GeneralPath();
        lowerLip.moveTo(469, 389);
        lowerLip.lineTo(481, 398);
        lowerLip.lineTo(500, 405);
        lowerLip.lineTo(514, 404);
        lowerLip.lineTo(530, 396);
        lowerLip.lineTo(540, 389);
        lowerLip.quadTo(546, 402, 509, 415);
        lowerLip.quadTo(491, 415, 476, 405);
        lowerLip.quadTo(464, 395, 469, 389);

        GeneralPath rightEyebrow = new GeneralPath();
        rightEyebrow.moveTo(411+30, 275+20);
        rightEyebrow.lineTo(418+30, 269+20);
        rightEyebrow.lineTo(430+30, 270+20);
        rightEyebrow.lineTo(440+30, 272+20);
        rightEyebrow.lineTo(454+30, 278+20);
        rightEyebrow.lineTo(456+30, 283+20);
        rightEyebrow.lineTo(445+30, 281+20);
        rightEyebrow.lineTo(431+30, 281+20);
        rightEyebrow.lineTo(421+30, 282+20);
        rightEyebrow.lineTo(409+30, 280+20);

        GeneralPath leftEyebrow = new GeneralPath();
        leftEyebrow.moveTo(494+30, 284+20);
        leftEyebrow.lineTo(499+30, 278+20);
        leftEyebrow.lineTo(512+30, 275+20);
        leftEyebrow.lineTo(519+30, 272+20);
        leftEyebrow.lineTo(528+30, 271+20);
        leftEyebrow.lineTo(534+30, 275+20);
        leftEyebrow.lineTo(541+30, 280+20);
        leftEyebrow.lineTo(533+30, 284+20);
        leftEyebrow.lineTo(523+30, 283+20);
        leftEyebrow.lineTo(507+30, 282+20);
        leftEyebrow.lineTo(496+30, 284+20);
        leftEyebrow.lineTo(525+30, 277+20);

        Ellipse2D.Double leftEye = new Ellipse2D.Double(530, 315, 30, 20);
        Ellipse2D.Double leftPupil = new Ellipse2D.Double(540, 320, 10, 10); 

        Ellipse2D.Double rightEye = new Ellipse2D.Double(450, 315, 30, 20); 
        Ellipse2D.Double rightPupil = new Ellipse2D.Double(460, 320, 10, 10);

        GeneralPath nose = new GeneralPath();
        nose.moveTo(494, 334);
        nose.lineTo(492, 342);
        nose.lineTo(489, 351);
        nose.lineTo(481, 355);
        nose.lineTo(481, 367);
        nose.lineTo(485, 370);
        nose.lineTo(491, 369);
        nose.lineTo(496, 372);
        nose.lineTo(503, 375);
        nose.lineTo(507, 373);
        nose.lineTo(513, 370);
        nose.lineTo(518, 369);
        nose.lineTo(523, 366);
        nose.lineTo(524, 360);
        nose.lineTo(520, 351);
        nose.lineTo(513, 342);
        nose.lineTo(510, 334);
        
        g2d.setColor(Color.decode("#EAC086"));
        g2d.fill(rightArm);
        g2d.setColor(Color.BLACK);
        g2d.draw(rightArm);

        g2d.setColor(Color.decode("#006400"));
        g2d.fill(poloShirt);
        g2d.setColor(Color.BLACK);
        g2d.draw(poloShirt);

        g2d.setColor(Color.decode("#EAC086"));
        g2d.fill(leftArm);
        g2d.setColor(Color.BLACK);
        g2d.draw(leftArm);
        
        g2d.setColor(Color.decode("#EAC086"));
        g2d.fill(face);
        g2d.setColor(Color.BLACK);
        g2d.draw(face);

        g2d.setColor(Color.BLACK);
        g2d.draw(chin);
        
        g2d.setColor(Color.BLACK);
        g2d.fill(hair);

        g2d.setColor(Color.RED);
        g2d.fill(upperLip);

        g2d.setColor(Color.RED);
        g2d.fill(lowerLip);

        g2d.setColor(Color.BLACK);
        g2d.fill(rightEyebrow);
        
        g2d.setColor(Color.BLACK);
        g2d.fill(leftEyebrow);

        g2d.setColor(Color.WHITE);
        g2d.fill(rightEye);
        g2d.setColor(Color.BLACK);
        g2d.draw(rightEye);

        g2d.setColor(Color.BLACK);
        g2d.fill(rightPupil);

        g2d.setColor(Color.WHITE);
        g2d.fill(leftEye);
        g2d.setColor(Color.BLACK);
        g2d.draw(leftEye);

        g2d.setColor(Color.BLACK);
        g2d.fill(leftPupil);

        g2d.setColor(Color.BLACK);
        g2d.draw(nose); 
        
    }

    public static void main(String[] args) {
        EntrataJK_ProjectPrelims p = new EntrataJK_ProjectPrelims();
        p.setBackground(Color.decode("#87CEEB"));
        p.setTitle("Prelims Project");
        p.setSize(1000, 1000);
        p.setVisible(true);
    }
}
