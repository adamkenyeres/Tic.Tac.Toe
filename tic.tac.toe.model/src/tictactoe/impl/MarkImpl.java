/**
 */
package tictactoe.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tictactoe.Color;
import tictactoe.Mark;
import tictactoe.Square;
import tictactoe.TictactoePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.impl.MarkImpl#getColor <em>Color</em>}</li>
 *   <li>{@link tictactoe.impl.MarkImpl#getPos_x <em>Pos x</em>}</li>
 *   <li>{@link tictactoe.impl.MarkImpl#getPos_y <em>Pos y</em>}</li>
 *   <li>{@link tictactoe.impl.MarkImpl#getSquare <em>Square</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkImpl extends MinimalEObjectImpl.Container implements Mark {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPos_x() <em>Pos x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_x()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos_x() <em>Pos x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_x()
	 * @generated
	 * @ordered
	 */
	protected int pos_x = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPos_y() <em>Pos y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_y()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos_y() <em>Pos y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_y()
	 * @generated
	 * @ordered
	 */
	protected int pos_y = POS_Y_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getSquare() <em>Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquare()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SQUARE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.MARK__SQUARE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TictactoePackage.Literals.MARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.MARK__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPos_x() {
		return pos_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos_x(int newPos_x) {
		int oldPos_x = pos_x;
		pos_x = newPos_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.MARK__POS_X, oldPos_x, pos_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPos_y() {
		return pos_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos_y(int newPos_y) {
		int oldPos_y = pos_y;
		pos_y = newPos_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.MARK__POS_Y, oldPos_y, pos_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSquare() {
		return (Square)SQUARE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetSquare() {
		return (Square)SQUARE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TictactoePackage.MARK__COLOR:
				return getColor();
			case TictactoePackage.MARK__POS_X:
				return getPos_x();
			case TictactoePackage.MARK__POS_Y:
				return getPos_y();
			case TictactoePackage.MARK__SQUARE:
				if (resolve) return getSquare();
				return basicGetSquare();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TictactoePackage.MARK__COLOR:
				setColor((Color)newValue);
				return;
			case TictactoePackage.MARK__POS_X:
				setPos_x((Integer)newValue);
				return;
			case TictactoePackage.MARK__POS_Y:
				setPos_y((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TictactoePackage.MARK__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case TictactoePackage.MARK__POS_X:
				setPos_x(POS_X_EDEFAULT);
				return;
			case TictactoePackage.MARK__POS_Y:
				setPos_y(POS_Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TictactoePackage.MARK__COLOR:
				return color != COLOR_EDEFAULT;
			case TictactoePackage.MARK__POS_X:
				return pos_x != POS_X_EDEFAULT;
			case TictactoePackage.MARK__POS_Y:
				return pos_y != POS_Y_EDEFAULT;
			case TictactoePackage.MARK__SQUARE:
				return SQUARE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", pos_x: ");
		result.append(pos_x);
		result.append(", pos_y: ");
		result.append(pos_y);
		result.append(')');
		return result.toString();
	}

} //MarkImpl
