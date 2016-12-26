package tic.tac.toe.generator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import tic.tac.toe.transformation.TransformationRules;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Square;

public class BoardVisualizer implements ActionListener {
	private JPanel board;
	private JFrame jf;
	private JPanel jp;
	private JButton New;
	private JButton exit;
	private JButton back;
	private CareTaker caretaker;
	Engine engine;
	TransformationRules rules;
	Square clickedSquare;
	public JButton btn[][];

	public BoardVisualizer(Resource resource, Engine engine) throws ViatraQueryException {
		this.engine = engine;
		ViatraQueryEngine.on(new EMFScope(resource/* or resourceSet */));
		rules = new TransformationRules(resource, engine, this);
		board = new JPanel();
		board.setLayout(new GridLayout(3, 4));
		board.setPreferredSize(new Dimension(300, 300));
		DrawBoard();
		jf = new JFrame("Tic Tac Toe");
		jp = new JPanel();
		New = new JButton("New Game");
		New.setName("New");
		exit = new JButton("Exit");
		exit.setName("Exit");
		back = new JButton("Back");
		back.setName("Back");
		GridBagConstraints c = new GridBagConstraints();
		jf.setSize(450, 400);
		jf.setVisible(true);

		jp.setLayout(new GridBagLayout());

		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(20, 20, 20, 20);
		jp.add(New, c);
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		jp.add(exit, c);
		c.gridx = 0;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		jp.add(back, c);
		jf.getContentPane().add(jp, BorderLayout.WEST);
		jf.getContentPane().add(board, BorderLayout.CENTER);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		New.addActionListener(this);
		exit.addActionListener(this);
		clickedSquare = null;
		rules.execute(clickedSquare, engine);
	}

	public void DrawBoard() {
		btn = new JButton[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				btn[i][j] = new JButton();
				btn[i][j].addActionListener(this);
				btn[i][j].setBackground(Color.CYAN);
				btn[i][j].setName(Integer.toString(i) + " " + Integer.toString(j));
				board.add(btn[i][j]);

			}
		}
		refresh();

	}

	public int getPos_x(int x) {
		int val;
		switch (x) {
		case 0:
			val = 1;
			break;

		case 1:
			val = 2;
			break;
		default:
			val = 0;
			break;
		}
		return val;
	}

	public int getPos_y(int y) {
		int val;
		switch (y) {
		case 0:
			val = 1;
			break;

		case 1:
			val = 0;
			break;
		default:
			val = 2;
			break;
		}
		return val;
	}

	public void refresh() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				btn[i][j].setIcon(null);
				btn[i][j].setText("");
			}
		}
		for (int i = 0; i < engine.getBlackPlayer().getMarks().size(); i++) {
			Mark m = engine.getBlackPlayer().getMarks().get(i);
			btn[getPos_y(m.getPos_y())][getPos_x(m.getPos_x())].setFont(new Font("Arial", Font.PLAIN, 40));
			btn[getPos_y(m.getPos_y())][getPos_x(m.getPos_x())].setText("X");
		}
		for (int i = 0; i < engine.getWhitePlayer().getMarks().size(); i++) {
			Mark m = engine.getWhitePlayer().getMarks().get(i);
			btn[getPos_y(m.getPos_y())][getPos_x(m.getPos_x())].setFont(new Font("Arial", Font.PLAIN, 40));
			btn[getPos_y(m.getPos_y())][getPos_x(m.getPos_x())].setText("O");
		}

	}

	public void startFromBegining() {
		engine.getBlackPlayer().getMarks().removeAll(engine.getBlackPlayer().getMarks());
		engine.getWhitePlayer().getMarks().removeAll(engine.getWhitePlayer().getMarks());
		engine.setIsOTurn(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		String name = button.getName();
		if (name.equals("New")) {
			startFromBegining();
			refresh();

		} else if (name.equals("Exit")) {
			System.exit(1);
		} else if (name.equals("Back")) {
			if (caretaker.get_Size() != 1)
				restoreFromMemento(caretaker.getMemento());

		} else {
			String[] nameParts = name.split(" ");
			int y = Integer.parseInt(nameParts[0]);
			int x = Integer.parseInt(nameParts[1]);
			for (Square sq : engine.getSquare()) {
				if (getPos_x(sq.getPos_x()) == x && getPos_y(sq.getPos_y()) == y) {
					clickedSquare = sq;
				}
			}
			if (clickedSquare != null) {
				rules.execute(clickedSquare, engine);
				clickedSquare = null;
			}
			refresh();
		}
	}

	public CareTaker getCareTaker() {
		return caretaker;
	}

	public void restoreFromMemento(Memento memento) {
		engine = memento.getSavedState();
	}

	public Memento saveToMemento() {
		return new Memento(engine);
	}

	public static class Memento {
		private final Engine state;

		public Memento(Engine stateToSave) {
			state = stateToSave;

		}

		public Engine getSavedState() {
			return state;
		}
	}

	public static void main(String[] args) throws ViatraQueryException, IOException {
		Generator.init();
		Engine engine = Generator.createEngine();
		URI uri = URI.createFileURI("C:/Users/Adam/tictacInit.chess");
		Resource resource = Generator.createResource(uri);
		resource.getContents().add(engine);
		Generator.saveResource(resource);
		BoardVisualizer game = new BoardVisualizer(resource, engine);
		System.in.read();
	}
}
