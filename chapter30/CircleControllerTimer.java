package chapter30;

import java.awt.event.*;
import javax.swing.*;

public class CircleControllerTimer {
	private CircleModel model;
	private Timer radiusTimer = new Timer(1000, new TimerListener());
	
	/** Creates new form CircleControllerTimer */
	public CircleControllerTimer() {
		radiusTimer.start();
	}

	public void setModel(CircleModel newModel) {
		model = newModel;
	}

	public CircleModel getModel() {
		return model;
	}

	class TimerListener implements ActionListener {
		/** Handle ActionEvent */
		public void actionPerformed(ActionEvent e){
			double currentRadius = model.getRadius();
			if (currentRadius > 100)
				currentRadius = 0; 
			model.setRadius(currentRadius + 10);
		}
	}
}