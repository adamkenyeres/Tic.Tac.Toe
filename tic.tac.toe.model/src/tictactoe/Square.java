/**
 */
package tictactoe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.Square#getPos_y <em>Pos y</em>}</li>
 *   <li>{@link tictactoe.Square#getPos_x <em>Pos x</em>}</li>
 *   <li>{@link tictactoe.Square#getMark <em>Mark</em>}</li>
 *   <li>{@link tictactoe.Square#getN <em>N</em>}</li>
 *   <li>{@link tictactoe.Square#getE <em>E</em>}</li>
 *   <li>{@link tictactoe.Square#getS <em>S</em>}</li>
 *   <li>{@link tictactoe.Square#getW <em>W</em>}</li>
 *   <li>{@link tictactoe.Square#getNE <em>NE</em>}</li>
 *   <li>{@link tictactoe.Square#getSE <em>SE</em>}</li>
 *   <li>{@link tictactoe.Square#getSW <em>SW</em>}</li>
 *   <li>{@link tictactoe.Square#getNW <em>NW</em>}</li>
 * </ul>
 *
 * @see tictactoe.TictactoePackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject {
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
	 * @see tictactoe.TictactoePackage#getSquare_Pos_x()
	 * @model
	 * @generated
	 */
	int getPos_x();

	/**
	 * Sets the value of the '{@link tictactoe.Square#getPos_x <em>Pos x</em>}' attribute.
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
	 * @see tictactoe.TictactoePackage#getSquare_Pos_y()
	 * @model
	 * @generated
	 */
	int getPos_y();

	/**
	 * Sets the value of the '{@link tictactoe.Square#getPos_y <em>Pos y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos y</em>' attribute.
	 * @see #getPos_y()
	 * @generated
	 */
	void setPos_y(int value);

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tictactoe.Mark#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_Mark()
	 * @see tictactoe.Mark#getSquare
	 * @model opposite="square" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.mark'"
	 * @generated
	 */
	Mark getMark();

	/**
	 * Returns the value of the '<em><b>N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_N()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.N'"
	 * @generated
	 */
	Square getN();

	/**
	 * Returns the value of the '<em><b>E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_E()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.E'"
	 * @generated
	 */
	Square getE();

	/**
	 * Returns the value of the '<em><b>S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_S()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.S'"
	 * @generated
	 */
	Square getS();

	/**
	 * Returns the value of the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_W()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.W'"
	 * @generated
	 */
	Square getW();

	/**
	 * Returns the value of the '<em><b>NE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NE</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_NE()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.NE'"
	 * @generated
	 */
	Square getNE();

	/**
	 * Returns the value of the '<em><b>SE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SE</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_SE()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.SE'"
	 * @generated
	 */
	Square getSE();

	/**
	 * Returns the value of the '<em><b>SW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SW</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SW</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_SW()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.SW'"
	 * @generated
	 */
	Square getSW();

	/**
	 * Returns the value of the '<em><b>NW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NW</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NW</em>' reference.
	 * @see tictactoe.TictactoePackage#getSquare_NW()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='queries.NW'"
	 * @generated
	 */
	Square getNW();

} // Square
