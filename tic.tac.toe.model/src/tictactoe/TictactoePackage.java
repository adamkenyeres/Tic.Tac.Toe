/**
 */
package tictactoe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tictactoe.TictactoeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.viatra.query.querybasedfeature'"
 * @generated
 */
public interface TictactoePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tictactoe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/tictactoe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tictactoe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TictactoePackage eINSTANCE = tictactoe.impl.TictactoePackageImpl.init();

	/**
	 * The meta object id for the '{@link tictactoe.impl.EngineImpl <em>Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.EngineImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getEngine()
	 * @generated
	 */
	int ENGINE = 0;

	/**
	 * The feature id for the '<em><b>Is OTurn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__IS_OTURN = 0;

	/**
	 * The feature id for the '<em><b>Square</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__SQUARE = 1;

	/**
	 * The feature id for the '<em><b>Black Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__BLACK_PLAYER = 2;

	/**
	 * The feature id for the '<em><b>White Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__WHITE_PLAYER = 3;

	/**
	 * The number of structural features of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.SquareImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 1;

	/**
	 * The feature id for the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__POS_Y = 0;

	/**
	 * The feature id for the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__POS_X = 1;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__MARK = 2;

	/**
	 * The feature id for the '<em><b>N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__N = 3;

	/**
	 * The feature id for the '<em><b>E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__E = 4;

	/**
	 * The feature id for the '<em><b>S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__S = 5;

	/**
	 * The feature id for the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__W = 6;

	/**
	 * The feature id for the '<em><b>NE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NE = 7;

	/**
	 * The feature id for the '<em><b>SE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SE = 8;

	/**
	 * The feature id for the '<em><b>SW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SW = 9;

	/**
	 * The feature id for the '<em><b>NW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NW = 10;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.PlayerImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MARKS = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.impl.MarkImpl
	 * @see tictactoe.impl.TictactoePackageImpl#getMark()
	 * @generated
	 */
	int MARK = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__POS_X = 1;

	/**
	 * The feature id for the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__POS_Y = 2;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__SQUARE = 3;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tictactoe.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tictactoe.Color
	 * @see tictactoe.impl.TictactoePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 4;


	/**
	 * Returns the meta object for class '{@link tictactoe.Engine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine</em>'.
	 * @see tictactoe.Engine
	 * @generated
	 */
	EClass getEngine();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Engine#getIsOTurn <em>Is OTurn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is OTurn</em>'.
	 * @see tictactoe.Engine#getIsOTurn()
	 * @see #getEngine()
	 * @generated
	 */
	EAttribute getEngine_IsOTurn();

	/**
	 * Returns the meta object for the containment reference list '{@link tictactoe.Engine#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Square</em>'.
	 * @see tictactoe.Engine#getSquare()
	 * @see #getEngine()
	 * @generated
	 */
	EReference getEngine_Square();

	/**
	 * Returns the meta object for the containment reference '{@link tictactoe.Engine#getBlackPlayer <em>Black Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Black Player</em>'.
	 * @see tictactoe.Engine#getBlackPlayer()
	 * @see #getEngine()
	 * @generated
	 */
	EReference getEngine_BlackPlayer();

	/**
	 * Returns the meta object for the containment reference '{@link tictactoe.Engine#getWhitePlayer <em>White Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Player</em>'.
	 * @see tictactoe.Engine#getWhitePlayer()
	 * @see #getEngine()
	 * @generated
	 */
	EReference getEngine_WhitePlayer();

	/**
	 * Returns the meta object for class '{@link tictactoe.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see tictactoe.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Square#getPos_x <em>Pos x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos x</em>'.
	 * @see tictactoe.Square#getPos_x()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Pos_x();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Square#getPos_y <em>Pos y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos y</em>'.
	 * @see tictactoe.Square#getPos_y()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Pos_y();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mark</em>'.
	 * @see tictactoe.Square#getMark()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Mark();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>N</em>'.
	 * @see tictactoe.Square#getN()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_N();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>E</em>'.
	 * @see tictactoe.Square#getE()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_E();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>S</em>'.
	 * @see tictactoe.Square#getS()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_S();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>W</em>'.
	 * @see tictactoe.Square#getW()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_W();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getNE <em>NE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>NE</em>'.
	 * @see tictactoe.Square#getNE()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_NE();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getSE <em>SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SE</em>'.
	 * @see tictactoe.Square#getSE()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_SE();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getSW <em>SW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SW</em>'.
	 * @see tictactoe.Square#getSW()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_SW();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Square#getNW <em>NW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>NW</em>'.
	 * @see tictactoe.Square#getNW()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_NW();

	/**
	 * Returns the meta object for class '{@link tictactoe.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see tictactoe.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tictactoe.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tictactoe.Player#getMarks <em>Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marks</em>'.
	 * @see tictactoe.Player#getMarks()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Marks();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Player#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see tictactoe.Player#getColor()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Color();

	/**
	 * Returns the meta object for class '{@link tictactoe.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see tictactoe.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Mark#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see tictactoe.Mark#getColor()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Color();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Mark#getPos_x <em>Pos x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos x</em>'.
	 * @see tictactoe.Mark#getPos_x()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Pos_x();

	/**
	 * Returns the meta object for the attribute '{@link tictactoe.Mark#getPos_y <em>Pos y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos y</em>'.
	 * @see tictactoe.Mark#getPos_y()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Pos_y();

	/**
	 * Returns the meta object for the reference '{@link tictactoe.Mark#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Square</em>'.
	 * @see tictactoe.Mark#getSquare()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Square();

	/**
	 * Returns the meta object for enum '{@link tictactoe.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see tictactoe.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TictactoeFactory getTictactoeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tictactoe.impl.EngineImpl <em>Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.EngineImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getEngine()
		 * @generated
		 */
		EClass ENGINE = eINSTANCE.getEngine();

		/**
		 * The meta object literal for the '<em><b>Is OTurn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE__IS_OTURN = eINSTANCE.getEngine_IsOTurn();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE__SQUARE = eINSTANCE.getEngine_Square();

		/**
		 * The meta object literal for the '<em><b>Black Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE__BLACK_PLAYER = eINSTANCE.getEngine_BlackPlayer();

		/**
		 * The meta object literal for the '<em><b>White Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE__WHITE_PLAYER = eINSTANCE.getEngine_WhitePlayer();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.SquareImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Pos x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__POS_X = eINSTANCE.getSquare_Pos_x();

		/**
		 * The meta object literal for the '<em><b>Pos y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__POS_Y = eINSTANCE.getSquare_Pos_y();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__MARK = eINSTANCE.getSquare_Mark();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__N = eINSTANCE.getSquare_N();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__E = eINSTANCE.getSquare_E();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__S = eINSTANCE.getSquare_S();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__W = eINSTANCE.getSquare_W();

		/**
		 * The meta object literal for the '<em><b>NE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__NE = eINSTANCE.getSquare_NE();

		/**
		 * The meta object literal for the '<em><b>SE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__SE = eINSTANCE.getSquare_SE();

		/**
		 * The meta object literal for the '<em><b>SW</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__SW = eINSTANCE.getSquare_SW();

		/**
		 * The meta object literal for the '<em><b>NW</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__NW = eINSTANCE.getSquare_NW();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.PlayerImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Marks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__MARKS = eINSTANCE.getPlayer_Marks();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__COLOR = eINSTANCE.getPlayer_Color();

		/**
		 * The meta object literal for the '{@link tictactoe.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.impl.MarkImpl
		 * @see tictactoe.impl.TictactoePackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__COLOR = eINSTANCE.getMark_Color();

		/**
		 * The meta object literal for the '<em><b>Pos x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__POS_X = eINSTANCE.getMark_Pos_x();

		/**
		 * The meta object literal for the '<em><b>Pos y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__POS_Y = eINSTANCE.getMark_Pos_y();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__SQUARE = eINSTANCE.getMark_Square();

		/**
		 * The meta object literal for the '{@link tictactoe.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tictactoe.Color
		 * @see tictactoe.impl.TictactoePackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //TictactoePackage
