/**
 *
 * $Id$
 */
package tictactoe.validation;

import tictactoe.Mark;
import tictactoe.Square;

/**
 * A sample validator interface for {@link tictactoe.Square}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SquareValidator {
	boolean validate();

	boolean validatePos_x(int value);
	boolean validatePos_y(int value);
	boolean validateMark(Mark value);

	boolean validateN(Square value);

	boolean validateE(Square value);

	boolean validateS(Square value);

	boolean validateW(Square value);

	boolean validateNE(Square value);

	boolean validateSE(Square value);

	boolean validateSW(Square value);

	boolean validateNW(Square value);
}