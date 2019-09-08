package com.generationsgeneral.app;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class SimpleJavaCalculator {

    public static void main(String[] args) {
        UI uiCal = new UI();
        uiCal.init();
    }

    public enum O1
    {
        normal, add, minus, multiply, divide , xpowerofy
    }

    public enum O2
    {
        square, squareRoot, oneDevidedBy, cos, sin, tan ,log , rate, abs
    }

    public static class Cal
    {


        private Double num1, num2;
        private O1 mode = O1.normal;

        private Double calO() {
            if (mode == O1.normal) {
                return num2;
            }
            if (mode == O1.add) {
                return num1 + num2;
            }
            if (mode == O1.minus) {
                return num1 - num2;
            }
            if (mode == O1.multiply) {
                return num1 * num2;
            }
            if (mode == O1.divide) {
                return num1 / num2;
            }
            if (mode == O1.xpowerofy) {
                return pow(num1,num2);
            }

            // never reach
            throw new Error();
        }

        public Double calculateBi( O1 newMode, Double num) {
            if (mode == O1.normal) {
                num2 = 0.0;
                num1 = num;
                mode = newMode;
                return Double.NaN;
            } else {
                num2 = num;
                num1 = calO();
                mode = newMode;
                return num1;
            }
        }

        public Double caEqual( Double num) {
            return calculateBi( O1.normal, num);
        }

        public Double reset() {
            num2 = 0.0;
            num1 = 0.0;
            mode = O1.normal;

            return Double.NaN;
        }

        public Double caMono( O2 newMode, Double num) {
            if (newMode == O2.square) {
                return num * num;
            }
            if (newMode == O2.squareRoot) {
                return Math.sqrt(num);
            }
            if (newMode == O2.oneDevidedBy) {
                return 1 / num;
            }
            if (newMode == O2.cos) {
                return Math.cos(num);
            }
            if (newMode == O2.sin) {
                return Math.sin(num);
            }
            if (newMode == O2.tan) {
                return Math.tan(num);
            }
            if (newMode == O2.log) {
                return log10(num);
            }
            if (newMode == O2.rate) {
                return num / 100;
            }
            if(newMode == O2.abs){
                return Math.abs(num);
            }



            // never reach
            throw new Error();
        }

    }

    public static class UI implements ActionListener
    {
        private final JFrame frame;
        private final JPanel p;
        private final JTextArea t;
        private final JButton but[], butAdd, butMinus, butMultiply, butDivide,
            butEqual, butCancel, butSquareRoot, butSquare, butOneDevidedBy,
            butCos, butSin, butTan, butxpowerofy, butlog, butrate, butabs;
        private final Cal calc;

        private final String[] buttonValue = { "0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9"};

        public UI() {
            frame = new JFrame("Cal PH");
            frame.setResizable(false);
            p = new JPanel( new FlowLayout());

            t = new JTextArea( 2, 25);
            but = new JButton[10];
            for (int i = 0; i < 10; i++) {
                but[i] = new JButton(String.valueOf(i));
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

            calc = new Cal();
        }

        public void init() {
            frame.setVisible(true);
            frame.setSize(330, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add( p );

            p.add( t );

            for (int i = 1; i < 10; i++) {
                p.add( but[i]);
                but[i].addActionListener(this);
            }
            p.add( but[0]);
            but[0].addActionListener(this);

            p.add( butAdd);
            p.add( butMinus);
            p.add( butMultiply);
            p.add( butDivide);
            p.add( butSquare);
            p.add( butSquareRoot);
            p.add( butOneDevidedBy);
            p.add( butCos);
            p.add( butSin);
            p.add( butTan);
            p.add( butxpowerofy);
            p.add( butlog);
            p.add( butrate);
            p.add( butabs);

            p.add( butEqual);
            p.add( butCancel);

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

        @Override
        public void actionPerformed( ActionEvent e) {
            final Object o = e.getSource();

            for (int i = 0; i < 10; i++) {
                if (o == but[i]) {
                    t.replaceSelection( buttonValue[i]);
                    return;
                }
            }

            if (o == butAdd) {
                wr( calc.calculateBi( O1.add, calc()));
            }

            if (o == butMinus) {
                wr( calc.calculateBi( O1.minus, calc()));
            }

            if (o == butMultiply) {
                wr( calc.calculateBi( O1.multiply,
                                      calc()));
            }

            if (o == butDivide) {
                wr( calc
                           .calculateBi( O1.divide, calc()));
            }
            if (o == butxpowerofy) {
                wr( calc
                           .calculateBi( O1.xpowerofy, calc()));
            }

            if (o == butSquare) {
                wr( calc.caMono( O2.square,
                                 calc()));
            }

            if (o == butSquareRoot) {
                wr( calc.caMono( O2.squareRoot,
                                 calc()));
            }

            if (o == butOneDevidedBy) {
                wr( calc.caMono(
                    O2.oneDevidedBy, calc()));
            }

            if (o == butCos) {
                wr( calc.caMono( O2.cos,
                                 calc()));
            }

            if (o == butSin) {
                wr( calc.caMono( O2.sin,
                                 calc()));
            }

            if (o == butTan) {
                wr( calc.caMono( O2.tan,
                                 calc()));
            }
            if (o == butlog) {
                wr( calc.caMono( O2.log,
                                 calc()));
            }
            if (o == butrate) {
                wr( calc.caMono( O2.rate,
                                 calc()));
            }
            if(o == butabs){
                wr( calc.caMono( O2.abs, calc()));
            }

            if (o == butEqual) {
                wr( calc.caEqual( calc()));
            }

            if (o == butCancel) {
                wr( calc.reset());
            }

            t.selectAll();
        }

        public Double calc() {
            Double num;
            String str;
            str = t.getText();
            num = Double.valueOf(str);

            return num;
        }

        public void wr( final Double num) {
            if (Double.isNaN(num)) {
                t.setText( "");
            } else {
                t.setText( Double.toString( num));
            }
        }
    }


}