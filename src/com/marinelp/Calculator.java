package com.marinelp;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JFrame mainWindow;

    private Container container;

    private JPanel titlePanel, introductionTextAreaPanel, introNameAndLevelPanel, welcomeMessagePanel, continueButtonPanel, startButtonPanel,
            inputsPanel_1, inputsPanel_2, inputsPanel_3, inputPanelLabel_1, inputPanelLabel_2, inputPanelLabel_3,
            textAreaPanel, buttonPanel;

    private JLabel title, driverInputNameLabel, driverInputLevelLabel, userInputLabel_1, userInputLabel_2, userInputLabel_3, userInputLabel_4,
            userInputLabel_5, userInputLabel_6, userInputLabel_7, userInputLabel_8, userInputLabel_9, userInputLabel_10, userInputLabel_11,
            userInputLabel_12;

    private JTextArea introductionTextArea, welcomeTextArea, mainTextArea;

    private JButton continueButton, startButton, totalTimeButton, milesConvertedButton, waitingTimeButton, calculateButton;


    private JTextField driverInputName, driverInputLevel, userInput_1, userInput_2, userInput_3, userInput_4, userInput_5, userInput_6, userInput_7,
            userInput_8, userInput_9, userInput_10, userInput_11, userInput_12;

    private Font titleFont = new Font("Time New Roman", Font.PLAIN, 30);

    private Font mainFont = new Font("Time New Roman", Font.PLAIN, 18);

    private Font welcomeFont = new Font("Time New Roman", Font.BOLD, 25);

    private Font smallFont = new Font("Time New Roman", Font.PLAIN,14);

    private DocumentFilter filter = new UppercaseDocumentFilter(); // upper case


    // COMPONENTS FOR SECOND METHOD

    private JPanel panel_1, panel_2, panel_3, secondInputsPanel_1, secondInputsPanel_2, secondInputsPanel_3, buttonPanel_2;

    private JLabel label_1, label_2, label_3, label_4, label_5, label_6, label_7, label_8, label_9, label_10, label_11, label_12;

    private JTextField input_1, input_2, input_3, input_4, input_5, input_6, input_7, input_8, input_9, input_10, input_11, input_12;

    private JButton timeButton_2, totalTimeButton_2, milesConvertedButton_2, waitingTimeButton_2, calculateButton_2;



    public static void main(String[] args) {

        new Calculator();

    }


    private Calculator() {

        // CREATE THE MAIN WINDOW

        mainWindow = new JFrame("UBER DRIVER TRIP CALCULATOR");
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);
        mainWindow.setSize(1200, 600);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.getContentPane().setBackground(Color.DARK_GRAY);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        container = mainWindow.getContentPane();
        mainWindow.revalidate();

        // TITLE PANEL
        titlePanel = new JPanel();
        titlePanel.setBounds(100, 50, 1000, 50);
        titlePanel.setBackground(Color.GRAY);
        container.add(titlePanel);

        // TITLE LABEL
        title = new JLabel();
        title.setForeground(Color.LIGHT_GRAY);
        title.setText("Driver Fee Calculator Software");
        title.setFont(titleFont);
        titlePanel.add(title);

        // INTRODUCTION TEXT AREA PANEL

        introductionTextAreaPanel = new JPanel();
        introductionTextAreaPanel.setBounds(100, 110, 1000, 290);
        introductionTextAreaPanel.setBackground(Color.GRAY);
        container.add(introductionTextAreaPanel);


        // INTRODUCTION TEXT AREA
        introductionTextArea = new JTextArea();
        introductionTextArea.setBounds(100, 120, 960, 290);
        introductionTextArea.setBackground(Color.GRAY);
        introductionTextArea.setText("#: THE PURPOSE OF THIS PROGRAM IT'S TO RECALCULATE ANY TRIP YOU HAVE COMPLETED WHIT UBER"+
                "PLATFORM ON THE EXECUTIVE LEVEL AND TO CHECK IF UBER THEY PAY YOU CORRECTLY AS THEY SAY.\n\nTHE PROGRAM IT'S EASY " +
                "TO USE AND VERY PRECISE. TO GET ALL THE DETAILS YOU HAVE TO ENTER  IN\nTHIS PROGRAM YOU HAVE TO OPEN THE HISTORY TRIP " +
                "IN YOUR UBER DRIVER APPLICATION AND  THEN CLICK ON THE JOB YOU WANT TO CHECK IT TO SEE THE JOB DETAILS.\n\n" +
                "#: BECAUSE UBER DOES NOT SHOW YOU ALL THE DETAIL'S , THE PROGRAM HAS SOME BUTTONS WHICH CORRESPONDS TO DIFFERENT FIELDS " +
                "WHICH YOU NEED TO COMPLETE WHIT VALUE IN ORDER TO  GET THE RIGHT RESULT. AFTER YOU GET THE MISSING VALUES AND YOU " +
                "HAVE FINISHED TO FILL UP ALL THE NECESSARY FIELDS , ALL YOU NEED TO DO IT IS TO PRESS THE CALCULATE BUTTON.");
        introductionTextArea.setFont(mainFont);
        introductionTextArea.setForeground(Color.LIGHT_GRAY);
        introductionTextArea.setLineWrap(true);
        introductionTextArea.setEditable(false);
        introductionTextAreaPanel.add(introductionTextArea);
        introductionTextAreaPanel.revalidate();

        // GET USER NAME AND UBER LEVEL PANEL

        introNameAndLevelPanel = new JPanel();
        introNameAndLevelPanel.setBounds(100, 410, 1000, 50);
        introNameAndLevelPanel.setLayout(new GridLayout(2, 2));
        introNameAndLevelPanel.setBackground(Color.GRAY);
        container.add(introNameAndLevelPanel);
        introNameAndLevelPanel.revalidate();

        // NAME LABEL
        driverInputNameLabel = new JLabel();
        driverInputNameLabel.setBackground(Color.GRAY);
        driverInputNameLabel.setText("ENTER YOUR NAME");
        driverInputNameLabel.setForeground(Color.LIGHT_GRAY);
        driverInputNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        driverInputNameLabel.setVerticalAlignment(SwingConstants.CENTER);
        introNameAndLevelPanel.add(driverInputNameLabel);
        driverInputNameLabel.revalidate();

        // LEVEL LABEL
        driverInputLevelLabel = new JLabel();
        driverInputLevelLabel.setBackground(Color.GRAY);
        driverInputLevelLabel.setText("ENTER YOUR PLATFORM CATEGORY");
        driverInputLevelLabel.setForeground(Color.LIGHT_GRAY);
        driverInputLevelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        driverInputLevelLabel.setVerticalAlignment(SwingConstants.CENTER);
        introNameAndLevelPanel.add(driverInputLevelLabel);
        driverInputLevelLabel.revalidate();

        // NAME INPUT

        driverInputName = new JTextField();
        driverInputName.setPreferredSize(new Dimension(230, 22));
        driverInputName.setBackground(Color.LIGHT_GRAY);
        driverInputName.setForeground(Color.DARK_GRAY);
        driverInputName.setCaretColor(Color.RED);
        ((AbstractDocument) driverInputName.getDocument()).setDocumentFilter(filter); // upper case
        introNameAndLevelPanel.add(driverInputName);
        driverInputName.revalidate();

        // LEVEL INPUT

        driverInputLevel = new JTextField();
        driverInputLevel.setPreferredSize(new Dimension(230, 22));
        driverInputLevel.setBackground(Color.LIGHT_GRAY);
        driverInputLevel.setForeground(Color.DARK_GRAY);
        driverInputLevel.setCaretColor(Color.RED);
        ((AbstractDocument) driverInputLevel.getDocument()).setDocumentFilter(filter); // upper case
        introNameAndLevelPanel.add(driverInputLevel);
        driverInputLevel.revalidate();

        // CONTINUE BUTTON PANEL

        continueButtonPanel = new JPanel();
        continueButtonPanel.setBounds(100,470, 1000, 45);
        continueButtonPanel.setBackground(Color.GRAY);
        container.add(continueButtonPanel);
        continueButtonPanel.revalidate();
        continueButtonPanel.repaint();

        // CONTINUE BUTTON

        continueButton = new JButton();
        continueButton.setBounds(500, 500, 420, 25);
        continueButton.setText("CONTINUE");
        continueButton.setBackground(Color.DARK_GRAY);
        continueButton.setFont(mainFont);
        continueButton.setForeground(Color.GRAY);
        continueButton.setFocusPainted(false);
        continueButton.setFocusable(false);
        continueButton.setBorderPainted(false);
        continueButton.setContentAreaFilled(true);

        // BORDER AND PADDING ON THE BUTTON
        continueButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        continueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continueButton.setBackground(Color.WHITE);
                continueButton.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                continueButton.setBackground(Color.DARK_GRAY);
                continueButton.setForeground(Color.LIGHT_GRAY);
            }
        });
        continueButton.addActionListener(new ContinueButtonHandler());
        continueButtonPanel.add(continueButton);
        continueButton.revalidate();

        // WELCOME MESSAGE PANEL

        welcomeMessagePanel = new JPanel();
        welcomeMessagePanel.setBounds(100,525, 1000, 42);
        welcomeMessagePanel.setBackground(Color.GRAY);
        welcomeMessagePanel.setVisible(false);
        container.add(welcomeMessagePanel);

        // DISPLAY WELCOME MESSAGE

        welcomeTextArea = new JTextArea();
        welcomeTextArea.setBounds(100, 528, 960, 40);
        welcomeTextArea.setBackground(Color.GRAY);
        welcomeTextArea.setFont(welcomeFont);
        welcomeTextArea.setForeground(Color.LIGHT_GRAY);
        welcomeMessagePanel.add(welcomeTextArea);

        // START BUTTON PANEL

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(100,578, 1000, 45);
        startButtonPanel.setBackground(Color.GRAY);
        startButtonPanel.setVisible(false);
        container.add(startButtonPanel);

        // START BUTTON

        startButton = new JButton();
        startButton.setBounds(500, 500, 420, 25);
        startButton.setText("START THE PROGRAM");
        startButton.setBackground(Color.DARK_GRAY);
        startButton.setFont(mainFont);
        startButton.setForeground(Color.GRAY);
        startButton.setFocusPainted(false);
        startButton.setFocusable(false);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(true);

        // BORDER AND PADDING ON THE BUTTON
        startButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton.setBackground(Color.WHITE);
                startButton.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                startButton.setBackground(Color.DARK_GRAY);
                startButton.setForeground(Color.LIGHT_GRAY);
            }
        });
        startButton.addActionListener(new StartButtonHandler());
        startButtonPanel.add(startButton);

    } // END CALCULATOR CLASS MAIN WINDOW

    /**
     * Method for second window
     */

    private void calculatorSecondWindow() {

        mainWindow.setSize(1200, 500);
        mainWindow.getContentPane().setBackground(Color.GRAY);
        titlePanel.setBackground(Color.DARK_GRAY);
        String welcomeName = driverInputName.getText();
        //String welcomeLevel = driverInputLevel.getText();
        title.setText("Welcome again " + welcomeName + " let's start calculate.");
        introductionTextAreaPanel.setVisible(false);
        introNameAndLevelPanel.setVisible(false);
        continueButtonPanel.setVisible(false);
        welcomeMessagePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        // PANEL LABEL FOR inputsPanel_1

        inputPanelLabel_1 = new JPanel();
        inputPanelLabel_1.setBounds(100, 110, 1000, 20);
        inputPanelLabel_1.setBackground(Color.DARK_GRAY);
        inputPanelLabel_1.setLayout(new GridLayout(1, 4));
        container.add(inputPanelLabel_1);

        // LABELS FOR ROW 1

        userInputLabel_1 = new JLabel();
        userInputLabel_1.setBackground(Color.white);
        userInputLabel_1.setText("Your Name");
        userInputLabel_1.setForeground(Color.white);
        userInputLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_1.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_1.add(userInputLabel_1);

        userInputLabel_2 = new JLabel();
        userInputLabel_2.setBackground(Color.white);
        userInputLabel_2.setText("Uber Level");
        userInputLabel_2.setForeground(Color.white);
        userInputLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_2.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_1.add(userInputLabel_2);

        userInputLabel_3 = new JLabel();
        userInputLabel_3.setBackground(Color.white);
        userInputLabel_3.setText("Hours");
        userInputLabel_3.setForeground(Color.white);
        userInputLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_3.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_1.add(userInputLabel_3);

        userInputLabel_4 = new JLabel();
        userInputLabel_4.setBackground(Color.white);
        userInputLabel_4.setText("Minutes");
        userInputLabel_4.setForeground(Color.white);
        userInputLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_4.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_1.add(userInputLabel_4);


        // USER INPUTS PANEL ROW 1

        inputsPanel_1 = new JPanel();
        inputsPanel_1.setBounds(100, 135, 1000, 34);
        inputsPanel_1.setBackground(Color.DARK_GRAY);
        container.add(inputsPanel_1);

        // PANEL LABEL FOR inputsPanel_2

        inputPanelLabel_2 = new JPanel();
        inputPanelLabel_2.setBounds(100, 175, 1000, 20);
        inputPanelLabel_2.setBackground(Color.DARK_GRAY);
        inputPanelLabel_2.setLayout(new GridLayout(1, 4));
        container.add(inputPanelLabel_2);

        // LABELS FOR ROW 2

        userInputLabel_5 = new JLabel();
        userInputLabel_5.setBackground(Color.white);
        userInputLabel_5.setText("Seconds");
        userInputLabel_5.setForeground(Color.white);
        userInputLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_5.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_2.add(userInputLabel_5);

        userInputLabel_6 = new JLabel();
        userInputLabel_6.setBackground(Color.white);
        userInputLabel_6.setText("Total Time");
        userInputLabel_6.setForeground(Color.white);
        userInputLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_6.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_2.add(userInputLabel_6);

        userInputLabel_7 = new JLabel();
        userInputLabel_7.setBackground(Color.white);
        userInputLabel_7.setText("Miles");
        userInputLabel_7.setForeground(Color.white);
        userInputLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_7.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_2.add(userInputLabel_7);

        userInputLabel_8 = new JLabel();
        userInputLabel_8.setBackground(Color.white);
        userInputLabel_8.setText("Converted Miles");
        userInputLabel_8.setForeground(Color.white);
        userInputLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_8.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_2.add(userInputLabel_8);


        // USER INPUTS PANEL ROW 2

        inputsPanel_2 = new JPanel();
        inputsPanel_2.setBounds(100, 200, 1000, 34);
        inputsPanel_2.setBackground(Color.DARK_GRAY);
        container.add(inputsPanel_2);

        // PANEL LABEL FOR inputsPanel_3

        inputPanelLabel_3 = new JPanel();
        inputPanelLabel_3.setBounds(100, 240, 1000, 20);
        inputPanelLabel_3.setBackground(Color.DARK_GRAY);
        inputPanelLabel_3.setLayout(new GridLayout(1, 4));
        container.add(inputPanelLabel_3);

        // LABELS FOR ROW 3
        userInputLabel_9 = new JLabel();
        userInputLabel_9.setBackground(Color.white);
        userInputLabel_9.setText("Waiting Time Value");
        userInputLabel_9.setForeground(Color.white);
        userInputLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_9.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_3.add(userInputLabel_9);

        userInputLabel_10 = new JLabel();
        userInputLabel_10.setBackground(Color.white);
        userInputLabel_10.setText("Waiting Time Converted");
        userInputLabel_10.setForeground(Color.white);
        userInputLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_10.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_3.add(userInputLabel_10);

        userInputLabel_11 = new JLabel();
        userInputLabel_11.setBackground(Color.white);
        userInputLabel_11.setText("Surge Price");
        userInputLabel_11.setForeground(Color.white);
        userInputLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_11.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_3.add(userInputLabel_11);

        userInputLabel_12 = new JLabel();
        userInputLabel_12.setBackground(Color.white);
        userInputLabel_12.setText("Tips");
        userInputLabel_12.setForeground(Color.white);
        userInputLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
        userInputLabel_12.setVerticalAlignment(SwingConstants.CENTER);
        inputPanelLabel_3.add(userInputLabel_12);

        // USER INPUTS PANEL ROW 3

        inputsPanel_3 = new JPanel();
        inputsPanel_3.setBounds(100, 265, 1000, 34);
        inputsPanel_3.setBackground(Color.DARK_GRAY);
        container.add(inputsPanel_3);

        // USER INPUTS FOR ROW 1 WINDOW 2

        userInput_1 = new JTextField();
        userInput_1.setPreferredSize(new Dimension(230, 24));
        userInput_1.setBackground(Color.LIGHT_GRAY);
        userInput_1.setForeground(Color.DARK_GRAY);
        userInput_1.setCaretColor(Color.RED);
        ((AbstractDocument) userInput_1.getDocument()).setDocumentFilter(filter); // for upper case out put
        inputsPanel_1.add(userInput_1);

        userInput_2 = new JTextField();
        userInput_2.setPreferredSize(new Dimension(230, 24));
        userInput_2.setBackground(Color.LIGHT_GRAY);
        userInput_2.setForeground(Color.DARK_GRAY);
        userInput_2.setCaretColor(Color.RED);
        ((AbstractDocument) userInput_2.getDocument()).setDocumentFilter(filter); // for upper case out put
        inputsPanel_1.add(userInput_2);

        userInput_3 = new JTextField();
        userInput_3.setPreferredSize(new Dimension(230, 24));
        userInput_3.setBackground(Color.LIGHT_GRAY);
        userInput_3.setForeground(Color.DARK_GRAY);
        userInput_3.setCaretColor(Color.RED);
        inputsPanel_1.add(userInput_3);

        userInput_4 = new JTextField();
        userInput_4.setPreferredSize(new Dimension(230, 24));
        userInput_4.setBackground(Color.LIGHT_GRAY);
        userInput_4.setForeground(Color.DARK_GRAY);
        userInput_4.setCaretColor(Color.RED);
        inputsPanel_1.add(userInput_4);

        // USER INPUTS FOR ROW 2 WINDOW 2

        userInput_5 = new JTextField();
        userInput_5.setPreferredSize(new Dimension(230, 24));
        userInput_5.setBackground(Color.LIGHT_GRAY);
        userInput_5.setForeground(Color.DARK_GRAY);
        userInput_5.setCaretColor(Color.RED);
        inputsPanel_2.add(userInput_5);

        userInput_6 = new JTextField();
        userInput_6.setPreferredSize(new Dimension(230, 24));
        userInput_6.setBackground(Color.LIGHT_GRAY);
        userInput_6.setForeground(Color.DARK_GRAY);
        userInput_6.setCaretColor(Color.RED);
        inputsPanel_2.add(userInput_6);

        userInput_7 = new JTextField();
        userInput_7.setPreferredSize(new Dimension(230, 24));
        userInput_7.setBackground(Color.LIGHT_GRAY);
        userInput_7.setForeground(Color.DARK_GRAY);
        userInput_7.setCaretColor(Color.RED);
        inputsPanel_2.add(userInput_7);

        userInput_8 = new JTextField();
        userInput_8.setPreferredSize(new Dimension(230, 24));
        userInput_8.setBackground(Color.LIGHT_GRAY);
        userInput_8.setForeground(Color.DARK_GRAY);
        userInput_8.setCaretColor(Color.RED);
        inputsPanel_2.add(userInput_8);

        // USER INPUTS FOR ROW 3 WINDOW 2

        userInput_9 = new JTextField();
        userInput_9.setPreferredSize(new Dimension(230, 24));
        userInput_9.setBackground(Color.LIGHT_GRAY);
        userInput_9.setForeground(Color.DARK_GRAY);
        userInput_9.setCaretColor(Color.RED);
        inputsPanel_3.add(userInput_9);

        userInput_10 = new JTextField();
        userInput_10.setPreferredSize(new Dimension(230, 24));
        userInput_10.setBackground(Color.LIGHT_GRAY);
        userInput_10.setForeground(Color.DARK_GRAY);
        userInput_10.setCaretColor(Color.RED);
        inputsPanel_3.add(userInput_10);

        userInput_11 = new JTextField();
        userInput_11.setPreferredSize(new Dimension(230, 24));
        userInput_11.setBackground(Color.LIGHT_GRAY);
        userInput_11.setForeground(Color.DARK_GRAY);
        userInput_11.setCaretColor(Color.RED);
        inputsPanel_3.add(userInput_11);

        userInput_12 = new JTextField();
        userInput_12.setPreferredSize(new Dimension(230, 24));
        userInput_12.setBackground(Color.LIGHT_GRAY);
        userInput_12.setForeground(Color.DARK_GRAY);
        userInput_12.setCaretColor(Color.RED);
        inputsPanel_3.add(userInput_12);

        // BUTTON PANEL

        buttonPanel = new JPanel();
        buttonPanel.setBounds(100, 305, 1000, 45);
        buttonPanel.setBackground(Color.DARK_GRAY);
        container.add(buttonPanel);

        // GET TOTAL TIME BUTTON

        totalTimeButton = new JButton();
        totalTimeButton.setBounds(500, 307, 420, 25);
        totalTimeButton.setText("GET TOTAL TIME");
        totalTimeButton.setBackground(Color.GRAY);
        totalTimeButton.setFont(mainFont);
        totalTimeButton.setForeground(Color.DARK_GRAY);
        totalTimeButton.setFocusPainted(false);
        totalTimeButton.setFocusable(false);
        totalTimeButton.setBorderPainted(false);
        totalTimeButton.setContentAreaFilled(true);

        // BORDER AND PADDING ON YHE BUTTON
        totalTimeButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        totalTimeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                totalTimeButton.setBackground(Color.WHITE);
                totalTimeButton.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                totalTimeButton.setBackground(Color.GRAY);
                totalTimeButton.setForeground(Color.WHITE);
            }
        });
        totalTimeButton.addActionListener(new TotalTimeButtonHandler());

        buttonPanel.add(totalTimeButton);

        // GET MILES CONVERTED BUTTON

        milesConvertedButton = new JButton();
        milesConvertedButton.setBounds(500, 307, 420, 25);
        milesConvertedButton.setText("GET CONVERTED MILES");
        milesConvertedButton.setBackground(Color.GRAY);
        milesConvertedButton.setFont(mainFont);
        milesConvertedButton.setForeground(Color.DARK_GRAY);
        milesConvertedButton.setFocusPainted(false);
        milesConvertedButton.setFocusable(false);
        milesConvertedButton.setBorderPainted(false);
        milesConvertedButton.setContentAreaFilled(true);

        // BORDER AND PADDING ON YHE BUTTON
        milesConvertedButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        milesConvertedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                milesConvertedButton.setBackground(Color.WHITE);
                milesConvertedButton.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                milesConvertedButton.setBackground(Color.GRAY);
                milesConvertedButton.setForeground(Color.WHITE);
            }
        });
        milesConvertedButton.addActionListener(new ConvertedMilesButtonHandler());

        buttonPanel.add(milesConvertedButton);
        
        // GET WAITING TIME SECONDS BUTTON

        waitingTimeButton = new JButton();
        waitingTimeButton.setBounds(500, 307, 420, 25);
        waitingTimeButton.setText("GET WAITING TIME CONVERTED");
        waitingTimeButton.setBackground(Color.GRAY);
        waitingTimeButton.setFont(mainFont);
        waitingTimeButton.setForeground(Color.DARK_GRAY);
        waitingTimeButton.setFocusPainted(false);
        waitingTimeButton.setFocusable(false);
        waitingTimeButton.setBorderPainted(false);
        waitingTimeButton.setContentAreaFilled(true);

        // BORDER AND PADDING ON YHE BUTTON
        waitingTimeButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        waitingTimeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                waitingTimeButton.setBackground(Color.WHITE);
                waitingTimeButton.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                waitingTimeButton.setBackground(Color.GRAY);
                waitingTimeButton.setForeground(Color.WHITE);
            }
        });
        waitingTimeButton.addActionListener(new WaitingTimeButtonHandler());

        buttonPanel.add(waitingTimeButton);

        // CALCULATE BUTTON

        calculateButton = new JButton();
        calculateButton.setBounds(500, 307, 420, 25);
        calculateButton.setText("CALCULATE");
        calculateButton.setBackground(Color.GRAY);
        calculateButton.setFont(mainFont);
        calculateButton.setForeground(Color.DARK_GRAY);
        calculateButton.setFocusPainted(false);
        calculateButton.setFocusable(false);
        calculateButton.setBorderPainted(false);
        calculateButton.setContentAreaFilled(true);

        // BORDER AND PADDING ON YHE BUTTON
        calculateButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateButton.setBackground(Color.WHITE);
                calculateButton.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                calculateButton.setBackground(Color.GRAY);
                calculateButton.setForeground(Color.WHITE);
            }
        });
        calculateButton.addActionListener(new CalculateButtonHandler());

        buttonPanel.add(calculateButton);

        // MAIN TEXT AREA PANEL

        textAreaPanel = new JPanel();
        textAreaPanel.setBounds(100, 360, 1000, 58);
        textAreaPanel.setBackground(Color.DARK_GRAY);
        container.add(textAreaPanel);

        // MAIN TEXT AREA

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 360, 500, 55);
        mainTextArea.setBackground(Color.DARK_GRAY);
        mainTextArea.setFont(mainFont);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setLineWrap(true);
        mainTextArea.setEditable(false);
        textAreaPanel.add(mainTextArea);

    } // END CLASS CALCULATOR SECOND WINDOW.



    /**
     * Method to calculate the driver fee
     */

    private void calculateDriverEarnings () {


        double baseFee = 4d;
        double secondFee = 0.005d;
        double milesFee = 0.0013636363636364; // per kilometers 1.4929 per miles 2.40d
        String inputName = userInput_1.getText();
        double inputHours = Double.parseDouble(userInput_3.getText());
        double inputMinutes = Double.parseDouble(userInput_4.getText());
        double inputSeconds = Double.parseDouble(userInput_5.getText());
        double inputTotalSeconds = Double.parseDouble(userInput_6.getText());
        double inputMiles = Double.parseDouble(userInput_7.getText());
        double inputConvertedMiles = Double.parseDouble(userInput_8.getText());
        double inputWaitingTimeValue = Double.parseDouble(userInput_9.getText());
        double inputWaitingTimeSeconds = Double.parseDouble(userInput_10.getText());
        double inputSurgePrice = Double.parseDouble(userInput_11.getText());
        double inputTips = Double.parseDouble(userInput_12.getText());


        double minimFee = 10d;
        double cancellationFee = 8.00;
        double cancellationFeeBeforeTwoMinutes = 0d;
        double convertedSeconds = inputSeconds + (inputMinutes * 60) + (inputHours * 3600);
        double totalTime = inputTotalSeconds * secondFee;
        double milesConverted = inputMiles * 1760;
        double totalMiles = inputConvertedMiles * milesFee;
        double driverWaitingTime = inputWaitingTimeSeconds * secondFee;
        double tariff = baseFee + totalTime + totalMiles;

        // SURGE PRICE CALCULATION
        double dynamicTariff = 0d;
        for (int i = 0; i <= inputSurgePrice; i++) {
            dynamicTariff = (tariff * inputSurgePrice) - tariff;
        }

        double totalGrossFeeOfRide = tariff + driverWaitingTime + dynamicTariff;
        double waitingTimePercentage = (driverWaitingTime * 25.0) / 100; // correct calculation
        double happyHourPercentage = (dynamicTariff * 25.0) / 100; // correct calculation
        double totalUberPercentage = ((tariff * 25.0) / 100 + waitingTimePercentage + happyHourPercentage);

        // MINIM FEE CALCULATION + SURGE
        if ((tariff < minimFee) && (inputSurgePrice < 0)) {
            tariff = (minimFee - tariff) + tariff;
            totalUberPercentage = ((tariff * 25.0) / 100);
            totalGrossFeeOfRide = minimFee;
            dynamicTariff = 0;

        } else if ((tariff < minimFee) && (inputSurgePrice > 0)) { // MINIM FEE CALCULATION + SURGE
            tariff = (minimFee - tariff) + tariff;
            dynamicTariff = (minimFee * inputSurgePrice) - minimFee;
            totalGrossFeeOfRide = minimFee + inputWaitingTimeValue + dynamicTariff;
            totalUberPercentage = ((totalGrossFeeOfRide * 25.0) / 100);
        }

        // DRIVER EARNINGS WITH OUT SURGE PRICE
        if (inputSurgePrice == 0) {
            totalGrossFeeOfRide = tariff;
            totalUberPercentage = ((tariff * 25.0) / 100 + waitingTimePercentage);
            dynamicTariff = 0;
        }

        // RIDER CANCELLATION CALCULATION AFTER TWO MINUTES
        if ((convertedSeconds > 120) && (convertedSeconds < 480) && (milesConverted == 0) && (inputWaitingTimeValue == 0) && (inputSurgePrice == 0)) {
            tariff = cancellationFee;
            totalUberPercentage = ((cancellationFee * 25.0) / 100);
            totalGrossFeeOfRide = cancellationFee;
            dynamicTariff = 0;
        }

        // RIDER CANCELLATION BEFORE TWO MINUTES
        if ((convertedSeconds == 0) && (milesConverted == 0) && (inputWaitingTimeValue == 0) && (inputSurgePrice == 0)) {
            tariff = cancellationFeeBeforeTwoMinutes;
            totalUberPercentage = ((cancellationFeeBeforeTwoMinutes * 25.0) / 100);
            totalGrossFeeOfRide = cancellationFeeBeforeTwoMinutes;
            dynamicTariff = 0;
        }

        double clearDriverMoney = ((tariff + driverWaitingTime + dynamicTariff + inputTips) - totalUberPercentage);

        if (inputHours == 0) {

            mainTextArea.setText("\t #) Tariff Fee:                 = " + String.format("%.2f", tariff) + " £\n" +
                    "\t #) Dynamic Tariff:         = " + String.format("%.2f", dynamicTariff) + " £\n" +
                    "\t #) Waiting Time:            = " + String.format("%.2f", driverWaitingTime) + " £\n" +
                    "\t #) Total Charge Fee:    = " + String.format("%.2f", totalGrossFeeOfRide) + " £\n" +
                    "\t #) Uber Fee:                  = " + String.format("%.2f", totalUberPercentage) + " £\n" +
                    "\t #) Your Tips:                  = " + String.format("%.2f", inputTips) + " £\n" +
                    "\t #) Your Earnings           = " + String.format("%.2f", clearDriverMoney) + " £\n\n" +
                    "              THANKS FOR USING OUR SOFTWARE\n" +
                    "\t HAVE A NICE DAY " + inputName + " ☹ ");

            // START THE CODE IF INPUT HOURS >=1

        } else if (inputHours >= 1) {

            calculatorThirdWindow();

            mainTextArea.setFont(smallFont);

            mainTextArea.setText(" As you can see the value of Your Earnings [ " + String.format("%.2f", clearDriverMoney) + " £ ] " +
                            " it's wrong because we\n don't have the value of seconds on jobs which take more then one hour to be\n done " +
                            " that's way we need to find out this value and recalculate again." +
                            "\t Fill up all the fields and recalculate again " + inputName + ".\n\n" +
                    "\t            #) Tariff Fee:                = " + String.format("%.2f", tariff) + " £\n" +
                    "\t            #) Dynamic Tariff:         = " + String.format("%.2f", dynamicTariff) + " £\n" +
                    "\t            #) Waiting Time:           = " + String.format("%.2f", driverWaitingTime) + " £\n" +
                    "\t            #) Total Charge Fee:    = " + String.format("%.2f", totalGrossFeeOfRide) + " £\n" +
                    "\t            #) Uber Fee:                 = " + String.format("%.2f", totalUberPercentage) + " £\n" +
                    "\t            #) Your Tips:                 = " + String.format("%.2f", inputTips) + " £\n" +
                    "\t            #) Your Earnings           = " + String.format("%.2f", clearDriverMoney) + " £");
        }

    }


    /**
     * Interface for third window
     */

    private void calculatorThirdWindow(){


        String welcomeName = driverInputName.getText();
        //String welcomeLevel = driverInputLevel.getText();
        mainWindow.getContentPane().setBackground(Color.GRAY);

        title.setText("Welcome again " + welcomeName + " let's recalculate");
        introductionTextAreaPanel.setVisible(false);
        introNameAndLevelPanel.setVisible(false);
        continueButtonPanel.setVisible(false);
        welcomeMessagePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        inputPanelLabel_1.setVisible(false);
        inputPanelLabel_2.setVisible(false);
        inputPanelLabel_3.setVisible(false);
        inputsPanel_1.setVisible(false);
        inputsPanel_2.setVisible(false);
        inputsPanel_3.setVisible(false);
        buttonPanel.setVisible(false);
        totalTimeButton.setVisible(false);
        milesConvertedButton.setVisible(false);
        waitingTimeButton.setVisible(false);
        calculateButton.setVisible(false);

        // PANEL FOR ROW 1

        panel_1 = new JPanel();
        panel_1.setBounds(100, 110, 1000, 20);
        panel_1.setBackground(Color.DARK_GRAY);
        panel_1.setLayout(new GridLayout(1, 4));
        container.add(panel_1);

        // LABELS FOR ROW 1
        label_1 = new JLabel();
        label_1.setBackground(Color.white);
        label_1.setText("Enter The Tariff Value");
        label_1.setForeground(Color.white);
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setVerticalAlignment(SwingConstants.CENTER);
        panel_1.add(label_1);

        label_2 = new JLabel();
        label_2.setBackground(Color.white);
        label_2.setText("Hours");
        label_2.setForeground(Color.white);
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setVerticalAlignment(SwingConstants.CENTER);
        panel_1.add(label_2);

        label_3 = new JLabel();
        label_3.setBackground(Color.white);
        label_3.setText("Minutes");
        label_3.setForeground(Color.white);
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setVerticalAlignment(SwingConstants.CENTER);
        panel_1.add(label_3);

        label_4 = new JLabel();
        label_4.setBackground(Color.white);
        label_4.setText("Seconds");
        label_4.setForeground(Color.white);
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setVerticalAlignment(SwingConstants.CENTER);
        panel_1.add(label_4);

        // PANEL FOR USER INPUTS ROW 1

        secondInputsPanel_1 = new JPanel();
        secondInputsPanel_1.setBounds(100, 135, 1000, 34);
        secondInputsPanel_1.setBackground(Color.DARK_GRAY);
        container.add(secondInputsPanel_1);

        // PANEL FOR ROW 2

        panel_2 = new JPanel();
        panel_2.setBounds(100, 175, 1000, 20);
        panel_2.setBackground(Color.DARK_GRAY);
        panel_2.setLayout(new GridLayout(1, 4));
        container.add(panel_2);

        // LABELS FOR ROW 2

        label_5 = new JLabel();
        label_5.setBackground(Color.white);
        label_5.setText("Time");
        label_5.setForeground(Color.white);
        label_5.setHorizontalAlignment(SwingConstants.CENTER);
        label_5.setVerticalAlignment(SwingConstants.CENTER);
        panel_2.add(label_5);

        label_6 = new JLabel();
        label_6.setBackground(Color.white);
        label_6.setText("Miles");
        label_6.setForeground(Color.white);
        label_6.setHorizontalAlignment(SwingConstants.CENTER);
        label_6.setVerticalAlignment(SwingConstants.CENTER);
        panel_2.add(label_6);

        label_7 = new JLabel();
        label_7.setBackground(Color.white);
        label_7.setText("Converted Miles");
        label_7.setForeground(Color.white);
        label_7.setHorizontalAlignment(SwingConstants.CENTER);
        label_7.setVerticalAlignment(SwingConstants.CENTER);
        panel_2.add(label_7);

        label_8 = new JLabel();
        label_8.setBackground(Color.white);
        label_8.setText("Total Time");
        label_8.setForeground(Color.white);
        label_8.setHorizontalAlignment(SwingConstants.CENTER);
        label_8.setVerticalAlignment(SwingConstants.CENTER);
        panel_2.add(label_8);

        // PANEL FOR USER INPUTS ROW 2

        secondInputsPanel_2 = new JPanel();
        secondInputsPanel_2.setBounds(100, 200, 1000, 34);
        secondInputsPanel_2.setBackground(Color.DARK_GRAY);
        container.add(secondInputsPanel_2);

        // PANEL FOR ROW 3

        panel_3 = new JPanel();
        panel_3.setBounds(100, 240, 1000, 20);
        panel_3.setBackground(Color.DARK_GRAY);
        panel_3.setLayout(new GridLayout(1, 4));
        container.add(panel_3);

        // LABELS FOR ROW 3

        label_9 = new JLabel();
        label_9.setBackground(Color.white);
        label_9.setText("Waiting Time Value");
        label_9.setForeground(Color.white);
        label_9.setHorizontalAlignment(SwingConstants.CENTER);
        label_9.setVerticalAlignment(SwingConstants.CENTER);
        panel_3.add(label_9);

        label_10 = new JLabel();
        label_10.setBackground(Color.white);
        label_10.setText("Waiting Time Converted");
        label_10.setForeground(Color.white);
        label_10.setHorizontalAlignment(SwingConstants.CENTER);
        label_10.setVerticalAlignment(SwingConstants.CENTER);
        panel_3.add(label_10);

        label_11 = new JLabel();
        label_11.setBackground(Color.white);
        label_11.setText("Surge Price");
        label_11.setForeground(Color.white);
        label_11.setHorizontalAlignment(SwingConstants.CENTER);
        label_11.setVerticalAlignment(SwingConstants.CENTER);
        panel_3.add(label_11);

        label_12 = new JLabel();
        label_12.setBackground(Color.white);
        label_12.setText("Tips");
        label_12.setForeground(Color.white);
        label_12.setHorizontalAlignment(SwingConstants.CENTER);
        label_12.setVerticalAlignment(SwingConstants.CENTER);
        panel_3.add(label_12);

        // PANEL FOR USER INPUTS ROW 3

        secondInputsPanel_3 = new JPanel();
        secondInputsPanel_3.setBounds(100, 265, 1000, 34);
        secondInputsPanel_3.setBackground(Color.DARK_GRAY);
        container.add(secondInputsPanel_3);

        // USER INPUTS ROW 1 JTextField

        input_1 = new JTextField();
        input_1.setPreferredSize(new Dimension(230, 24));
        input_1.setBackground(Color.LIGHT_GRAY);
        input_1.setForeground(Color.DARK_GRAY);
        input_1.setCaretColor(Color.RED);
        secondInputsPanel_1.add(input_1);

        input_2 = new JTextField();
        input_2.setPreferredSize(new Dimension(230, 24));
        input_2.setBackground(Color.LIGHT_GRAY);
        input_2.setForeground(Color.DARK_GRAY);
        input_2.setCaretColor(Color.RED);
        secondInputsPanel_1.add(input_2);

        input_3 = new JTextField();
        input_3.setPreferredSize(new Dimension(230, 24));
        input_3.setBackground(Color.LIGHT_GRAY);
        input_3.setForeground(Color.DARK_GRAY);
        input_3.setCaretColor(Color.RED);
        secondInputsPanel_1.add(input_3);

        input_4 = new JTextField();
        input_4.setPreferredSize(new Dimension(230, 24));
        input_4.setBackground(Color.LIGHT_GRAY);
        input_4.setForeground(Color.DARK_GRAY);
        input_4.setCaretColor(Color.RED);
        secondInputsPanel_1.add(input_4);

        // USER INPUTS ROW 2 JTextField

        input_5 = new JTextField();
        input_5.setPreferredSize(new Dimension(230, 24));
        input_5.setBackground(Color.LIGHT_GRAY);
        input_5.setForeground(Color.DARK_GRAY);
        input_5.setCaretColor(Color.RED);
        secondInputsPanel_2.add(input_5);

        input_6 = new JTextField();
        input_6.setPreferredSize(new Dimension(230, 24));
        input_6.setBackground(Color.LIGHT_GRAY);
        input_6.setForeground(Color.DARK_GRAY);
        input_6.setCaretColor(Color.RED);
        secondInputsPanel_2.add(input_6);

        input_7 = new JTextField();
        input_7.setPreferredSize(new Dimension(230, 24));
        input_7.setBackground(Color.LIGHT_GRAY);
        input_7.setForeground(Color.DARK_GRAY);
        input_7.setCaretColor(Color.RED);
        secondInputsPanel_2.add(input_7);

        input_8 = new JTextField();
        input_8.setPreferredSize(new Dimension(230, 24));
        input_8.setBackground(Color.LIGHT_GRAY);
        input_8.setForeground(Color.DARK_GRAY);
        input_8.setCaretColor(Color.RED);
        secondInputsPanel_2.add(input_8);


        // USER INPUTS ROW 3 JTextField

        input_9 = new JTextField();
        input_9.setPreferredSize(new Dimension(230, 24));
        input_9.setBackground(Color.LIGHT_GRAY);
        input_9.setForeground(Color.DARK_GRAY);
        input_9.setCaretColor(Color.RED);
        secondInputsPanel_3.add(input_9);

        input_10 = new JTextField();
        input_10.setPreferredSize(new Dimension(230, 24));
        input_10.setBackground(Color.LIGHT_GRAY);
        input_10.setForeground(Color.DARK_GRAY);
        input_10.setCaretColor(Color.RED);
        secondInputsPanel_3.add(input_10);

        input_11 = new JTextField();
        input_11.setPreferredSize(new Dimension(230, 24));
        input_11.setBackground(Color.LIGHT_GRAY);
        input_11.setForeground(Color.DARK_GRAY);
        input_11.setCaretColor(Color.RED);
        secondInputsPanel_3.add(input_11);

        input_12 = new JTextField();
        input_12.setPreferredSize(new Dimension(230, 24));
        input_12.setBackground(Color.LIGHT_GRAY);
        input_12.setForeground(Color.DARK_GRAY);
        input_12.setCaretColor(Color.RED);
        secondInputsPanel_3.add(input_12);

        // BUTTONS PANEL

        buttonPanel_2 = new JPanel();
        buttonPanel_2.setBounds(100, 305, 1000, 45);
        buttonPanel_2.setBackground(Color.DARK_GRAY);
        container.add(buttonPanel_2);

        // GET THE TIME BUTTON WINDOW 3

        timeButton_2 = new JButton();
        timeButton_2.setBounds(500, 307, 420, 25);
        timeButton_2.setText("GET THE TIME");
        timeButton_2.setBackground(Color.GRAY);
        timeButton_2.setFont(mainFont);
        timeButton_2.setForeground(Color.DARK_GRAY);
        timeButton_2.setFocusPainted(false);
        timeButton_2.setFocusable(false);
        timeButton_2.setBorderPainted(false);
        timeButton_2.setContentAreaFilled(true);

        // BORDER AND PADDING ON THE BUTTON
        timeButton_2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        timeButton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeButton_2.setBackground(Color.WHITE);
                timeButton_2.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                timeButton_2.setBackground(Color.GRAY);
                timeButton_2.setForeground(Color.WHITE);
            }
        });
        timeButton_2.addActionListener(new timeButtonHandler());

        buttonPanel_2.add(timeButton_2);

        // GET MILES CONVERTED BUTTON WINDOW 3

        milesConvertedButton_2 = new JButton();
        milesConvertedButton_2.setBounds(500, 307, 420, 25);
        milesConvertedButton_2.setText("GET CONVERTED MILES");
        milesConvertedButton_2.setBackground(Color.GRAY);
        milesConvertedButton_2.setFont(mainFont);
        milesConvertedButton_2.setForeground(Color.DARK_GRAY);
        milesConvertedButton_2.setFocusPainted(false);
        milesConvertedButton_2.setFocusable(false);
        milesConvertedButton_2.setBorderPainted(false);
        milesConvertedButton_2.setContentAreaFilled(true);

        // BORDER AND PADDING ON THE BUTTON
        milesConvertedButton_2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        milesConvertedButton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                milesConvertedButton_2.setBackground(Color.WHITE);
                milesConvertedButton_2.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                milesConvertedButton_2.setBackground(Color.GRAY);
                milesConvertedButton_2.setForeground(Color.WHITE);
            }
        });
        milesConvertedButton_2.addActionListener(new ConvertedMilesButtonHandlerWindow_3());

        buttonPanel_2.add(milesConvertedButton_2);

        // GET THE TOTAL TIME WINDOW 3

        totalTimeButton_2 = new JButton();
        totalTimeButton_2.setBounds(500, 307, 420, 25);
        totalTimeButton_2.setText("GET TOTAL TIME");
        totalTimeButton_2.setBackground(Color.GRAY);
        totalTimeButton_2.setFont(mainFont);
        totalTimeButton_2.setForeground(Color.DARK_GRAY);
        totalTimeButton_2.setFocusPainted(false);
        totalTimeButton_2.setFocusable(false);
        totalTimeButton_2.setBorderPainted(false);
        totalTimeButton_2.setContentAreaFilled(true);

        // BORDER AND PADDING ON THE BUTTON
        totalTimeButton_2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        totalTimeButton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                totalTimeButton_2.setBackground(Color.WHITE);
                totalTimeButton_2.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                totalTimeButton_2.setBackground(Color.GRAY);
                totalTimeButton_2.setForeground(Color.WHITE);
            }
        });
        totalTimeButton_2.addActionListener(new TotalTimeSecondButtonHandler());

        buttonPanel_2.add(totalTimeButton_2);

        // GET WAITING TIME SECONDS BUTTON WINDOW 3

        waitingTimeButton_2 = new JButton();
        waitingTimeButton_2.setBounds(500, 307, 420, 25);
        waitingTimeButton_2.setText("GET WAITING TIME CONVERTED");
        waitingTimeButton_2.setBackground(Color.GRAY);
        waitingTimeButton_2.setFont(mainFont);
        waitingTimeButton_2.setForeground(Color.DARK_GRAY);
        waitingTimeButton_2.setFocusPainted(false);
        waitingTimeButton_2.setFocusable(false);
        waitingTimeButton_2.setBorderPainted(false);
        waitingTimeButton_2.setContentAreaFilled(true);

        // BORDER AND PADDING ON THE BUTTON
        waitingTimeButton_2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        waitingTimeButton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                waitingTimeButton_2.setBackground(Color.WHITE);
                waitingTimeButton_2.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                waitingTimeButton_2.setBackground(Color.GRAY);
                waitingTimeButton_2.setForeground(Color.WHITE);
            }
        });
        waitingTimeButton_2.addActionListener(new WaitingTimeButtonHandlerWindow_3());

        buttonPanel_2.add(waitingTimeButton_2);

        // CALCULATE BUTTON WINDOW 3

        calculateButton_2 = new JButton();
        calculateButton_2.setBounds(500, 307, 420, 25);
        calculateButton_2.setText("CALCULATE");
        calculateButton_2.setBackground(Color.GRAY);
        calculateButton_2.setFont(mainFont);
        calculateButton_2.setForeground(Color.DARK_GRAY);
        calculateButton_2.setFocusPainted(false);
        calculateButton_2.setFocusable(false);
        calculateButton_2.setBorderPainted(false);
        calculateButton_2.setContentAreaFilled(true);

        // BORDER AND PADDING ON THE BUTTON
        calculateButton_2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.CYAN, 3),
                BorderFactory.createLineBorder(Color.BLACK, 3)));

        // CHANGE BUTTON BACKGROUND ON HOVER
        calculateButton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateButton_2.setBackground(Color.WHITE);
                calculateButton_2.setForeground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //calculateButton.setBackground(UIManager.getColor("control"));
                calculateButton_2.setBackground(Color.GRAY);
                calculateButton_2.setForeground(Color.WHITE);
            }
        });
        calculateButton_2.addActionListener(new CalculateSecondButtonHandler());

        buttonPanel_2.add(calculateButton_2);
    }

    /**
     * Method to calculate driver fee if inputHours >= 1 for window 3
     */

    private void calculateDriverEarningsIfHoursIsBiggerThenZero() {


        double baseFee = 4d;
        double secondFee = 0.005d;
        double milesFee = 0.0013636363636364; // per kilometers 1.4929 per miles 2.40d
        String inputName = userInput_1.getText();
        double tariffEntered = Double.parseDouble(input_1.getText());
        double inputHours = Double.parseDouble(input_2.getText());
        double inputMinutes = Double.parseDouble(input_3.getText());
        double inputSeconds = Double.parseDouble(input_4.getText());
        double inputTotalSeconds = Double.parseDouble(input_5.getText());
        double inputMiles = Double.parseDouble(input_6.getText());
        double inputConvertedMiles = Double.parseDouble(input_7.getText());
        double totalTimeRecalculated = Double.parseDouble(input_8.getText());
        double inputWaitingTimeValue = Double.parseDouble(input_9.getText());
        double inputWaitingTimeSeconds = Double.parseDouble(input_10.getText());
        double inputSurgePrice = Double.parseDouble(input_11.getText());
        double inputTips = Double.parseDouble(input_12.getText());

        double remainingSecondsValue = tariffEntered - ((inputTotalSeconds * 0.005) + (inputConvertedMiles * 0.0013636363636364) + 4);// 4 is the base fee
        double remainingSeconds = remainingSecondsValue / 0.005;

        double minimFee = 10d;
        double cancellationFee = 8.00;
        double cancellationFeeBeforeTwoMinutes = 0d;
        double convertedSeconds = inputSeconds + (inputMinutes * 60) + (inputHours * 3600);
        double totalTime = totalTimeRecalculated * secondFee;
        double milesConverted = inputMiles * 1760;
        double totalMiles = inputConvertedMiles * milesFee;
        double driverWaitingTime = inputWaitingTimeSeconds * secondFee;

        double tariff = baseFee + totalTime + totalMiles;

        // SURGE PRICE CALCULATION
        double dynamicTariff = 0d;
        for (int i = 0; i <= inputSurgePrice; i++) {
            dynamicTariff = (tariff * inputSurgePrice) - tariff;
        }

        double totalGrossFeeOfRide = tariff + driverWaitingTime + dynamicTariff;
        double waitingTimePercentage = (driverWaitingTime * 25.0) / 100; // correct calculation
        double happyHourPercentage = (dynamicTariff * 25.0) / 100; // correct calculation
        double totalUberPercentage = ((tariff * 25.0) / 100 + waitingTimePercentage + happyHourPercentage);

        // MINIM FEE CALCULATION + SURGE
        if ((tariff < minimFee) && (inputSurgePrice < 0)) {
            tariff = (minimFee - tariff) + tariff;
            totalUberPercentage = ((tariff * 25.0) / 100);
            totalGrossFeeOfRide = minimFee;
            dynamicTariff = 0;

        } else if ((tariff < minimFee) && (inputSurgePrice > 0)) { // MINIM FEE CALCULATION + SURGE
            tariff = (minimFee - tariff) + tariff;
            dynamicTariff = (minimFee * inputSurgePrice) - minimFee;
            totalGrossFeeOfRide = minimFee + inputWaitingTimeValue + dynamicTariff;
            totalUberPercentage = ((totalGrossFeeOfRide * 25.0) / 100);
        }

        // DRIVER EARNINGS WITH OUT SURGE PRICE
        if (inputSurgePrice == 0) {
            totalGrossFeeOfRide = tariff;
            totalUberPercentage = ((tariff * 25.0) / 100 + waitingTimePercentage);
            dynamicTariff = 0;
        }

        // RIDER CANCELLATION CALCULATION AFTER TWO MINUTES
        if ((convertedSeconds > 120) && (convertedSeconds < 480) && (milesConverted == 0) && (inputWaitingTimeValue == 0) && (inputSurgePrice == 0)) {
            tariff = cancellationFee;
            totalUberPercentage = ((cancellationFee * 25.0) / 100);
            totalGrossFeeOfRide = cancellationFee;
            dynamicTariff = 0;
        }

        // RIDER CANCELLATION BEFORE TWO MINUTES
        if ((convertedSeconds == 0) && (milesConverted == 0) && (inputWaitingTimeValue == 0) && (inputSurgePrice == 0)) {
            tariff = cancellationFeeBeforeTwoMinutes;
            totalUberPercentage = ((cancellationFeeBeforeTwoMinutes * 25.0) / 100);
            totalGrossFeeOfRide = cancellationFeeBeforeTwoMinutes;
            dynamicTariff = 0;
        }

        double clearDriverMoney = ((tariff + driverWaitingTime + dynamicTariff + inputTips) - totalUberPercentage);


        mainTextArea.setText("\t #) Tariff Fee:                 = " + String.format("%.2f", tariff) + " £\n" +
                "\t #) Dynamic Tariff:         = " + String.format("%.2f", dynamicTariff) + " £\n" +
                "\t #) Waiting Time:            = " + String.format("%.2f", driverWaitingTime) + " £\n" +
                "\t #) Total Charge Fee:    = " + String.format("%.2f", totalGrossFeeOfRide) + " £\n" +
                "\t #) Uber Fee:                  = " + String.format("%.2f", totalUberPercentage) + " £\n" +
                "\t #) Your Tips:                  = " + String.format("%.2f", inputTips) + " £\n" +
                "\t #) Your Earnings           = " + String.format("%.2f", clearDriverMoney) + " £\n\n" +
                "              THANKS FOR USING OUR SOFTWARE\n" +
                "\t HAVE A NICE DAY " + inputName + " ☹ ");
    }


    /**
     * Method to handler the continue button first window.
     */

    private class ContinueButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            mainWindow.setSize(1200, 720);
            mainWindow.setLocationRelativeTo(null);
            welcomeMessagePanel.setVisible(true);
            startButtonPanel.setVisible(true);

            String welcomeName = driverInputName.getText();
            String welcomeLevel = driverInputLevel.getText();
            welcomeTextArea.setText("Welcome " + welcomeName + " from uber " + welcomeLevel + " platform, let's get started.");
            welcomeTextArea.setEditable(false);

        }
    }


    /**
     * Method to handler the start button first window.
     */

    private class StartButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            calculatorSecondWindow();
            //calculateDriverEarningsIfHoursIsBiggerThenZero();
        }
    }

    /**
     * METHOD TO CONVERT TIME FORMAT 01:10:30 IN NUMBER OF SECONDS TO BE
     * USED AS A TOTAL TIME SECOND WINDOW
     */

    private double convertTimeFormatInSeconds() {

        double convertedSeconds;
        double inputHours = Double.parseDouble(userInput_3.getText());
        double inputMinutes = Double.parseDouble(userInput_4.getText());
        double inputSeconds = Double.parseDouble(userInput_5.getText());

        if ((inputHours < 0) || (inputMinutes < 0) || (inputSeconds < 0)) {
            mainTextArea.setText("NEGATIVE VALUE ENTERED\nRESTART THE PROGRAM AND\nTRAY AGAIN");
            return -1;
        } else {
            convertedSeconds = inputSeconds + (inputMinutes * 60) + (inputHours * 3600);
        }

        return convertedSeconds;
    }

    /**
     * Method to convert miles in yards window 2
     */

    private double convertMilesInYards() {
        double milesConverted;
        double inputMiles = Double.parseDouble(userInput_7.getText());
        if (inputMiles < 0) {
            mainTextArea.setBackground(Color.black);
            mainTextArea.setText("NEGATIVE VALUE ENTERED\nRESTART THE PROGRAM AND\nTRAY AGAIN");
            return -1;
        } else {
            milesConverted = inputMiles * 1760;
        }

        return milesConverted;
    }


    /**
     * METHOD TO CALCULATE SECONDS SPEND ON TRIP BASED ON THE WAITING TIME GIVEN BY UBER WINDOW 2
     */

    private double convertWaitingTimeInSeconds() {

        double secondsSpendOnTrip;
        double inputWaitingTimeValue = Double.parseDouble(userInput_9.getText());
        if (inputWaitingTimeValue < 0) {
            mainTextArea.setBackground(Color.black);
            mainTextArea.setText("NEGATIVE VALUE ENTERED\nRESTART THE PROGRAM AND\nTRAY AGAIN");
            return -1;
        } else {
            secondsSpendOnTrip = inputWaitingTimeValue / 0.005;
        }

        return secondsSpendOnTrip;
    }

    /**
     * Method to handler the converted time button window 2 .
     */

    private class TotalTimeButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String inputName = userInput_1.getText();
            double inputHours = Double.parseDouble(userInput_3.getText());
            double inputMinutes = Double.parseDouble(userInput_4.getText());
            double inputSeconds = Double.parseDouble(userInput_5.getText());
            convertTimeFormatInSeconds();
            mainTextArea.setBackground(Color.GRAY);


            if ((inputHours < 0) || (inputMinutes < 0) || (inputSeconds < 0)) {
                mainTextArea.setText(" NEGATIVE VALUE ENTERED RESTART THE PROGRAM \tAND TRAY AGAIN " + inputName + " ☹ ");

            } else {
                mainTextArea.setText("\t#: ENTER THIS NO: [  " + convertTimeFormatInSeconds() + "  ]\n\t#: IN THE TOTAL TIME FIELD");
            }
        }
    }

    /**
     * Method to handler the converted miles button window 2.
     */

    private class ConvertedMilesButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            convertMilesInYards();
            mainTextArea.setBackground(Color.GRAY);
            mainTextArea.setText("\t#: ENTER THIS NO: [  " + convertMilesInYards() + "  ]\n\t#: IN THE CONVERTED MILES FIELD");
        }
    }

    /**
     * Method to handler the waiting time  button window 2
     */

    private class WaitingTimeButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            convertWaitingTimeInSeconds();
            mainTextArea.setBackground(Color.GRAY);
            mainTextArea.setText("\t#: ENTER THIS NO: [  " +  convertWaitingTimeInSeconds() + "  ]\n\t#: IN WAITING TIME CONVERTED FIELD");
        }
    }

    /**
     * Method to handler the calculate button first scenario second window.
     */

    private class CalculateButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            calculateDriverEarnings();
            mainWindow.setSize(1200, 720);
            textAreaPanel.setBounds(100, 360, 1000, 250);
            mainTextArea.setBounds(100, 360, 500, 300);
            mainTextArea.setBackground(Color.GRAY);

        }
    }


    /////////////////////////////////////////////
    // START METHODS AN HANDLERS FOR WINDOW 3  //
    /////////////////////////////////////////////


    /**
     * METHOD TO CONVERT TIME FORMAT 01:10:30 IN NUMBER OF SECONDS TO BE USED AS A TOTAL TIME.
     */

    private double convertTimeFormatInSecondsWindow_3() {


        double convertedSeconds;
        double inputHours = Double.parseDouble(input_2.getText());
        double inputMinutes = Double.parseDouble(input_3.getText());
        double inputSeconds = Double.parseDouble(input_4.getText());

        if ((inputHours < 0) || (inputMinutes < 0) || (inputSeconds < 0)) {
            mainTextArea.setText("NEGATIVE VALUE ENTERED\nRESTART THE PROGRAM AND\nTRAY AGAIN");
            return -1;
        } else {
            convertedSeconds = inputSeconds + (inputMinutes * 60) + (inputHours * 3600);
        }

        return convertedSeconds;
    }

    /**
     * Method to handler the converted time second button window 3 .
     */

    private class timeButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            convertTimeFormatInSecondsWindow_3();
            mainTextArea.setBackground(Color.GRAY);
            mainWindow.setSize(1200, 500);
            textAreaPanel.setBounds(100, 360, 1000, 55);
            mainTextArea.setBounds(100, 360, 500, 55);
            mainTextArea.setFont(mainFont);
            mainTextArea.setText("\t#: ENTER THIS NO: [  " +  convertTimeFormatInSecondsWindow_3() + "  ]\n\t#: IN THE TIME FIELD.");
        }
    }

    /**
     * Method to convert miles in yards window 3
     */

    private double convertMilesInYardsWindow_3() {

        double milesConverted;
        double inputMiles = Double.parseDouble(input_6.getText());
        if (inputMiles < 0) {
            mainTextArea.setBackground(Color.black);
            mainTextArea.setText("NEGATIVE VALUE ENTERED\nRESTART THE PROGRAM AND\nTRAY AGAIN");
            return -1;
        } else {
            milesConverted = inputMiles * 1760;
        }

        return milesConverted;
    }

    /**
     * Method to handler the converted miles button window 3.
     */

    private class ConvertedMilesButtonHandlerWindow_3 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            convertMilesInYardsWindow_3();
            mainTextArea.setBackground(Color.GRAY);
            mainTextArea.setText("\t#: ENTER THIS NO: [  " + convertMilesInYardsWindow_3() + "  ]\n\t#: IN THE CONVERTED MILES FIELD");
        }
    }

    /**
     * METHOD TO CALCULATE SECONDS SPEND ON TRIP BASED ON THE WAITING TIME GIVEN BY UBER WINDOW 2
     */

    private  double convertWaitingTimeInSecondsWindow_3() {

        double secondsSpendOnTrip;
        double inputWaitingTimeValue = Double.parseDouble(input_9.getText());
        if (inputWaitingTimeValue < 0) {
            mainTextArea.setBackground(Color.black);
            mainTextArea.setText("NEGATIVE VALUE ENTERED\nRESTART THE PROGRAM AND\nTRAY AGAIN");
            return -1;
        } else {
            secondsSpendOnTrip = inputWaitingTimeValue / 0.005;
        }

        return secondsSpendOnTrip;

    }

    /**
     * Method to handler the waiting time  button window 3
     */

    private class WaitingTimeButtonHandlerWindow_3 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            convertWaitingTimeInSecondsWindow_3();
            mainTextArea.setBackground(Color.GRAY);
            mainTextArea.setText("\t#: ENTER THIS NO: [  " + convertWaitingTimeInSecondsWindow_3() + "  ]\n\t#: IN WAITING TIME CONVERTED FIELD");
        }
    }

    /**
     * Method for handler the calculate button second scenario window 3.
     */

    private class CalculateSecondButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            calculateDriverEarningsIfHoursIsBiggerThenZero();
            mainWindow.setSize(1200, 720);
            textAreaPanel.setBounds(100, 360, 1000, 250);
            mainTextArea.setBounds(100, 360, 500, 300);
            mainTextArea.setBackground(Color.GRAY);
            mainTextArea.setFont(mainFont);
        }
    }


    /**
     * Method to get the remaining seconds based on the tariff value window 3
     */

    private double getRemainingSeconds() {

        double remainingSeconds;

        double tariffEntered = Double.parseDouble(input_1.getText());
        double inputTotalSeconds = Double.parseDouble(input_5.getText());
        double inputConvertedMiles = Double.parseDouble(input_7.getText());

        double remainingSecondsValue = tariffEntered - ((inputTotalSeconds * 0.005) + (inputConvertedMiles * 0.0013636363636364) + 4);// 4 is the base fee
        remainingSeconds = remainingSecondsValue / 0.005;

        return remainingSeconds;

    }

    /**
     * Method to handler the converted time second button window 3.
     */

    private class TotalTimeSecondButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            convertTimeFormatInSecondsWindow_3();
            getRemainingSeconds();
            mainTextArea.setBackground(Color.GRAY);
            mainTextArea.setText("\t#: ENTER THIS NO: [ " +  (convertTimeFormatInSecondsWindow_3() + getRemainingSeconds()) + " ]\n\t#: IN THE TOTAL TIME FIELD ");
        }
    }

    /**
     * Method for user input to type directly upper case window 1 and 2 .
     */

    private class UppercaseDocumentFilter extends DocumentFilter {
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String text,
                                 AttributeSet attr) throws BadLocationException {

            fb.insertString(offset, text.toUpperCase(), attr);
        }

        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
                            AttributeSet attrs) throws BadLocationException {

            fb.replace(offset, length, text.toUpperCase(), attrs);
        }
    }

}
