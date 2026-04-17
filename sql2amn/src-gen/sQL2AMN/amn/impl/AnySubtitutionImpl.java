/**
 */
package sQL2AMN.amn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sQL2AMN.amn.AmnPackage;
import sQL2AMN.amn.AnySubtitution;
import sQL2AMN.amn.Expression;
import sQL2AMN.amn.Substitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Subtitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.impl.AnySubtitutionImpl#getBoundVar <em>Bound Var</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.AnySubtitutionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sQL2AMN.amn.impl.AnySubtitutionImpl#getThenBody <em>Then Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnySubtitutionImpl extends SubstitutionImpl implements AnySubtitution {
	/**
	 * The default value of the '{@link #getBoundVar() <em>Bound Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundVar()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundVar() <em>Bound Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundVar()
	 * @generated
	 * @ordered
	 */
	protected String boundVar = BOUND_VAR_EDEFAULT;

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
	protected AnySubtitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmnPackage.Literals.ANY_SUBTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBoundVar() {
		return boundVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundVar(String newBoundVar) {
		String oldBoundVar = boundVar;
		boundVar = newBoundVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.ANY_SUBTITUTION__BOUND_VAR, oldBoundVar,
					boundVar));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.ANY_SUBTITUTION__CONDITION,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.ANY_SUBTITUTION__CONDITION, oldCondition,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmnPackage.ANY_SUBTITUTION__THEN_BODY,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmnPackage.ANY_SUBTITUTION__THEN_BODY, oldThenBody,
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
		case AmnPackage.ANY_SUBTITUTION__BOUND_VAR:
			return getBoundVar();
		case AmnPackage.ANY_SUBTITUTION__CONDITION:
			if (resolve)
				return getCondition();
			return basicGetCondition();
		case AmnPackage.ANY_SUBTITUTION__THEN_BODY:
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
		case AmnPackage.ANY_SUBTITUTION__BOUND_VAR:
			setBoundVar((String) newValue);
			return;
		case AmnPackage.ANY_SUBTITUTION__CONDITION:
			setCondition((Expression) newValue);
			return;
		case AmnPackage.ANY_SUBTITUTION__THEN_BODY:
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
		case AmnPackage.ANY_SUBTITUTION__BOUND_VAR:
			setBoundVar(BOUND_VAR_EDEFAULT);
			return;
		case AmnPackage.ANY_SUBTITUTION__CONDITION:
			setCondition((Expression) null);
			return;
		case AmnPackage.ANY_SUBTITUTION__THEN_BODY:
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
		case AmnPackage.ANY_SUBTITUTION__BOUND_VAR:
			return BOUND_VAR_EDEFAULT == null ? boundVar != null : !BOUND_VAR_EDEFAULT.equals(boundVar);
		case AmnPackage.ANY_SUBTITUTION__CONDITION:
			return condition != null;
		case AmnPackage.ANY_SUBTITUTION__THEN_BODY:
			return thenBody != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (boundVar: ");
		result.append(boundVar);
		result.append(')');
		return result.toString();
	}

} //AnySubtitutionImpl
