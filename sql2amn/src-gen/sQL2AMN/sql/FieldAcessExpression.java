/**
 */
package sQL2AMN.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Acess Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.FieldAcessExpression#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link sQL2AMN.sql.FieldAcessExpression#getFieldName <em>Field Name</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.sql.SqlPackage#getFieldAcessExpression()
 * @model
 * @generated
 */
public interface FieldAcessExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see sQL2AMN.sql.SqlPackage#getFieldAcessExpression_ObjectName()
	 * @model
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.FieldAcessExpression#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see sQL2AMN.sql.SqlPackage#getFieldAcessExpression_FieldName()
	 * @model
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.FieldAcessExpression#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

} // FieldAcessExpression
