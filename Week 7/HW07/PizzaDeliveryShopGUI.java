import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * PizzaDeliveryShopGUI.java
 *
 * A GUI for a pizza delivery shop.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version October 21, 2016
 *
 */
public class PizzaDeliveryShopGUI extends JFrame implements ActionListener {

    public final String TITLE = "Pizza Shop";
    public final int FRAME_WIDTH = 700;
    public final int FRAME_HEIGHT = 400;

    private JButton submit = new JButton ("Submit");

    private JPanel optionsPanel = new JPanel();

    private JPanel selectPizzaSizePanel = new JPanel();
    private JRadioButton smallSize = new JRadioButton("Small");
    private JRadioButton mediumSize = new JRadioButton("Medium");
    private JRadioButton largeSize = new JRadioButton("Large");
    private ButtonGroup sizes = new ButtonGroup();

    private JPanel selectPizzaStylePanel = new JPanel();
    private String[] styles = {"Margherita", "Prosciutto", "Diavola", "Verdure", "Calzone"};
    private JComboBox selectStyles = new JComboBox(styles);

    private JPanel selectPizzaToppingsPanel = new JPanel();
    private JCheckBox[] toppings = {new JCheckBox("Garlic"), new JCheckBox ("Jalapenos"), new JCheckBox ("Extra cheese"), new JCheckBox ("Bacon")};

    private JPanel outputPanel = new JPanel();

    private JTextArea output = new JTextArea();

    public PizzaDeliveryShopGUI() {
        setTitle(TITLE);
        setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        submit.addActionListener(this);
        setupGUI();
        pack();
        setResizable(false);
        setVisible(true);
    }

    public void setupGUI() {
        setupMainPanel();
    }

    public void setupMainPanel() {
        setupOptionsPanel();
        setupOutputPanel();
        add(submit);
    }

    public void setupOptionsPanel() {
        add(optionsPanel);
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        optionsPanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Options"));
        optionsPanel.add(selectPizzaSizePanel);

        selectPizzaSizePanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Select your pizza size"));
        sizes.add(smallSize);
        sizes.add(mediumSize);
        sizes.add(largeSize);
        selectPizzaSizePanel.add(smallSize);
        selectPizzaSizePanel.add(mediumSize);
        selectPizzaSizePanel.add(largeSize);


        optionsPanel.add(selectPizzaStylePanel);
        selectPizzaStylePanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Select your pizza style"));
        selectPizzaStylePanel.add(selectStyles);

        optionsPanel.add(selectPizzaToppingsPanel);
        selectPizzaToppingsPanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Choose your toppings"));

        for (int i = 0; i < toppings.length; i++) {

            selectPizzaToppingsPanel.add(toppings[i]);

        }
    }

    public String getPizzaSize() {
        JRadioButton selectedSize = null;

        if (smallSize.isSelected()) {
            selectedSize = smallSize;
        } else if (mediumSize.isSelected()) {
            selectedSize = mediumSize;
        } else if (largeSize.isSelected()) {
            selectedSize = largeSize;
        } else {
            return "Please choose a size.";
        }

        return selectedSize.getText();
    }

    public String getPizzaStyle() {
        return selectStyles.getSelectedItem().toString();
    }

    public String getPizzaToppings() {

        String styles = "";

        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i].isSelected()) {
                styles += toppings[i].getText() + "|";
            } else {
                styles = "No Toppings";
            }
        }

        return styles;
    }

    public void setupOutputPanel() {
        add(outputPanel);
        output.setEditable(false);
        outputPanel.setLayout(new BorderLayout());
        outputPanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Output"));
        outputPanel.add(output);
    }

    public void actionPerformed(ActionEvent e) {
        output.setText(returnOutput());
    }

    public String returnOutput() {
        String output = "Your custom pizza \n" +
                        "Size: " + getPizzaSize() + "\n" +
                        "Style: " + getPizzaStyle() + "\n" +
                        "Toppings: " + getPizzaToppings();
        return output;
    }

    public static void main(String[] args) {
        PizzaDeliveryShopGUI demo = new PizzaDeliveryShopGUI();
    }
}















