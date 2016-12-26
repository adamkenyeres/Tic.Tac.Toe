package tic.tac.toe.generator;

import java.io.IOException;
import java.util.Collections;

import javax.naming.InitialContext;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.junit.Test;

import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Player;
import tictactoe.Square;
import tictactoe.TictactoeFactory;
import tictactoe.TictactoePackage;

public class Generator {
	public static void init() {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("chess", new XMIResourceFactoryImpl());
		TictactoePackage.eINSTANCE.eClass();
	}

	public static Resource createResource(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		return resource;
	}

	public static Resource loadResource(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		return resource;
	}

	public static void saveResource(Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			System.out.println("The following error occurred during saving the resource: " + e.getMessage());
		}
	}

	public static Engine createEngine() {
		TictactoeFactory factory = TictactoeFactory.eINSTANCE;
		Engine engine = factory.createEngine();
		engine.setIsOTurn(false);
		Player black = factory.createPlayer();
		Player white = factory.createPlayer();
		black.setColor(Color.BLACK);
		white.setColor(Color.WHITE);

		for (int i = 1; i > -2; i--) {
			for (int j = -1; j < 2; j++) {
				Square square = factory.createSquare();
				square.setPos_x(j);
				square.setPos_y(i);
				System.out.println("X: " + square.getPos_x() + " y: " + square.getPos_y());
				engine.getSquare().add(square);
			}
		}
		System.out.println("\n");
		for (int i = 0; i < 9; i++) {
			Square s = engine.getSquare().get(i);
			System.out.println("X: " + s.getPos_x() + " y: " + s.getPos_y());
		}
		engine.setBlackPlayer(black);
		engine.setWhitePlayer(white);
		return engine;
	}
}
