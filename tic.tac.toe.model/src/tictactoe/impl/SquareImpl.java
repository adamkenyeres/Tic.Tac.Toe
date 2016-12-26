/**
 */
package tictactoe.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tictactoe.Mark;
import tictactoe.Square;
import tictactoe.TictactoePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.impl.SquareImpl#getPos_y <em>Pos y</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getPos_x <em>Pos x</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getMark <em>Mark</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getN <em>N</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getE <em>E</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getS <em>S</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getW <em>W</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getNE <em>NE</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getSE <em>SE</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getSW <em>SW</em>}</li>
 *   <li>{@link tictactoe.impl.SquareImpl#getNW <em>NW</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square {
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
	 * The cached setting delegate for the '{@link #getMark() <em>Mark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MARK__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__MARK).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getN() <em>N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate N__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__N).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getE() <em>E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate E__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__E).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getS() <em>S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate S__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__S).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getW() <em>W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate W__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__W).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNE() <em>NE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNE()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__NE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSE() <em>SE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSE()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__SE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSW() <em>SW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSW()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__SW).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNW() <em>NW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNW()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TictactoePackage.Literals.SQUARE__NW).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TictactoePackage.Literals.SQUARE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.SQUARE__POS_X, oldPos_x, pos_x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.SQUARE__POS_Y, oldPos_y, pos_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark getMark() {
		return (Mark)MARK__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark basicGetMark() {
		return (Mark)MARK__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getN() {
		return (Square)N__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetN() {
		return (Square)N__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getE() {
		return (Square)E__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetE() {
		return (Square)E__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getS() {
		return (Square)S__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetS() {
		return (Square)S__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getW() {
		return (Square)W__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetW() {
		return (Square)W__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getNE() {
		return (Square)NE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetNE() {
		return (Square)NE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSE() {
		return (Square)SE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetSE() {
		return (Square)SE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSW() {
		return (Square)SW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetSW() {
		return (Square)SW__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getNW() {
		return (Square)NW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetNW() {
		return (Square)NW__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TictactoePackage.SQUARE__POS_Y:
				return getPos_y();
			case TictactoePackage.SQUARE__POS_X:
				return getPos_x();
			case TictactoePackage.SQUARE__MARK:
				if (resolve) return getMark();
				return basicGetMark();
			case TictactoePackage.SQUARE__N:
				if (resolve) return getN();
				return basicGetN();
			case TictactoePackage.SQUARE__E:
				if (resolve) return getE();
				return basicGetE();
			case TictactoePackage.SQUARE__S:
				if (resolve) return getS();
				return basicGetS();
			case TictactoePackage.SQUARE__W:
				if (resolve) return getW();
				return basicGetW();
			case TictactoePackage.SQUARE__NE:
				if (resolve) return getNE();
				return basicGetNE();
			case TictactoePackage.SQUARE__SE:
				if (resolve) return getSE();
				return basicGetSE();
			case TictactoePackage.SQUARE__SW:
				if (resolve) return getSW();
				return basicGetSW();
			case TictactoePackage.SQUARE__NW:
				if (resolve) return getNW();
				return basicGetNW();
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
			case TictactoePackage.SQUARE__POS_Y:
				setPos_y((Integer)newValue);
				return;
			case TictactoePackage.SQUARE__POS_X:
				setPos_x((Integer)newValue);
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
			case TictactoePackage.SQUARE__POS_Y:
				setPos_y(POS_Y_EDEFAULT);
				return;
			case TictactoePackage.SQUARE__POS_X:
				setPos_x(POS_X_EDEFAULT);
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
			case TictactoePackage.SQUARE__POS_Y:
				return pos_y != POS_Y_EDEFAULT;
			case TictactoePackage.SQUARE__POS_X:
				return pos_x != POS_X_EDEFAULT;
			case TictactoePackage.SQUARE__MARK:
				return MARK__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__N:
				return N__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__E:
				return E__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__S:
				return S__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__W:
				return W__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__NE:
				return NE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__SE:
				return SE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__SW:
				return SW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TictactoePackage.SQUARE__NW:
				return NW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (pos_y: ");
		result.append(pos_y);
		result.append(", pos_x: ");
		result.append(pos_x);
		result.append(')');
		return result.toString();
	}

} //SquareImpl
