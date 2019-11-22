package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class vendingM {
    // cosas de interfaz
        // el panel donde se muestran cosas
    private JPanel genericoJava;
        // el campo que muestra el texto que ponen los botones, tambeien muestra laPresentacion
    private JTextField mainDisplay;
        // el boton del metodo change, muestra el cociente de la compra si acaso el insert es mayor que el precio
    private JButton change;
    private JButton c3Button;
    private JButton aButton;
    private JButton b2Button;
    private JButton a1Button;
    private JButton bButton;
    private JButton cButton;
    private JButton ENTERButton;
    private JButton INSERTButton;
    private JButton DELETEButton;
    private JButton CLEARButton;
    private JTextField changeDisplay;
    private JTextField coinsDisplay;
    private JTextField price;
    private JTextField selection;
    private JTextField moneyDisplay;
    private JButton SELECTButton;
    private JTextField status;

    // dinero introducido
     static int money;


    // nombres de los productos
    private static String A1nombre = "Oreo";
    private static String A2nombre = "Chokis brownie";
    private static String A3nombre = "Marias";
    private static String B1nombre = "Oreo gold";
    private static String B2nombre = "Galleta del costco";
    private static String B3nombre = "Galleta generica 1";
    private static String C1nombre = "Galleta generica 2";
    private static String C2nombre = "Galleta generica 3";
    private static String C3nombre = "Galleta generica 4";

    //Strings del status, estos avisan al usuario si hay producto que vender, en caso de que haya, entonces dira "afirmative", si no "negative"
    private static String afirmative = "Yes";
    private static String negative = "No, choose another one";

    //precios de los productos
     static int A1$ = 12;
     static int A2$ = 10;
     static int A3$ = 12;
     static int B1$ = 10;
     static int B2$ = 12;
     static int B3$ = 10;
     static int C1$ = 10;
     static int C2$ = 12;
     static int C3$ = 10;

    // cantidad de productos
     static int A1cant = 12;
     static int A2cant = 10;
     static int A3cant = 12;
     static int B1cant = 10;
     static int B2cant = 12;
     static int B3cant = 10;
     static int C1cant = 10;
     static int C2cant = 12;
     static int C3cant = 10;

      static int chan;
    static String remaining = Integer.toString(chan);


    public vendingM() {

        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button1 = mainDisplay.getText()+aButton.getText();
                mainDisplay.setText(button1);
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button2 = mainDisplay.getText()+a1Button.getText();
                mainDisplay.setText(button2);
            }
        });
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button3 = mainDisplay.getText()+ bButton.getText();
                mainDisplay.setText(button3);
            }
        });
        b2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button4 = mainDisplay.getText()+ b2Button.getText();
                mainDisplay.setText(button4);
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               String button5 = mainDisplay.getText()+ cButton.getText();
                mainDisplay.setText(button5);

            }
        });

        c3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button6 = mainDisplay.getText()+ c3Button.getText();
                mainDisplay.setText(button6);
            }
        });





        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(mainDisplay.getText().length()>0)
                mainDisplay.setText(mainDisplay.getText().substring(0, mainDisplay.getText().length()-1));

            }
        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            mainDisplay.setText(null);
            coinsDisplay.setText(null);
            changeDisplay.setText(null);
            selection.setText(null);
            price.setText(null);
            }
        });


        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                // cambio de la compra
                if (selection.getText().equals("A1")){
                if(A1cant>0)
                    {
                        A1cant = A1cant - 1;
                        int remains = Integer.parseInt(String.valueOf(moneyDisplay.getText())) - Integer.parseInt(String.valueOf(price.getText()));
                        chan = remains;
                        changeDisplay.setText(remaining);

                        status.setText(afirmative);

                    }
                else
                {

                    mainDisplay.setText(null);
                    selection.setText(null);
                    price.setText(null);
                    changeDisplay.setText(null);
                    status.setText(negative);


                }
                }

                if (selection.getText().equals("A2")){
                if (A2cant>0)
                    {

                        int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                        String remains = Integer.toString(remaining);
                        changeDisplay.setText(remains);
                        A2cant = A2cant - 1;
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                    }
                else
                {

                    mainDisplay.setText(null);
                    selection.setText(null);
                    price.setText(null);
                    changeDisplay.setText(null);
                    status.setText(negative);


                }
                }

                if (selection.getText().equals("A3")){
                if (A3cant>0)
                    {
                        int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                        String remains = Integer.toString(remaining);
                        changeDisplay.setText(remains);
                        A3cant = A3cant - 1;
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                    }
                else
                {

                    mainDisplay.setText(null);
                    selection.setText(null);
                    price.setText(null);
                    changeDisplay.setText(null);
                    status.setText(negative);


                }
                }

                if (selection.getText().equals("B1")) {
                    if (B1cant > 0) {
                        int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                        String remains = Integer.toString(remaining);
                        changeDisplay.setText(remains);
                        B1cant = B1cant - 1;
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                    }
                    else
                    {

                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                        status.setText(negative);


                    }
                }

                if (selection.getText().equals("B2")) {
                    if (B2cant > 0) {
                        int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                        String remains = Integer.toString(remaining);
                        changeDisplay.setText(remains);
                        B2cant = B2cant - 1;
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                    }
                    else
                    {

                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                        status.setText(negative);


                    }
                }

                if (selection.getText().equals("B3")){
                if (B3cant>0)
                    {
                        int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                        String remains = Integer.toString(remaining);
                        changeDisplay.setText(remains);
                        B3cant = B3cant - 1;
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                    }
                else
                {

                    mainDisplay.setText(null);
                    selection.setText(null);
                    price.setText(null);
                    changeDisplay.setText(null);
                    status.setText(negative);


                }
                }

                if (selection.getText().equals("C1")){
                if (C1cant>0)
                    {
                        int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                        String remains = Integer.toString(remaining);
                        changeDisplay.setText(remains);
                        C1cant = C1cant - 1;
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                    }
                else
                {

                    mainDisplay.setText(null);
                    selection.setText(null);
                    price.setText(null);
                    changeDisplay.setText(null);
                    status.setText(negative);


                }
                }

                if (selection.getText().equals("C2")){
                if (C2cant>0)
                    {
                        int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                        String remains = Integer.toString(remaining);
                        changeDisplay.setText(remains);
                        C2cant = C2cant - 1;
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                    }
                     // si no hay stock, reinicia el mainDisplay, selection, price, changeDisplay y pone que no hay stock, que elija otro
                     else
                    {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                    }

                }

                    {

                    }

                if (selection.getText().equals("C3"))
                if (C3cant>0)
                {
                    int remaining = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(String.valueOf(price));
                    String remains = Integer.toString(remaining);
                    changeDisplay.setText(remains);
                    C3cant = C3cant-1;
                    mainDisplay.setText(null);
                    selection.setText(null);
                    price.setText(null);
                    changeDisplay.setText(null);
                    status.setText(afirmative);

                }
                else
                {
                    {
                        mainDisplay.setText(null);
                        selection.setText(null);
                        price.setText(null);
                        changeDisplay.setText(null);
                        status.setText(negative);

                    }
                }

            }
        });
        INSERTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // se insertan monedas
                while (true) {
                    if (coinsDisplay.getText().equals("1")||coinsDisplay.getText().equals("2")||coinsDisplay.getText().equals("5")||coinsDisplay.getText().equals("10"))
                    {
                        money = money + Integer.parseInt(coinsDisplay.getText());
                        coinsDisplay.setText("");
                        //dinero total para la compra
                        String showMoney =  Integer.toString(money);
                        moneyDisplay.setText("$ " +showMoney);
                    }
                    // si no son monedas de 1, 2, 5, o 10, se reinicia el ciclo
                    else
                    {
                        coinsDisplay.setText("");
                        return;
                    }
                }








            }
        });


        SELECTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // seleccion de producto
                if(mainDisplay.getText().equals("A1"))
                {
                    selection.setText(A1nombre);
                }
                if(mainDisplay.getText().equals("A2"))
                {
                    selection.setText(A2nombre);
                }
                if(mainDisplay.getText().equals("A3"))
                {
                    selection.setText(A3nombre);
                }
                if(mainDisplay.getText().equals("B1"))
                {
                    selection.setText(B1nombre);
                }
                if(mainDisplay.getText().equals("B2"))
                {
                    selection.setText(B2nombre);
                }
                if(mainDisplay.getText().equals("B3"))
                {
                    selection.setText(B3nombre);
                }
                if(mainDisplay.getText().equals("C1"))
                {
                    selection.setText(C1nombre);
                }
                if(mainDisplay.getText().equals("C2"))
                {
                    selection.setText(C2nombre);
                }
                if(mainDisplay.getText().equals("C3"))
                {
                    selection.setText(C3nombre);
                }
                // precio del producto seleccionado
                if (mainDisplay.getText().equals("A1"))
                {
                    price.setText(String.valueOf(A1$));
                }

                if (mainDisplay.getText().equals("A2"))
                {
                    price.setText(String.valueOf(A2$));
                }
                if (mainDisplay.getText().equals("A3"))
                {
                    price.setText(String.valueOf(A3$));
                }
                if (mainDisplay.getText().equals("B1"))
                {
                    price.setText(String.valueOf(B1$));
                }
                if (mainDisplay.getText().equals("B2"))
                {
                    price.setText(String.valueOf(B2$));
                }
                if (mainDisplay.getText().equals("B3"))
                {
                    price.setText(String.valueOf(B3$));
                }
                if (mainDisplay.getText().equals("C1"))
                {
                    price.setText(String.valueOf(C1$));
                }
                if (mainDisplay.getText().equals("C2"))
                {
                    price.setText(String.valueOf(C2$));
                }
                if (mainDisplay.getText().equals("C3"))
                {
                    price.setText(String.valueOf(C3$));
                }

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("vendingM");
        frame.setContentPane(new vendingM().genericoJava);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
