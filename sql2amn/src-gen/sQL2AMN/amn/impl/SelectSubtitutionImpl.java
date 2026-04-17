/**
 */
package sQL2AMN.amn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sQL2AMN.amn.AmnPackage;
import sQL2AMN.amn.Expression;
import sQL2AMN.amn.SelectSubtitution;
import sQL2AMN.amn.Substitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Subtitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.impl.SelectSubtitutionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.SelectSubtitutionImpl#getThenBody <em>Then Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectSubtitutionImpl extends SubstitutionImpl implements SelectSubtitution {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getThenBody() <em>Then Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBody()
	 * @generated
	 * @ordered
	 */
	protected Substitution thenBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectSubtitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmnPackage.Literals.SELECT_SUBTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject) condition;
			condition = (Expression) eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.SELECT_SUBTITUTION__CONDITION,
							oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Expression newCondition) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.SELECT_SUBTITUTION__CONDITION,
					oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substitution getThenBody() {
		if (thenBody != null && thenBody.eIsProxy()) {
			InternalEObject oldThenBody = (InternalEObject) thenBody;
			thenBody = (Substitution) eResolveProxy(oldThenBody);
			if (thenBody != oldThenBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.SELECT_SUBTITUTION__THEN_BODY,
							oldThenBody, thenBody));
			}
		}
		return thenBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution basicGetThenBody() {
		return thenBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThenBody(Substitution newThenBody) {
		Substitution oldThenBody = thenBody;
		thenBody = newThenBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.SELECT_SUBTITUTION__THEN_BODY, oldThenBody,
					thenBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AmnPackage.SELECT_SUBTITUTION__CONDITION:
			if (resolve)
				return getCondition();
			return basicGetCondition();
		case AmnPackage.SELECT_SUBTITUTION__THEN_BODY:
			if (resolve)
				return getThenBody();
			return basicGetThenBody();
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
		case AmnPackage.SELECT_SUBTITUTION__CONDITION:
			setCondition((Expression) newValue);
			return;
		case AmnPackage.SELECT_SUBTITUTION__THEN_BODY:
			setThenBody((Substitution) newValue);
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
		case AmnPackage.SELECT_SUBTITUTION__CONDITION:
			setCondition((Expression) null);
			return;
		case AmnPackage.SELECT_SUBTITUTION__THEN_BODY:
			setThenBody((Substitution) null);
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
		case AmnPackage.SELECT_SUBTITUTION__CONDITION:
			return condition != null;
		case AmnPackage.SELECT_SUBTITUTION__THEN_BODY:
			return thenBody != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectSubtitutionImpl
