package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BreakAPlate extends JFrame {
    private JLabel plate1, plate2, plate3, prizeLabel;
    private JButton playButton;
    private ImageIcon plateIcon, brokenPlateIcon, placeholderIcon, tigerPlushIcon, stickerIcon;

    public BreakAPlate() {
       
        setTitle("BreakAPlate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        plateIcon = new ImageIcon("plate.gif");
        brokenPlateIcon = new ImageIcon("broken_plate.gif");
        placeholderIcon = new ImageIcon("placeholder.gif");
        tigerPlushIcon = new ImageIcon("tiger_plush.gif");
        stickerIcon = new ImageIcon("sticker.gif");

 
        plate1 = new JLabel(plateIcon);
        plate2 = new JLabel(plateIcon);
        plate3 = new JLabel(plateIcon);
        
        JPanel platesPanel = new JPanel();
        platesPanel.setLayout(new FlowLayout());
        platesPanel.add(plate1);
        platesPanel.add(plate2);
        platesPanel.add(plate3);

       
        prizeLabel = new JLabel(placeholderIcon);
        
      
        playButton = new JButton("Play Again");
        playButton.addActionListener(new PlayAgainListener());

        
        add(platesPanel, BorderLayout.CENTER);
        add(prizeLabel, BorderLayout.SOUTH);
        add(playButton, BorderLayout.NORTH);

      
        setSize(400, 300);
        setVisible(true);
    }

    
    private class PlayAgainListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            int winChance = rand.nextInt(2); 
            
           
            plate1.setIcon(brokenPlateIcon);
            plate2.setIcon(brokenPlateIcon);
            plate3.setIcon(brokenPlateIcon);

   
            if (winChance == 0) {
                prizeLabel.setIcon(tigerPlushIcon);
            } else {
                prizeLabel.setIcon(stickerIcon);
            }
        }
    }

    public static void main(String[] args) {
        new BreakAPlate();
    }
}					