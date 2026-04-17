/**
 */
package sQL2AMN.sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sQL2AMN.sql.Expression;
import sQL2AMN.sql.IfStatement;
import sQL2AMN.sql.SqlPackage;
import sQL2AMN.sql.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.impl.IfStatementImpl#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link sQL2AMN.sql.impl.IfStatementImpl#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link sQL2AMN.sql.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getThenBranch() <em>Then Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> thenBranch;

	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elseBranch;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getThenBranch() {
		if (thenBranch == null) {
			thenBranch = new EObjectContainmentEList<Statement>(Statement.class, this,
					SqlPackage.IF_STATEMENT__THEN_BRANCH);
		}
		return thenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getElseBranch() {
		if (elseBranch == null) {
			elseBranch = new EObjectContainmentEList<Statement>(Statement.class, this,
					SqlPackage.IF_STATEMENT__ELSE_BRANCH);
		}
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SqlPackage.IF_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SqlPackage.IF_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SqlPackage.IF_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.IF_STATEMENT__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SqlPackage.IF_STATEMENT__THEN_BRANCH:
			return ((InternalEList<?>) getThenBranch()).basicRemove(otherEnd, msgs);
		case SqlPackage.IF_STATEMENT__ELSE_BRANCH:
			return ((InternalEList<?>) getElseBranch()).basicRemove(otherEnd, msgs);
		case SqlPackage.IF_STATEMENT__CONDITION:
			return basicSetCondition(null, msgs);
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
		case SqlPackage.IF_STATEMENT__THEN_BRANCH:
			return getThenBranch();
		case SqlPackage.IF_STATEMENT__ELSE_BRANCH:
			return getElseBranch();
		case SqlPackage.IF_STATEMENT__CONDITION:
			return getCondition();
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
		case SqlPackage.IF_STATEMENT__THEN_BRANCH:
			getThenBranch().clear();
			getThenBranch().addAll((Collection<? extends Statement>) newValue);
			return;
		case SqlPackage.IF_STATEMENT__ELSE_BRANCH:
			getElseBranch().clear();
			getElseBranch().addAll((Collection<? extends Statement>) newValue);
			return;
		case SqlPackage.IF_STATEMENT__CONDITION:
			setCondition((Expression) newValue);
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
		case SqlPackage.IF_STATEMENT__THEN_BRANCH:
			getThenBranch().clear();
			return;
		case SqlPackage.IF_STATEMENT__ELSE_BRANCH:
			getElseBranch().clear();
			return;
		case SqlPackage.IF_STATEMENT__CONDITION:
			setCondition((Expression) null);
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
		case SqlPackage.IF_STATEMENT__THEN_BRANCH:
			return thenBranch != null && !thenBranch.isEmpty();
		case SqlPackage.IF_STATEMENT__ELSE_BRANCH:
			return elseBranch != null && !elseBranch.isEmpty();
		case SqlPackage.IF_STATEMENT__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
