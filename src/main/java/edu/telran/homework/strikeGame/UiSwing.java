package edu.telran.homework.strikeGame;


import javax.swing.*;
import java.awt.*;

public final class UiSwing implements Runnable {

    public static void main(String[] args) {

        SwingUtilities.invokeLater (new UiSwing());
    }

    public void run() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){
            System.out.println("Ошибка при загрузке Metal-Look-And-Feel");
        }

        JFrame f = new JFrame ("Strike game");
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.PAGE_AXIS));
        f.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        f.setPreferredSize(new Dimension(420,360));
        f.add(Box.createRigidArea(new Dimension(10, 10)));

        JLabel jlHeader = new JLabel("Strike game");
        jlHeader.setAlignmentX(JLabel.CENTER);

        JPanel jpButtons= new JPanel();
        jpButtons.setLayout(new FlowLayout());
        jpButtons.setAlignmentX(JPanel.RIGHT_ALIGNMENT);
        jpButtons.setAlignmentY(JPanel.BOTTOM_ALIGNMENT);

        JButton jbStart = new JButton("Start game");
        jbStart.setHorizontalAlignment(JButton.RIGHT);

        JButton jbExit = new JButton("Exit");
        jbExit.setHorizontalAlignment(JButton.RIGHT);

        jpButtons.add(jbStart);
        jpButtons.add(jbExit);

        f.getContentPane().add(jlHeader);
        f.getContentPane().add(jpButtons);

        // pack() "упаковывает" окно до оптимального размера, рассчитанного на основании размеров
        // всех расположенных в нём компонентов.
        f.pack();

        // Показать окно
        f.setVisible(true);
    }
}