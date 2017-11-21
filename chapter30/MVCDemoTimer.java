package chapter30;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MVCDemoTimer extends JApplet  {
  private JButton jbtController = new JButton("Start Controller");
  private JButton jbtView = new JButton("Show View");
  private CircleModel model = new CircleModel();

  public MVCDemoTimer() {
    setLayout(new FlowLayout());
    add(jbtController);
    add(jbtView);

    jbtController.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        CircleControllerTimer controller = new CircleControllerTimer();
        controller.setModel(model);
      }
    });

    jbtView.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("View");
        CircleView view = new CircleView();
        view.setModel(model);
        frame.add(view);
        frame.setSize(500, 200);
        frame.setLocation(200, 200);
        frame.setVisible(true);
      }
    });
  }

  public static void main(String[] args) {
    MVCDemoTimer applet = new MVCDemoTimer();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("MVCDemoTimer");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}