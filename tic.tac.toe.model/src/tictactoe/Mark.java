/**
 */
package tictactoe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.Mark#getColor <em>Color</em>}</li>
 *   <li>{@link tictactoe.Mark#getPos_x <em>Pos x</em>}</li>
 *   <li>{@link tictactoe.Mark#getPos_y <em>Pos y</em>}</li>
 *   <li>{@link tictactoe.Mark#getSquare <em>Square</em>}</li>
 * </ul>
 *
 * @see tictactoe.TictactoePackage#getMark()
 * @model
 * @generated
 */
public interface Mark extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link tictactoe.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see tictactoe.Color
	 * @see #setColor(Color)
	 * @see tictactoe.TictactoePackage#getMark_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link tictactoe.Mark#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see tictactoe.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos x</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos x</em>' attribute.
	 * @see #setPos_x(int)
	 * @see tictactoe.TictactoePackage#getMark_Pos_x()
	 * @model
	 * @generated
	 */
	int getPos_x();

	/**
	 * Sets the value of the '{@link tictactoe.Mark#getPos_x <em>Pos x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos x</em>' attribute.
	 * @see #getPos_x()
	 * @generated
	 */
	void setPos_x(int value);

	/**
	 * Returns the value of the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos y</em>' attribute.
	 * @see #setPos_y(int)
	 * @see tictactoe.TictactoePackage#getMark_Pos_y()
	 * @model
	 * @generated
	 */
	int getPos_y();

	/**
	 * Sets the value of the '{@link tictactoe.Mark#getPos_y <em>Pos y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos y</em>' attribute.
	 * @see #getPos_y()
	 * @generated
	 */
	void setPos_y(int value);

	/**
	 * Returns the value of the '<em><b>Square</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tictactoe.Square#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Square</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' reference.
	 * @see tictactoe.TictactoePackage#getMark_Square()
	 * @see tictactoe.Square#getMark
	 * @model opposite="mark" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.square'"
	 * @generated
	 */
	Square getSquare();

} // Mark
