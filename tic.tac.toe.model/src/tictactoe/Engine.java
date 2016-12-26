/**
 */
package tictactoe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.Engine#getIsOTurn <em>Is OTurn</em>}</li>
 *   <li>{@link tictactoe.Engine#getSquare <em>Square</em>}</li>
 *   <li>{@link tictactoe.Engine#getBlackPlayer <em>Black Player</em>}</li>
 *   <li>{@link tictactoe.Engine#getWhitePlayer <em>White Player</em>}</li>
 * </ul>
 *
 * @see tictactoe.TictactoePackage#getEngine()
 * @model
 * @generated
 */
public interface Engine extends EObject {
	/**
	 * Returns the value of the '<em><b>Is OTurn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is OTurn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is OTurn</em>' attribute.
	 * @see #setIsOTurn(Boolean)
	 * @see tictactoe.TictactoePackage#getEngine_IsOTurn()
	 * @model
	 * @generated
	 */
	Boolean getIsOTurn();

	/**
	 * Sets the value of the '{@link tictactoe.Engine#getIsOTurn <em>Is OTurn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is OTurn</em>' attribute.
	 * @see #getIsOTurn()
	 * @generated
	 */
	void setIsOTurn(Boolean value);

	/**
	 * Returns the value of the '<em><b>Square</b></em>' containment reference list.
	 * The list contents are of type {@link tictactoe.Square}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Square</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' containment reference list.
	 * @see tictactoe.TictactoePackage#getEngine_Square()
	 * @model containment="true"
	 * @generated
	 */
	EList<Square> getSquare();

	/**
	 * Returns the value of the '<em><b>Black Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Black Player</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Black Player</em>' containment reference.
	 * @see #setBlackPlayer(Player)
	 * @see tictactoe.TictactoePackage#getEngine_BlackPlayer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getBlackPlayer();

	/**
	 * Sets the value of the '{@link tictactoe.Engine#getBlackPlayer <em>Black Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Black Player</em>' containment reference.
	 * @see #getBlackPlayer()
	 * @generated
	 */
	void setBlackPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>White Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Player</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Player</em>' containment reference.
	 * @see #setWhitePlayer(Player)
	 * @see tictactoe.TictactoePackage#getEngine_WhitePlayer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getWhitePlayer();

	/**
	 * Sets the value of the '{@link tictactoe.Engine#getWhitePlayer <em>White Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Player</em>' containment reference.
	 * @see #getWhitePlayer()
	 * @generated
	 */
	void setWhitePlayer(Player value);

} // Engine
