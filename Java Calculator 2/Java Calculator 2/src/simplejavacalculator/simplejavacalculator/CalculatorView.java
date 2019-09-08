package simplejavacalculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorView
    implements ActionListener {
    private final JFrame frame;
    private final JPanel panel;
    private final JTextArea text;
    private final JButton numericButtons[], butAdd, butMinus, butMultiply, butDivide,
            butEqual, butCancel, butSquareRoot, butSquare, butOneDevidedBy,
            butCos, butSin, butTan, butxpowerofy, butlog, butrate, butabs;

    private final CalculatorModel calculatorModel;

    private final String[] buttonValue = { "0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9"};

    public CalculatorView() {
        frame = new JFrame("CalculatorModel PH");
        frame.setResizable(false);
        panel = new JPanel(new FlowLayout());

        text = new JTextArea(2, 25);
        numericButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numericButtons[i] = new JButton( String.valueOf( i));
        }

        butAdd = new JButton("+");
        butMinus = new JButton("-");
        butMultiply = new JButton("*");
        butDivide = new JButton("/");
        butEqual = new JButton("=");
        butSquareRoot = new JButton("√");
        butSquare = new JButton("x*x");
        butOneDevidedBy = new JButton("1/x");
        butCos = new JButton("Cos");
        butSin = new JButton("Sin");
        butTan = new JButton("Tan");
        butxpowerofy = new JButton("x^y");
        butlog = new JButton("log10(x)");
        butrate = new JButton("x%");
        butabs = new JButton("abs(x)");

        butCancel = new JButton("C");

        calculatorModel = new CalculatorModel();
    }

    public void init() {
        frame.setVisible(true);
        frame.setSize(330, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.add(text);

        for (int i = 1; i < 10; i++) {
            panel.add( numericButtons[i]);
            numericButtons[i].addActionListener( this);
        }
        panel.add( numericButtons[0]);
        numericButtons[0].addActionListener( this);

        addCalculatorButtons();
        addButtonListeners();
    }

    private void addButtonListeners()
    {
        butAdd.addActionListener(this);
        butMinus.addActionListener(this);
        butMultiply.addActionListener(this);
        butDivide.addActionListener(this);
        butSquare.addActionListener(this);
        butSquareRoot.addActionListener(this);
        butOneDevidedBy.addActionListener(this);
        butCos.addActionListener(this);
        butSin.addActionListener(this);
        butTan.addActionListener(this);
        butxpowerofy.addActionListener(this);
        butlog.addActionListener(this);
        butrate.addActionListener(this);
        butabs.addActionListener(this);

        butEqual.addActionListener(this);
        butCancel.addActionListener(this);
    }

    private void addCalculatorButtons()
    {
        panel.add(butAdd);
        panel.add(butMinus);
        panel.add(butMultiply);
        panel.add(butDivide);
        panel.add(butSquare);
        panel.add(butSquareRoot);
        panel.add(butOneDevidedBy);
        panel.add(butCos);
        panel.add(butSin);
        panel.add(butTan);
        panel.add(butxpowerofy);
        panel.add(butlog);
        panel.add(butrate);
        panel.add(butabs);

        panel.add(butEqual);
        panel.add(butCancel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final Object source = e.getSource();

        for (int i = 0; i < 10; i++) {
            if (source == numericButtons[i]) {
                text.replaceSelection(buttonValue[i]);
                return;
            }
        }

        if (source == butAdd) {
            writer( calculatorModel.calculateBi( CalculatorModel.BinaryOperands.add, reader()));
        }

        if (source == butMinus) {
            writer( calculatorModel.calculateBi( CalculatorModel.BinaryOperands.minus, reader()));
        }

        if (source == butMultiply) {
            writer( calculatorModel.calculateBi( CalculatorModel.BinaryOperands.multiply,
                                                 reader()));
        }

        if (source == butDivide) {
            writer( calculatorModel
                .calculateBi( CalculatorModel.BinaryOperands.divide, reader()));
        }
        if (source == butxpowerofy) {
            writer( calculatorModel
                .calculateBi( CalculatorModel.BinaryOperands.xPowerOfy, reader()));
        }

        if (source == butSquare) {
            writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.square,
                                                   reader()));
        }

        if (source == butSquareRoot) {
            writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.squareRoot,
                                                   reader()));
        }

        if (source == butOneDevidedBy) {
            writer( calculatorModel.calculateMono(
                CalculatorModel.SpecialOperands.oneDividedBy, reader()));
        }

        if (source == butCos) {
            writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.cos,
                                                   reader()));
        }

        if (source == butSin) {
            writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.sin,
                                                   reader()));
        }

        if (source == butTan) {
            writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.tan,
                                                   reader()));
        }
        if (source == butlog) {
            writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.log,
                                                   reader()));
        }
         if (source == butrate) {
            writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.rate,
                                                   reader()));
        }
         if(source == butabs){
             writer( calculatorModel.calculateMono( CalculatorModel.SpecialOperands.abs, reader()));
         }

        if (source == butEqual) {
            writer( calculatorModel.calculateEqual( reader()));
        }

        if (source == butCancel) {
            writer( calculatorModel.reset());
        }

        text.selectAll();
    }

    public Double reader() {
        Double number;
        String calculatorText;
        calculatorText = text.getText();
        number = Double.valueOf(calculatorText);

        return number;
    }

    public void writer(final Double num) {
        if (Double.isNaN(num)) {
            text.setText("");
        } else {
            text.setText(Double.toString(num));
        }
    }
}
