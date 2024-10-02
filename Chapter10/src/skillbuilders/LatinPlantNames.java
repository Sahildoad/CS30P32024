package skillbuilders;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LatinPlantNames extends JFrame {

   
    private JComboBox<String> plantComboBox;
    private JLabel latinNameLabel;

    public LatinPlantNames() {
       
        setTitle("Latin Plant Names");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

     
        String[] plantNames = {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"};
        plantComboBox = new JComboBox<>(plantNames);
        plantComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handlePlantSelection();
            }
        });

      
        latinNameLabel = new JLabel("Select a plant to see its Latin name");

     
        add(new JLabel("Select a plant name:"));
        add(plantComboBox);
        add(latinNameLabel);

        setVisible(true);
    }

    
    private void handlePlantSelection() {
        String plantName = (String) plantComboBox.getSelectedItem();
        switch (plantName) {
            case "basil":
                latinNameLabel.setText("Ocimum");
                break;
            case "lavender":
                latinNameLabel.setText("Lavandula spica");
                break;
            case "parsley":
                latinNameLabel.setText("Apium");
                break;
            case "peppermint":
                latinNameLabel.setText("Mentha piperita");
                break;
            case "saffron":
                latinNameLabel.setText("Crocus");
                break;
            case "sage":
                latinNameLabel.setText("Salvia");
                break;
            default:
                latinNameLabel.setText("Unknown plant");
        }
    }

    public static void main(String[] args) {
        new LatinPlantNames();
    }
}
