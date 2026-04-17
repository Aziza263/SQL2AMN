/**
 */
package sQL2AMN.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sQL2AMN.sql.SelectIntoStatement;
import sQL2AMN.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Into Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.impl.SelectIntoStatementImpl#getTargetVar <em>Target Var</em>}</li>
 *   <li>{@link sQL2AMN.sql.impl.SelectIntoStatementImpl#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link sQL2AMN.sql.impl.SelectIntoStatementImpl#getFromTable <em>From Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectIntoStatementImpl extends StatementImpl implements SelectIntoStatement {
	/**
	 * The default value of the '{@link #getTargetVar() <em>Target Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVar()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetVar() <em>Target Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVar()
	 * @generated
	 * @ordered
	 */
	protected String targetVar = TARGET_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceColumn() <em>Source Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceColumn() <em>Source Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumn()
	 * @generated
	 * @ordered
	 */
	protected String sourceColumn = SOURCE_COLUMN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectIntoStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.SELECT_INTO_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetVar() {
		return targetVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetVar(String newTargetVar) {
		String oldTargetVar = targetVar;
		targetVar = newTargetVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.SELECT_INTO_STATEMENT__TARGET_VAR,
					oldTargetVar, targetVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceColumn() {
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceColumn(String newSourceColumn) {
		String oldSourceColumn = sourceColumn;
		sourceColumn = newSourceColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.SELECT_INTO_STATEMENT__SOURCE_COLUMN,
					oldSourceColumn, sourceColumn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.SELECT_INTO_STATEMENT__FROM_TABLE,
					oldFromTable, fromTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SqlPackage.SELECT_INTO_STATEMENT__TARGET_VAR:
			return getTargetVar();
		case SqlPackage.SELECT_INTO_STATEMENT__SOURCE_COLUMN:
			return getSourceColumn();
		case SqlPackage.SELECT_INTO_STATEMENT__FROM_TABLE:
			return getFromTable();
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
		case SqlPackage.SELECT_INTO_STATEMENT__TARGET_VAR:
			setTargetVar((String) newValue);
			return;
		case SqlPackage.SELECT_INTO_STATEMENT__SOURCE_COLUMN:
			setSourceColumn((String) newValue);
			return;
		case SqlPackage.SELECT_INTO_STATEMENT__FROM_TABLE:
			setFromTable((String) newValue);
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
		case SqlPackage.SELECT_INTO_STATEMENT__TARGET_VAR:
			setTargetVar(TARGET_VAR_EDEFAULT);
			return;
		case SqlPackage.SELECT_INTO_STATEMENT__SOURCE_COLUMN:
			setSourceColumn(SOURCE_COLUMN_EDEFAULT);
			return;
		case SqlPackage.SELECT_INTO_STATEMENT__FROM_TABLE:
			setFromTable(FROM_TABLE_EDEFAULT);
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
		case SqlPackage.SELECT_INTO_STATEMENT__TARGET_VAR:
			return TARGET_VAR_EDEFAULT == null ? targetVar != null : !TARGET_VAR_EDEFAULT.equals(targetVar);
		case SqlPackage.SELECT_INTO_STATEMENT__SOURCE_COLUMN:
			return SOURCE_COLUMN_EDEFAULT == null ? sourceColumn != null : !SOURCE_COLUMN_EDEFAULT.equals(sourceColumn);
		case SqlPackage.SELECT_INTO_STATEMENT__FROM_TABLE:
			return FROM_TABLE_EDEFAULT == null ? fromTable != null : !FROM_TABLE_EDEFAULT.equals(fromTable);
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
		result.append(" (targetVar: ");
		result.append(targetVar);
		result.append(", sourceColumn: ");
		result.append(sourceColumn);
		result.append(", fromTable: ");
		result.append(fromTable);
		result.append(')');
		return result.toString();
	}

} //SelectIntoStatementImpl
