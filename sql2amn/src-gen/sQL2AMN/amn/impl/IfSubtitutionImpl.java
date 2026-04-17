/**
 */
package sQL2AMN.amn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sQL2AMN.amn.AmnPackage;
import sQL2AMN.amn.Expression;
import sQL2AMN.amn.IfSubtitution;
import sQL2AMN.amn.Substitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Subtitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.impl.IfSubtitutionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.IfSubtitutionImpl#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.IfSubtitutionImpl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfSubtitutionImpl extends SubstitutionImpl implements IfSubtitution {
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
	 * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBody()
	 * @generated
	 * @ordered
	 */
	protected Substitution elseBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfSubtitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmnPackage.Literals.IF_SUBTITUTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.IF_SUBTITUTION__CONDITION,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.IF_SUBTITUTION__CONDITION, oldCondition,
					condition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.IF_SUBTITUTION__THEN_BODY,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.IF_SUBTITUTION__THEN_BODY, oldThenBody,
					thenBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substitution getElseBody() {
		if (elseBody != null && elseBody.eIsProxy()) {
			InternalEObject oldElseBody = (InternalEObject) elseBody;
			elseBody = (Substitution) eResolveProxy(oldElseBody);
			if (elseBody != oldElseBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.IF_SUBTITUTION__ELSE_BODY,
							oldElseBody, elseBody));
			}
		}
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution basicGetElseBody() {
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElseBody(Substitution newElseBody) {
		Substitution oldElseBody = elseBody;
		elseBody = newElseBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.IF_SUBTITUTION__ELSE_BODY, oldElseBody,
					elseBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AmnPackage.IF_SUBTITUTION__CONDITION:
			if (resolve)
				return getCondition();
			return basicGetCondition();
		case AmnPackage.IF_SUBTITUTION__THEN_BODY:
			if (resolve)
				return getThenBody();
			return basicGetThenBody();
		case AmnPackage.IF_SUBTITUTION__ELSE_BODY:
			if (resolve)
				return getElseBody();
			return basicGetElseBody();
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
		case AmnPackage.IF_SUBTITUTION__CONDITION:
			setCondition((Expression) newValue);
			return;
		case AmnPackage.IF_SUBTITUTION__THEN_BODY:
			setThenBody((Substitution) newValue);
			return;
		case AmnPackage.IF_SUBTITUTION__ELSE_BODY:
			setElseBody((Substitution) newValue);
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
		case AmnPackage.IF_SUBTITUTION__CONDITION:
			setCondition((Expression) null);
			return;
		case AmnPackage.IF_SUBTITUTION__THEN_BODY:
			setThenBody((Substitution) null);
			return;
		case AmnPackage.IF_SUBTITUTION__ELSE_BODY:
			setElseBody((Substitution) null);
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
		case AmnPackage.IF_SUBTITUTION__CONDITION:
			return condition != null;
		case AmnPackage.IF_SUBTITUTION__THEN_BODY:
			return thenBody != null;
		case AmnPackage.IF_SUBTITUTION__ELSE_BODY:
			return elseBody != null;
		}
		return super.eIsSet(featureID);
	}

} //IfSubtitutionImpl
