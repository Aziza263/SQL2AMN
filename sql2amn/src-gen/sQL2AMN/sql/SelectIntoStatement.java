/**
 */
package sQL2AMN.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Into Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.SelectIntoStatement#getTargetVar <em>Target Var</em>}</li>
 *   <li>{@link sQL2AMN.sql.SelectIntoStatement#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link sQL2AMN.sql.SelectIntoStatement#getFromTable <em>From Table</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.sql.SqlPackage#getSelectIntoStatement()
 * @model
 * @generated
 */
public interface SelectIntoStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Target Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Var</em>' attribute.
	 * @see #setTargetVar(String)
	 * @see sQL2AMN.sql.SqlPackage#getSelectIntoStatement_TargetVar()
	 * @model
	 * @generated
	 */
	String getTargetVar();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.SelectIntoStatement#getTargetVar <em>Target Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Var</em>' attribute.
	 * @see #getTargetVar()
	 * @generated
	 */
	void setTargetVar(String value);

	/**
	 * Returns the value of the '<em><b>Source Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Column</em>' attribute.
	 * @see #setSourceColumn(String)
	 * @see sQL2AMN.sql.SqlPackage#getSelectIntoStatement_SourceColumn()
	 * @model
	 * @generated
	 */
	String getSourceColumn();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.SelectIntoStatement#getSourceColumn <em>Source Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Column</em>' attribute.
	 * @see #getSourceColumn()
	 * @generated
	 */
	void setSourceColumn(String value);

	/**
	 * Returns the value of the '<em><b>From Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Table</em>' attribute.
	 * @see #setFromTable(String)
	 * @see sQL2AMN.sql.SqlPackage#getSelectIntoStatement_FromTable()
	 * @model
	 * @generated
	 */
	String getFromTable();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.SelectIntoStatement#getFromTable <em>From Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Table</em>' attribute.
	 * @see #getFromTable()
	 * @generated
	 */
	void setFromTable(String value);

} // SelectIntoStatement
