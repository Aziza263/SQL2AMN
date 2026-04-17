/**
 */
package sQL2AMN.sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.InsertStatement#getTableName <em>Table Name</em>}</li>
 *   <li>{@link sQL2AMN.sql.InsertStatement#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.sql.SqlPackage#getInsertStatement()
 * @model
 * @generated
 */
public interface InsertStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see sQL2AMN.sql.SqlPackage#getInsertStatement_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.InsertStatement#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute list.
	 * @see sQL2AMN.sql.SqlPackage#getInsertStatement_Columns()
	 * @model
	 * @generated
	 */
	EList<String> getColumns();

} // InsertStatement
