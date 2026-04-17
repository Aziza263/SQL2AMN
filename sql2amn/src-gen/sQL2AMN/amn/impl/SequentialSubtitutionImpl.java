/**
 */
package sQL2AMN.amn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sQL2AMN.amn.AmnPackage;
import sQL2AMN.amn.SequentialSubtitution;
import sQL2AMN.amn.Substitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Subtitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.impl.SequentialSubtitutionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.SequentialSubtitutionImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequentialSubtitutionImpl extends SubstitutionImpl implements SequentialSubtitution {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Substitution first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Substitution second;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialSubtitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmnPackage.Literals.SEQUENTIAL_SUBTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substitution getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject) first;
			first = (Substitution) eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.SEQUENTIAL_SUBTITUTION__FIRST,
							oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirst(Substitution newFirst) {
		Substitution oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.SEQUENTIAL_SUBTITUTION__FIRST, oldFirst,
					first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substitution getSecond() {
		if (second != null && second.eIsProxy()) {
			InternalEObject oldSecond = (InternalEObject) second;
			second = (Substitution) eResolveProxy(oldSecond);
			if (second != oldSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.SEQUENTIAL_SUBTITUTION__SECOND,
							oldSecond, second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution basicGetSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecond(Substitution newSecond) {
		Substitution oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.SEQUENTIAL_SUBTITUTION__SECOND, oldSecond,
					second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AmnPackage.SEQUENTIAL_SUBTITUTION__FIRST:
			if (resolve)
				return getFirst();
			return basicGetFirst();
		case AmnPackage.SEQUENTIAL_SUBTITUTION__SECOND:
			if (resolve)
				return getSecond();
			return basicGetSecond();
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
		case AmnPackage.SEQUENTIAL_SUBTITUTION__FIRST:
			setFirst((Substitution) newValue);
			return;
		case AmnPackage.SEQUENTIAL_SUBTITUTION__SECOND:
			setSecond((Substitution) newValue);
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
		case AmnPackage.SEQUENTIAL_SUBTITUTION__FIRST:
			setFirst((Substitution) null);
			return;
		case AmnPackage.SEQUENTIAL_SUBTITUTION__SECOND:
			setSecond((Substitution) null);
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
		case AmnPackage.SEQUENTIAL_SUBTITUTION__FIRST:
			return first != null;
		case AmnPackage.SEQUENTIAL_SUBTITUTION__SECOND:
			return second != null;
		}
		return super.eIsSet(featureID);
	}

} //SequentialSubtitutionImpl
