package tic.tac.toe.generator;

import java.util.ArrayList;
import java.util.List;

import tictactoe.Engine;

public class CareTaker {
	private List<BoardVisualizer.Memento> savedStates;

	public CareTaker() {
		savedStates = new ArrayList<BoardVisualizer.Memento>();
	}

	public BoardVisualizer.Memento getMemento() {
		savedStates.remove(savedStates.size() - 1);

		return savedStates.get(savedStates.size() - 1);

	}

	public int get_Size() {
		return savedStates.size();
	}

	public void addMemento(BoardVisualizer.Memento memento) {

		savedStates.add(memento);

	}

}