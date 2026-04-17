/**
 */
package sQL2AMN.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.CreateTableStatement#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.sql.SqlPackage#getCreateTableStatement()
 * @model
 * @generated
 */
public interface CreateTableStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see sQL2AMN.sql.SqlPackage#getCreateTableStatement_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.CreateTableStatement#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // CreateTableStatement
