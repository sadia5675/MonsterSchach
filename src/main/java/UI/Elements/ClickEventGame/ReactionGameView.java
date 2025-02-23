package UI.Elements.ClickEventGame;

import java.util.List;

import Business.Competition.Circle.ShrinkingCircle;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

public class ReactionGameView {
	BorderPane borderPane;
	Pane pane;
	Label time;
	Label score;
	private List<ShrinkingCircle> circles;

	public ReactionGameView() {
		borderPane = new BorderPane();
		pane = new Pane();
		time = new Label("Time");
		score = new Label("Score");
		circles = new ArrayList<>();

		VBox bottomVBox = new VBox();
		HBox widthFromRightToScore = new HBox();
		HBox bottomHBox = new HBox();
		VBox widthBetween = new VBox();
		VBox timeVBox = new VBox();

		widthBetween.setPrefWidth(250);
		widthFromRightToScore.setPrefWidth(20);
		timeVBox.getChildren().add(time);
		bottomHBox.getChildren().addAll(widthFromRightToScore, score, widthBetween, timeVBox);

		bottomVBox.getChildren().add(bottomHBox);
		borderPane.setBottom(bottomVBox);

		createCircle();
		borderPane.setCenter(pane);
	}

	public void createCircle() {

		ShrinkingCircle circle = new ShrinkingCircle(40, Color.RED);
		circles.add(circle);
		System.out.println("Aktueller Kreisindex: " + circles.indexOf(circle));

		// Zuf�llige Position f�r den Kreis innerhalb der Pane
		double circleX = Math.random() * (pane.getWidth() - circle.getRadius() * 2) + circle.getRadius();
		double circleY = Math.random() * (pane.getHeight() - circle.getRadius() * 2) + circle.getRadius();

		// �berpr�fen, ob der Kreis zu nah am oberen Rand liegt
		if (circleY < circle.getRadius()) {
			circleY = circle.getRadius() * 2;
		}

		// �berpr�fen, ob der Kreis zu nah am linken Rand liegt
		if (circleX < circle.getRadius()) {
			circleX = circle.getRadius() * 2;
		}

		circle.setCenterX(circleX);
		circle.setCenterY(circleY);

		pane.getChildren().add(circle);
		circles.add(circle);

		// Animation starten
		circle.render();
	}

	public List<ShrinkingCircle> getCircles() {
		return circles;
	}

	public void removeCircle(ShrinkingCircle circle) {
		circles.remove(circle);
		pane.getChildren().remove(circle);
	}

	public BorderPane getBorderPane() {
		return borderPane;
	}
}