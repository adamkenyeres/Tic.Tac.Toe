/**
 */
package tictactoe.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tictactoe.Engine;
import tictactoe.Player;
import tictactoe.Square;
import tictactoe.TictactoePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tictactoe.impl.EngineImpl#getIsOTurn <em>Is OTurn</em>}</li>
 *   <li>{@link tictactoe.impl.EngineImpl#getSquare <em>Square</em>}</li>
 *   <li>{@link tictactoe.impl.EngineImpl#getBlackPlayer <em>Black Player</em>}</li>
 *   <li>{@link tictactoe.impl.EngineImpl#getWhitePlayer <em>White Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineImpl extends MinimalEObjectImpl.Container implements Engine {
	/**
	 * The default value of the '{@link #getIsOTurn() <em>Is OTurn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOTurn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_OTURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOTurn() <em>Is OTurn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOTurn()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOTurn = IS_OTURN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSquare() <em>Square</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquare()
	 * @generated
	 * @ordered
	 */
	protected EList<Square> square;

	/**
	 * The cached value of the '{@link #getBlackPlayer() <em>Black Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player blackPlayer;

	/**
	 * The cached value of the '{@link #getWhitePlayer() <em>White Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitePlayer()
	 * @generated
	 * @ordered
	 */
	protected Player whitePlayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TictactoePackage.Literals.ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOTurn() {
		return isOTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOTurn(Boolean newIsOTurn) {
		Boolean oldIsOTurn = isOTurn;
		isOTurn = newIsOTurn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.ENGINE__IS_OTURN, oldIsOTurn, isOTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Square> getSquare() {
		if (square == null) {
			square = new EObjectContainmentEList<Square>(Square.class, this, TictactoePackage.ENGINE__SQUARE);
		}
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getBlackPlayer() {
		return blackPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlackPlayer(Player newBlackPlayer, NotificationChain msgs) {
		Player oldBlackPlayer = blackPlayer;
		blackPlayer = newBlackPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TictactoePackage.ENGINE__BLACK_PLAYER, oldBlackPlayer, newBlackPlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlackPlayer(Player newBlackPlayer) {
		if (newBlackPlayer != blackPlayer) {
			NotificationChain msgs = null;
			if (blackPlayer != null)
				msgs = ((InternalEObject)blackPlayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TictactoePackage.ENGINE__BLACK_PLAYER, null, msgs);
			if (newBlackPlayer != null)
				msgs = ((InternalEObject)newBlackPlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TictactoePackage.ENGINE__BLACK_PLAYER, null, msgs);
			msgs = basicSetBlackPlayer(newBlackPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.ENGINE__BLACK_PLAYER, newBlackPlayer, newBlackPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getWhitePlayer() {
		return whitePlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhitePlayer(Player newWhitePlayer, NotificationChain msgs) {
		Player oldWhitePlayer = whitePlayer;
		whitePlayer = newWhitePlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TictactoePackage.ENGINE__WHITE_PLAYER, oldWhitePlayer, newWhitePlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhitePlayer(Player newWhitePlayer) {
		if (newWhitePlayer != whitePlayer) {
			NotificationChain msgs = null;
			if (whitePlayer != null)
				msgs = ((InternalEObject)whitePlayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TictactoePackage.ENGINE__WHITE_PLAYER, null, msgs);
			if (newWhitePlayer != null)
				msgs = ((InternalEObject)newWhitePlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TictactoePackage.ENGINE__WHITE_PLAYER, null, msgs);
			msgs = basicSetWhitePlayer(newWhitePlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TictactoePackage.ENGINE__WHITE_PLAYER, newWhitePlayer, newWhitePlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TictactoePackage.ENGINE__SQUARE:
				return ((InternalEList<?>)getSquare()).basicRemove(otherEnd, msgs);
			case TictactoePackage.ENGINE__BLACK_PLAYER:
				return basicSetBlackPlayer(null, msgs);
			case TictactoePackage.ENGINE__WHITE_PLAYER:
				return basicSetWhitePlayer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TictactoePackage.ENGINE__IS_OTURN:
				return getIsOTurn();
			case TictactoePackage.ENGINE__SQUARE:
				return getSquare();
			case TictactoePackage.ENGINE__BLACK_PLAYER:
				return getBlackPlayer();
			case TictactoePackage.ENGINE__WHITE_PLAYER:
				return getWhitePlayer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TictactoePackage.ENGINE__IS_OTURN:
				setIsOTurn((Boolean)newValue);
				return;
			case TictactoePackage.ENGINE__SQUARE:
				getSquare().clear();
				getSquare().addAll((Collection<? extends Square>)newValue);
				return;
			case TictactoePackage.ENGINE__BLACK_PLAYER:
				setBlackPlayer((Player)newValue);
				return;
			case TictactoePackage.ENGINE__WHITE_PLAYER:
				setWhitePlayer((Player)newValue);
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
			case TictactoePackage.ENGINE__IS_OTURN:
				setIsOTurn(IS_OTURN_EDEFAULT);
				return;
			case TictactoePackage.ENGINE__SQUARE:
				getSquare().clear();
				return;
			case TictactoePackage.ENGINE__BLACK_PLAYER:
				setBlackPlayer((Player)null);
				return;
			case TictactoePackage.ENGINE__WHITE_PLAYER:
				setWhitePlayer((Player)null);
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
			case TictactoePackage.ENGINE__IS_OTURN:
				return IS_OTURN_EDEFAULT == null ? isOTurn != null : !IS_OTURN_EDEFAULT.equals(isOTurn);
			case TictactoePackage.ENGINE__SQUARE:
				return square != null && !square.isEmpty();
			case TictactoePackage.ENGINE__BLACK_PLAYER:
				return blackPlayer != null;
			case TictactoePackage.ENGINE__WHITE_PLAYER:
				return whitePlayer != null;
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
		result.append(" (isOTurn: ");
		result.append(isOTurn);
		result.append(')');
		return result.toString();
	}

} //EngineImpl
