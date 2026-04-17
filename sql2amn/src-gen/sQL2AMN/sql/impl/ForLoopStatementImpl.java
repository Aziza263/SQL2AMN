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

import sQL2AMN.sql.ForLoopStatement;
import sQL2AMN.sql.SqlPackage;
import sQL2AMN.sql.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.impl.ForLoopStatementImpl#getLoopVar <em>Loop Var</em>}</li>
 *   <li>{@link sQL2AMN.sql.impl.ForLoopStatementImpl#getFromTable <em>From Table</em>}</li>
 *   <li>{@link sQL2AMN.sql.impl.ForLoopStatementImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForLoopStatementImpl extends StatementImpl implements ForLoopStatement {
	/**
	 * The default value of the '{@link #getLoopVar() <em>Loop Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVar()
	 * @generated
	 * @ordered
	 */
	protected static final String LOOP_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopVar() <em>Loop Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVar()
	 * @generated
	 * @ordered
	 */
	protected String loopVar = LOOP_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromTable() <em>From Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTable()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTable() <em>From Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTable()
	 * @generated
	 * @ordered
	 */
	protected String fromTable = FROM_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.FOR_LOOP_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoopVar() {
		return loopVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopVar(String newLoopVar) {
		String oldLoopVar = loopVar;
		loopVar = newLoopVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.FOR_LOOP_STATEMENT__LOOP_VAR, oldLoopVar,
					loopVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromTable() {
		return fromTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromTable(String newFromTable) {
		String oldFromTable = fromTable;
		fromTable = newFromTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.FOR_LOOP_STATEMENT__FROM_TABLE,
					oldFromTable, fromTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Statement>(Statement.class, this, SqlPackage.FOR_LOOP_STATEMENT__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SqlPackage.FOR_LOOP_STATEMENT__BODY:
			return ((InternalEList<?>) getBody()).basicRemove(otherEnd, msgs);
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
		case SqlPackage.FOR_LOOP_STATEMENT__LOOP_VAR:
			return getLoopVar();
		case SqlPackage.FOR_LOOP_STATEMENT__FROM_TABLE:
			return getFromTable();
		case SqlPackage.FOR_LOOP_STATEMENT__BODY:
			return getBody();
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
		case SqlPackage.FOR_LOOP_STATEMENT__LOOP_VAR:
			setLoopVar((String) newValue);
			return;
		case SqlPackage.FOR_LOOP_STATEMENT__FROM_TABLE:
			setFromTable((String) newValue);
			return;
		case SqlPackage.FOR_LOOP_STATEMENT__BODY:
			getBody().clear();
			getBody().addAll((Collection<? extends Statement>) newValue);
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
		case SqlPackage.FOR_LOOP_STATEMENT__LOOP_VAR:
			setLoopVar(LOOP_VAR_EDEFAULT);
			return;
		case SqlPackage.FOR_LOOP_STATEMENT__FROM_TABLE:
			setFromTable(FROM_TABLE_EDEFAULT);
			return;
		case SqlPackage.FOR_LOOP_STATEMENT__BODY:
			getBody().clear();
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
		case SqlPackage.FOR_LOOP_STATEMENT__LOOP_VAR:
			return LOOP_VAR_EDEFAULT == null ? loopVar != null : !LOOP_VAR_EDEFAULT.equals(loopVar);
		case SqlPackage.FOR_LOOP_STATEMENT__FROM_TABLE:
			return FROM_TABLE_EDEFAULT == null ? fromTable != null : !FROM_TABLE_EDEFAULT.equals(fromTable);
		case SqlPackage.FOR_LOOP_STATEMENT__BODY:
			return body != null && !body.isEmpty();
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
		result.append(" (loopVar: ");
		result.append(loopVar);
		result.append(", fromTable: ");
		result.append(fromTable);
		result.append(')');
		return result.toString();
	}

} //ForLoopStatementImpl
