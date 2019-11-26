package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vendingM {
    // dinero introducido
    static int money;
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
    private JButton GIVEMEMY$Button;


    public vendingM() {

        // escribe "A" en el mainDisplay
        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button1 = mainDisplay.getText() + aButton.getText();
                mainDisplay.setText(button1);
            }
        });

        // escribe "1" en el mainDisplay
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button2 = mainDisplay.getText() + a1Button.getText();
                mainDisplay.setText(button2);
            }
        });

        // escribe "B" en el mainDisplay
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button3 = mainDisplay.getText() + bButton.getText();
                mainDisplay.setText(button3);
            }
        });

        // escribe "2" en el mainDisplay
        b2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button4 = mainDisplay.getText() + b2Button.getText();
                mainDisplay.setText(button4);
            }
        });

        // escribe "C" en el mainDisplay
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button5 = mainDisplay.getText() + cButton.getText();
                mainDisplay.setText(button5);

            }
        });

        // escribe "3" en el mainDisplay
        c3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button6 = mainDisplay.getText() + c3Button.getText();
                mainDisplay.setText(button6);
            }
        });


        // este solo borra un caracter que exista en el mainDisplay
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (mainDisplay.getText().length() > 0)
                    mainDisplay.setText(mainDisplay.getText().substring(0, mainDisplay.getText().length() - 1));

            }
        });

        // al presionar este boton, el usuario hace que los espacios de selecion, precio, la pantalla principal y la del cambio se borren, pero no borra el
        // dinero insertado
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainDisplay.setText(null);
                coinsDisplay.setText(null);
                changeDisplay.setText(null);
                selection.setText(null);
                price.setText(null);
                status.setText(null);
            }
        });

        // al presionar este boton, el programa toma los valores que el usuario escriba en el coinsDisplay, suma todos los numeros validos
        // si no son validos, entonces no lo almacena y espera a que se pongan numeros validos
        INSERTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // se insertan monedas
                while (true) {
                    if (coinsDisplay.getText().equals("1") || coinsDisplay.getText().equals("2") || coinsDisplay.getText().equals("5") || coinsDisplay.getText().equals("10")) {
                        money = money + Integer.parseInt(coinsDisplay.getText());
                        coinsDisplay.setText("");
                        //dinero total para la compra
                        String showMoney = Integer.toString(money);
                        moneyDisplay.setText(showMoney);
                    }
                    // si no son monedas de 1, 2, 5, o 10, se reinicia el ciclo
                    else {
                        coinsDisplay.setText("");
                        return;
                    }
                }


            }
        });


        // al presionar el boton, el programa busca comparar el texto introducido con las validaciones de abajo, si no coincide con ninguna, no hace nada
        // si lo hace, entonces pone el nombre del producto y el precio
        SELECTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // seleccion de producto
                if (mainDisplay.getText().equals("A1")) {
                    selection.setText(A1nombre);
                }
                if (mainDisplay.getText().equals("A2")) {
                    selection.setText(A2nombre);
                }
                if (mainDisplay.getText().equals("A3")) {
                    selection.setText(A3nombre);
                }
                if (mainDisplay.getText().equals("B1")) {
                    selection.setText(B1nombre);
                }
                if (mainDisplay.getText().equals("B2")) {
                    selection.setText(B2nombre);
                }
                if (mainDisplay.getText().equals("B3")) {
                    selection.setText(B3nombre);
                }
                if (mainDisplay.getText().equals("C1")) {
                    selection.setText(C1nombre);
                }
                if (mainDisplay.getText().equals("C2")) {
                    selection.setText(C2nombre);
                }
                if (mainDisplay.getText().equals("C3")) {
                    selection.setText(C3nombre);
                }
                // precio del producto seleccionado
                if (mainDisplay.getText().equals("A1")) {
                    price.setText(String.valueOf(A1$));
                }

                if (mainDisplay.getText().equals("A2")) {
                    price.setText(String.valueOf(A2$));
                }
                if (mainDisplay.getText().equals("A3")) {
                    price.setText(String.valueOf(A3$));
                }
                if (mainDisplay.getText().equals("B1")) {
                    price.setText(String.valueOf(B1$));
                }
                if (mainDisplay.getText().equals("B2")) {
                    price.setText(String.valueOf(B2$));
                }
                if (mainDisplay.getText().equals("B3")) {
                    price.setText(String.valueOf(B3$));
                }
                if (mainDisplay.getText().equals("C1")) {
                    price.setText(String.valueOf(C1$));
                }
                if (mainDisplay.getText().equals("C2")) {
                    price.setText(String.valueOf(C2$));
                }
                if (mainDisplay.getText().equals("C3")) {
                    price.setText(String.valueOf(C3$));
                }

            }
        });
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                // evaluacion de moneyDisplay, si no tiene dinero, entonces no puede hacer la compra, esto evita la falla si se intenta compara algo sin insertar nada.
                if (moneyDisplay.getText().equals("")) {
                    moneyDisplay.setText("");
                    status.setText("Insert money in order to buy");

                } else {
                    // the way to avoid the "EventDispatch", the program didn´t know what to do if the mainDisplay was empty
                    mainDisplay.getText();
                    if (mainDisplay.getText().equals("")) {
                        mainDisplay.setText(null);
                        status.setText("Choose an item");
                    }


                    // cambio de la compra
                    if (mainDisplay.getText().equals("A1")) {
                        if (A1cant > 0) {
                            // calculo y validacion, si no es suficiente, entonces pondra un texto que comunique eso
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        }

                        // si no hay productos, entonces no hara la compra y reseteara los displays, conservando el moneyDisplay.
                        else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }
                    }

                    if (mainDisplay.getText().equals("A2")) {
                        if (A2cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }


                    }

                    if (mainDisplay.getText().equals("A3")) {
                        if (A3cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }


                    }

                    if (mainDisplay.getText().equals("B1")) {
                        if (B1cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }
                    }

                    if (mainDisplay.getText().equals("B2")) {
                        if (B2cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }
                    }
                    if (mainDisplay.getText().equals("B3")) {
                        if (B3cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }
                    }

                    if (mainDisplay.getText().equals("C1")) {
                        if (C1cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }
                    }

                    if (mainDisplay.getText().equals("C2")) {
                        if (C2cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $.";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }
                    }


                    if (mainDisplay.getText().equals("C3"))
                        if (C3cant > 0) {
                            int remains = Integer.parseInt(moneyDisplay.getText()) - Integer.parseInt(price.getText());
                            String broke = "Not enough $. Pick another one";
                            String minus = Integer.toString(remains);
                            moneyDisplay.setText(String.valueOf(money));

                            if (remains >= 0) {
                                int value = Integer.parseInt(price.getText());
                                money = money - value;
                                changeDisplay.setText(minus);
                                moneyDisplay.setText(String.valueOf(money));

                            } else {
                                changeDisplay.setText(broke);
                            }

                            status.setText(afirmative);

                        } else {

                            mainDisplay.setText(null);
                            selection.setText(null);
                            price.setText(null);
                            changeDisplay.setText(null);
                            status.setText(negative);


                        }

                }
            }
        });

        // resetea la variable money y borra el contenido del moneyDsiplay
        GIVEMEMY$Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                money = 0;
                moneyDisplay.setText(null);
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
