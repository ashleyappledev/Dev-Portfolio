import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator extends JFrame{

    ImageIcon sheldon = new ImageIcon("src/UI/sheldon.png");
    ImageIcon bond = new ImageIcon("src/UI/JamesBond.png");
    ImageIcon indy = new ImageIcon("src/UI/Indy500.png");
    ImageIcon area51 = new ImageIcon("src/UI/Area51.png");
    ImageIcon decOfIndep = new ImageIcon("src/UI/1776.png");
    ImageIcon monstersInc = new ImageIcon("src/UI/2319.png");
    ImageIcon pi = new ImageIcon("src/UI/pi.png");
    ImageIcon emergency = new ImageIcon("src/UI/emergency.png");
    ImageIcon iLoveYou = new ImageIcon("src/UI/ILoveYou.png");
    ImageIcon boilingPoint = new ImageIcon("src/UI/boilingWater.png");
    ImageIcon speedOfLight = new ImageIcon("src/UI/speedOfLight.png");
    ImageIcon zero = new ImageIcon("src/UI/zero.png");
    ImageIcon december25 = new ImageIcon("src/UI/december25.png");
    ImageIcon july4 = new ImageIcon("src/UI/july4.png");
    ImageIcon moonLanding = new ImageIcon("src/UI/moonLanding.jpg");
    ImageIcon pageNotFound = new ImageIcon("src/UI/pageNotFound.png");
    ImageIcon doReMi = new ImageIcon("src/UI/doReMi.png");
    ImageIcon aThounsHours = new ImageIcon("src/UI/1000HoursLater.jpg");
    ImageIcon fourScore = new ImageIcon("src/UI/fourScore.png");
    ImageIcon jennysNumber = new ImageIcon("src/UI/jennysNumber.png");
    ImageIcon itsOver9000 = new ImageIcon("src/UI/itsOver1000.png");
    ImageIcon year2012 = new ImageIcon("src/UI/2012.png");
    ImageIcon bigBrother = new ImageIcon("src/UI/bigBrother.png");
    ImageIcon jackpot = new ImageIcon("src/UI/jackpot.png");
    ImageIcon magic8ball = new ImageIcon("src/UI/magic8Ball.png");
    ImageIcon quarterLifeCrisis = new ImageIcon("src/UI/quarterLifeCrisis.png");
    ImageIcon eliteEthicalHacker = new ImageIcon("src/UI/eliteHackerMode.png");
    ImageIcon worstPassword = new ImageIcon("src/UI/worstPassword.png");
    ImageIcon firstIphone = new ImageIcon("src/UI/firstIphone.png");
    ImageIcon divideByZero = new ImageIcon("src/UI/divideByZero.png");
    ImageIcon maxLevel = new ImageIcon("src/UI/maxLevel.png");
    ImageIcon oneMillion = new ImageIcon("src/UI/oneMillion.png");
    ImageIcon oneBillion = new ImageIcon("src/UI/oneBillion.png");
    ImageIcon leaguesUnder = new ImageIcon("src/UI/leaguesUnderTheSea.png");
    ImageIcon axialTilt = new ImageIcon("src/UI/axialTilt.png");


    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;


    private JPanel JavaCalculator;
    private JTextField textField1;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;



    private void getOperator (String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public JavaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btnOne.getText();
                textField1.setText(btnOneText);

            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() + btnTwo.getText();
                textField1.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField1.getText() + btnThree.getText();
                textField1.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText= textField1.getText() + btnFour.getText();
                textField1.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField1.getText() + btnFive.getText();
                textField1.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() + btnSix.getText();
                textField1.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() + btnSeven.getText();
                textField1.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() + btnEight.getText();
                textField1.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() + btnNine.getText();
                textField1.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField1.getText() + btnZero.getText();
                textField1.setText(btnZeroText);
            }
        });


        //COMPUTATIONS
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        break;
                    case'/':
                        if (Double.parseDouble(textField1.getText()) == 0) {
                            JOptionPane.showMessageDialog(null, "ERROR --- CANNOT DIVIDE BY ZERO \n or who knows what would happen...",
                                    "0 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, divideByZero);
                            textField1.setText("ERROR - CLEAR TO CONTINUE");
                        }
                        total2 = total1 / Double.parseDouble(textField1.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                }



                textField1.setText(Double.toString(total2));
                total1 = 0;

                if (total2 == 1776) {
                    JOptionPane.showMessageDialog(null, "When in the Course of human events...", "1776 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, decOfIndep);
                } else if (total2 == 73) {
                    JOptionPane.showMessageDialog(textField1, "You found Sheldons Favorite Number!", "73 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, sheldon);
                } else if (total2 == 51) {
                    JOptionPane.showMessageDialog(null, "The truth is out there!", "51 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, area51);
                } else if (total2 == 500) {
                    JOptionPane.showMessageDialog(null,"Welcome to INDY 500!", "500 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, indy);
                } else if (total2 == .007) {
                    JOptionPane.showMessageDialog(null, "Bond... James Bond", ".007 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, bond);
                } else if (total2 == 2319) {
                    JOptionPane.showMessageDialog(null, "2319! We have a 2319!" , "2319 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, monstersInc);
                } else if (total2 == 3.14) {
                    JOptionPane.showMessageDialog(null, "3.1415926535897932384626... phew! Is that enough?!", "3.14 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, pi);
                } else if (total2 == 911) {
                    JOptionPane.showMessageDialog(null, "EMERGENCY", "911 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, emergency);
                } else if (total2 == 143) {
                    JOptionPane.showMessageDialog(null, "Don't you forget it!", "143 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, iLoveYou);
                } else if (total2 == 212) {
                    JOptionPane.showMessageDialog(null, "Ok, time to add the noodles...", "212 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, boilingPoint);
                } else if (total2 == 299792458) {
                    JOptionPane.showMessageDialog(null, "Traveling at LIGHT SPEED", "299,792,458 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, speedOfLight);
                } else if (total2 == 0) {
                    JOptionPane.showMessageDialog(null, "Nothing?!", "0 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, zero);
                } else if (total2 == 1225) {
                    JOptionPane.showMessageDialog(null, """
                            Why was the Christmas tree so bad at knitting?
                                             
                            Because it kept dropping its needles!""", "12/25 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, december25);
                } else if (total2 == 74) {
                    JOptionPane.showMessageDialog(null, "Fire up the grill!", "7/4 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, july4);
                } else if (total2 == 1969) {
                    JOptionPane.showMessageDialog(null, "One giant leap...", "1969 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, moonLanding);
                } else if (total2 == 404) {
                    JOptionPane.showMessageDialog(null, "PAGE NOT FOUND", "404 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, pageNotFound);
                } else if (total2 == 123) {
                    JOptionPane.showMessageDialog(null, "Easy as Do - Re - Mi!", "123 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, doReMi);
                } else if (total2 == 1000) {
                    JOptionPane.showMessageDialog(null, "He lives in a pineapple under the sea", "1000 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, aThounsHours);
                } else if (total2 == 1863) {
                    JOptionPane.showMessageDialog(null, "four score and seven years ago", "1863 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, fourScore);
                } else if (total2 == 8675309) {
                    JOptionPane.showMessageDialog(null, "Change your number Jenny...", "8675309 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, jennysNumber);
                } else if (total2 == 9000) {
                    JOptionPane.showMessageDialog(null, "It's over 9000!!!!", "9000 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, itsOver9000);
                } else if (total2 == 2012) {
                    JOptionPane.showMessageDialog(null, "Raise your hand if you were worried...", "2012 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, year2012);
                } else if (total2 == 1984) {
                    JOptionPane.showMessageDialog(null, "Did you sparknotes the paper?", "1984 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, bigBrother);
                } else if (total2 == 777) {
                    JOptionPane.showMessageDialog(null, "You hit the JACKPOT", "777 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, jackpot);
                } else if (total2 == 8) {
                    JOptionPane.showMessageDialog(null, "Is this considered OSINT?", "8 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, magic8ball);
                } else if (total2 == 25) {
                    JOptionPane.showMessageDialog(null, "In my Quarter-Life-Crisis era", "25 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, quarterLifeCrisis);
                } else if (total2 == 1337) {
                    JOptionPane.showMessageDialog(null, "Elite (Ethical) hacker mode...", "1337 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, eliteEthicalHacker);
                } else if (total2 == 12345) {
                    JOptionPane.showMessageDialog(null, "Worst password ever...", "12345 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, worstPassword);
                } else if (total2 == 2007) {
                    JOptionPane.showMessageDialog(null, " The beginning of an era", "Year 2007 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, firstIphone);
                } else if (total2 == 9999) {
                    JOptionPane.showMessageDialog(null, "You have reached the MAX LEVEL", "9999 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, maxLevel);
                } else if (total2 == 1000000) {
                    JOptionPane.showMessageDialog(null, "one MILLION dollars!", "$1,000,000 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, oneMillion);
                } else if (total2 == 1000000000) {
                    JOptionPane.showMessageDialog(null, "oh... well then make it: one BILLION dollars!", "$1,000,000,000 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, oneBillion);
                } else if (total2 == 20000) {
                    JOptionPane.showMessageDialog(null, "leagues under the sea", "20,000 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, leaguesUnder);
                } else if (total2 == 23.5) {
                    JOptionPane.showMessageDialog(null, "Earth's precise axial tilt", "23.5 --- SECRET MENU ITEM", JOptionPane.INFORMATION_MESSAGE, axialTilt);
                }


            }
        });



        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0.");
                } else if (textField1.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textField1.getText() + btnPoint.getText();
                    textField1.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                String btnClearText = "";
                textField1.setText(btnClearText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Secret Menu Calculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }


}
